package br.com.mcos.shared.grpc.handlers;

import java.lang.System;

/**
 * By design, this class must NOT be managed by Micronaut
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0014\u0010\b\u001a\u00020\t2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016\u00a8\u0006\n"}, d2 = {"Lbr/com/mcos/shared/grpc/handlers/DefaultExceptionHandler;", "Lbr/com/mcos/shared/grpc/ExceptionHandler;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "handle", "Lbr/com/mcos/shared/grpc/ExceptionHandler$StatusWithDetails;", "e", "supports", "", "keymanagerGrpc"})
public final class DefaultExceptionHandler implements br.com.mcos.shared.grpc.ExceptionHandler<java.lang.Exception> {
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.mcos.shared.grpc.ExceptionHandler.StatusWithDetails handle(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
        return null;
    }
    
    @java.lang.Override
    public boolean supports(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
        return false;
    }
    
    public DefaultExceptionHandler() {
        super();
    }
}