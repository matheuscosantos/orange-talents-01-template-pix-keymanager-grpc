package br.com.mcos.shared.grpc.handlers;

import java.lang.System;

/**
 * The idea of this handler is to deal with database constraints errors, like unique or FK constraints for example
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u0012j\u0002`\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0014"}, d2 = {"Lbr/com/mcos/shared/grpc/handlers/DataIntegrityExceptionHandler;", "Lbr/com/mcos/shared/grpc/ExceptionHandler;", "Lorg/hibernate/exception/ConstraintViolationException;", "messageSource", "Lio/micronaut/context/MessageSource;", "(Lio/micronaut/context/MessageSource;)V", "getMessageSource", "()Lio/micronaut/context/MessageSource;", "setMessageSource", "alreadyExistsError", "Lbr/com/mcos/shared/grpc/ExceptionHandler$StatusWithDetails;", "message", "", "e", "handle", "internalServerError", "supports", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "keymanagerGrpc"})
@javax.inject.Singleton
public final class DataIntegrityExceptionHandler implements br.com.mcos.shared.grpc.ExceptionHandler<org.hibernate.exception.ConstraintViolationException> {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private io.micronaut.context.MessageSource messageSource;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.mcos.shared.grpc.ExceptionHandler.StatusWithDetails handle(@org.jetbrains.annotations.NotNull
    org.hibernate.exception.ConstraintViolationException e) {
        return null;
    }
    
    @java.lang.Override
    public boolean supports(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
        return false;
    }
    
    private final br.com.mcos.shared.grpc.ExceptionHandler.StatusWithDetails alreadyExistsError(java.lang.String message, org.hibernate.exception.ConstraintViolationException e) {
        return null;
    }
    
    private final br.com.mcos.shared.grpc.ExceptionHandler.StatusWithDetails internalServerError(org.hibernate.exception.ConstraintViolationException e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.context.MessageSource getMessageSource() {
        return null;
    }
    
    public final void setMessageSource(@org.jetbrains.annotations.NotNull
    io.micronaut.context.MessageSource p0) {
    }
    
    public DataIntegrityExceptionHandler(@org.jetbrains.annotations.NotNull
    io.micronaut.context.MessageSource messageSource) {
        super();
    }
}