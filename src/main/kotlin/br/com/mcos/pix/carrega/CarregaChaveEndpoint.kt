package br.com.mcos.pix.carrega

import br.com.mcos.CarregaChavePixRequest
import br.com.mcos.CarregaChavePixResponse
import br.com.mcos.KeymanagerCarregaGrpcServiceGrpc
import br.com.mcos.integration.bcb.BancoCentralClient
import br.com.mcos.pix.ChavePixRepository
import br.com.mcos.shared.grpc.ErrorHandler
import br.com.zup.edu.pix.carrega.toModel
import io.grpc.stub.StreamObserver
import javax.inject.Inject
import javax.inject.Singleton
import javax.validation.Validator

@ErrorHandler
@Singleton
class CarregaChaveEndpoint(
    @Inject private val repository: ChavePixRepository,
    @Inject private val bcbClient: BancoCentralClient,
    @Inject private val validator: Validator,
) : KeymanagerCarregaGrpcServiceGrpc.KeymanagerCarregaGrpcServiceImplBase() {

    override fun carrega(
        request: CarregaChavePixRequest,
        responseObserver: StreamObserver<CarregaChavePixResponse>, // 1
    ) {

        val filtro = request.toModel(validator)
        val chaveInfo = filtro.filtra(repository = repository, bcbClient = bcbClient)

        responseObserver.onNext(CarregaChavePixResponseConverter().convert(chaveInfo))
        responseObserver.onCompleted()
    }
}