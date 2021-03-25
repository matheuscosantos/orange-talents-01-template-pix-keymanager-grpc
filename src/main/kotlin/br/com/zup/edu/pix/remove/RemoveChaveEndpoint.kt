package br.com.zup.edu.pix.remove

import br.com.zup.edu.grpc.KeymanagerRemoveGrpcServiceGrpc
import br.com.zup.edu.grpc.RemoveChavePixRequest
import br.com.zup.edu.grpc.RemoveChavePixResponse
import br.com.zup.edu.shared.grpc.ErrorHandler
import io.grpc.stub.StreamObserver
import javax.inject.Inject
import javax.inject.Singleton

@ErrorHandler
@Singleton
class RemoveChaveEndpoint(@Inject private val service: RemoveChaveService) :
    KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceImplBase() {

    override fun remove(
        request: RemoveChavePixRequest,
        responseObserver: StreamObserver<RemoveChavePixResponse>,
    ) {

        service.remove(clienteId = request.clienteId, pixId = request.pixId)

        responseObserver.onNext(
            RemoveChavePixResponse.newBuilder()
                .setClienteId(request.clienteId)
                .setPixId(request.pixId)
                .build()
        )
        responseObserver.onCompleted()
    }

}