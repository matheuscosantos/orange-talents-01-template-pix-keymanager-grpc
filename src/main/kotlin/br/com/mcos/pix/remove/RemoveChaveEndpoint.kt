package br.com.mcos.pix.remove

import br.com.mcos.KeymanagerRegistraGrpcServiceGrpc
import br.com.mcos.KeymanagerRemoveGrpcServiceGrpc
import br.com.mcos.RemoveChavePixRequest
import br.com.mcos.RemoveChavePixResponse
import br.com.mcos.shared.grpc.ErrorHandler
import io.grpc.stub.StreamObserver
import javax.inject.Inject
import javax.inject.Singleton

@ErrorHandler // Caso gere algum erro ou exceção será capturada e tratada pelo handler
@Singleton
class RemoveChaveEndpoint(@Inject private val service: RemoveChaveService,)
    : KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceImplBase(){

    override fun remove(
        request: RemoveChavePixRequest,
        responseObserver: StreamObserver<RemoveChavePixResponse>
    ) {

        service.remove(clienteId = request.clienteId, pixId = request.pixId)

        responseObserver.onNext(RemoveChavePixResponse.newBuilder()
            .setClienteId(request.clienteId)
            .setPixId(request.pixId)
            .build())
        responseObserver.onCompleted()
    }
}