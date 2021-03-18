package br.com.mcos.pix.registra;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lbr/com/mcos/pix/registra/NovaChavePixService;", "", "repository", "Lbr/com/mcos/pix/ChavePixRepository;", "itauClient", "Lbr/com/mcos/integration/ContasDeClientesNoItauClient;", "(Lbr/com/mcos/pix/ChavePixRepository;Lbr/com/mcos/integration/ContasDeClientesNoItauClient;)V", "LOGGER", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getItauClient", "()Lbr/com/mcos/integration/ContasDeClientesNoItauClient;", "getRepository", "()Lbr/com/mcos/pix/ChavePixRepository;", "registra", "Lbr/com/mcos/pix/ChavePix;", "novaChave", "Lbr/com/mcos/pix/registra/NovaChavePix;", "keymanagerGrpc"})
@javax.inject.Singleton
@io.micronaut.validation.Validated
public class NovaChavePixService {
    private final org.slf4j.Logger LOGGER = null;
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.mcos.pix.ChavePixRepository repository = null;
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.mcos.integration.ContasDeClientesNoItauClient itauClient = null;
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    public br.com.mcos.pix.ChavePix registra(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    br.com.mcos.pix.registra.NovaChavePix novaChave) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.mcos.pix.ChavePixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.mcos.integration.ContasDeClientesNoItauClient getItauClient() {
        return null;
    }
    
    public NovaChavePixService(@org.jetbrains.annotations.NotNull
    br.com.mcos.pix.ChavePixRepository repository, @org.jetbrains.annotations.NotNull
    br.com.mcos.integration.ContasDeClientesNoItauClient itauClient) {
        super();
    }
}