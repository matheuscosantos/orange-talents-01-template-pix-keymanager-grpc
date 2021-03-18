package br.com.mcos.pix.registra;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/mcos/pix/registra/RegistraChaveEndpoint;", "Lbr/com/mcos/KeymanagerRegistraGrpcServiceGrpc$KeymanagerRegistraGrpcServiceImplBase;", "service", "Lbr/com/mcos/pix/registra/NovaChavePixService;", "(Lbr/com/mcos/pix/registra/NovaChavePixService;)V", "registra", "", "request", "Lbr/com/mcos/RegistraChavePixRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/mcos/RegistraChavePixResponse;", "keymanagerGrpc"})
@javax.inject.Singleton
@br.com.mcos.shared.grpc.ErrorHandler
public class RegistraChaveEndpoint extends br.com.mcos.KeymanagerRegistraGrpcServiceGrpc.KeymanagerRegistraGrpcServiceImplBase {
    @javax.inject.Inject
    private final br.com.mcos.pix.registra.NovaChavePixService service = null;
    
    @java.lang.Override
    public void registra(@org.jetbrains.annotations.NotNull
    br.com.mcos.RegistraChavePixRequest request, @org.jetbrains.annotations.NotNull
    io.grpc.stub.StreamObserver<br.com.mcos.RegistraChavePixResponse> responseObserver) {
    }
    
    public RegistraChaveEndpoint(@org.jetbrains.annotations.NotNull
    br.com.mcos.pix.registra.NovaChavePixService service) {
        super();
    }
}