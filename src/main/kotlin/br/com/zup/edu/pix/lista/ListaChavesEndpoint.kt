package br.com.zup.edu.pix.lista

import br.com.zup.edu.grpc.KeymanagerListaGrpcServiceGrpc
import br.com.zup.edu.grpc.ListaChavesPixRequest
import br.com.zup.edu.grpc.ListaChavesPixResponse
import br.com.zup.edu.pix.ChavePixRepository
import br.com.zup.edu.shared.grpc.ErrorHandler
import com.google.protobuf.Timestamp
import io.grpc.stub.StreamObserver
import java.lang.IllegalArgumentException
import java.time.ZoneId
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@ErrorHandler
@Singleton
class ListaChavesEndpoint(@Inject private val repository: ChavePixRepository)
    : KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceImplBase() {

    override fun lista(
        request: ListaChavesPixRequest,
        responseObserver: StreamObserver<ListaChavesPixResponse>,
    ) {

        if (request.clienteId.isNullOrBlank())
            throw IllegalArgumentException("Cliente ID não pode ser nulo ou vazio")

        val clienteId = UUID.fromString(request.clienteId)
        val chaves = repository.findAllByClienteId(clienteId).map {
            ListaChavesPixResponse.ChavePix.newBuilder()
                .setPixId(it.id.toString())
                .setTipo(br.com.zup.edu.grpc.TipoDeChave.valueOf(it.tipo.name))
                .setChave(it.chave)
                .setTipoDeConta(br.com.zup.edu.grpc.TipoDeConta.valueOf(it.tipoDeConta.name))
                .setCriadaEm(it.criadaEm.let {
                    val createdAt = it.atZone(ZoneId.of("UTC")).toInstant()
                    Timestamp.newBuilder()
                        .setSeconds(createdAt.epochSecond)
                        .setNanos(createdAt.nano)
                        .build()
                })
                .build()
        }

        responseObserver.onNext(ListaChavesPixResponse.newBuilder() // 1
                                    .setClienteId(clienteId.toString())
                                    .addAllChaves(chaves)
                                    .build())
        responseObserver.onCompleted()
    }

}