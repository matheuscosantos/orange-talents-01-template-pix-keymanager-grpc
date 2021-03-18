package br.com.mcos.integration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lbr/com/mcos/integration/ContasDeClientesNoItauClient;", "", "buscaContaPorTipo", "Lio/micronaut/http/HttpResponse;", "Lbr/com/mcos/integration/DadosDaContaResponse;", "clienteId", "", "tipo", "keymanagerGrpc"})
@io.micronaut.http.client.annotation.Client(value = "${itau.contas.url}")
public abstract interface ContasDeClientesNoItauClient {
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/api/v1/clientes/{clienteId}/contas{?tipo}")
    public abstract io.micronaut.http.HttpResponse<br.com.mcos.integration.DadosDaContaResponse> buscaContaPorTipo(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String clienteId, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.QueryValue
    java.lang.String tipo);
}