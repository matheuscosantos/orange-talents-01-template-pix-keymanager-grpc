package br.com.zup.edu.pix.carrega

import br.com.zup.edu.pix.ChavePixRepository
import br.com.zup.edu.integration.bcb.BancoCentralClient
import br.com.zup.edu.grpc.CarregaChavePixRequest
import br.com.zup.edu.grpc.CarregaChavePixResponse
import br.com.zup.edu.grpc.KeymanagerCarregaGrpcServiceGrpc
import br.com.zup.edu.shared.grpc.ErrorHandler
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
        responseObserver: StreamObserver<CarregaChavePixResponse>,
    ) {

        val filtro = request.toModel(validator)
        val chaveInfo = filtro.filtra(repository = repository, bcbClient = bcbClient)

        responseObserver.onNext(CarregaChavePixResponseConverter().convert(chaveInfo))
        responseObserver.onCompleted()
    }
}