package br.com.mcos.integration.itau

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

@Client("\${itau.contas.url}")
interface ContasDeClientesNoItauClient {

    /**
     * Busca uma conta na API ERP Itaú,
     * Sendo necessário o ID do cliente e o tipo da conta,
     * ex:
     * *  clienteID = c56dfef4-7901-44fb-84e2-a2cefb112890
     * * tipo = CONTA_CORRENTE
     */
    @Get("/api/v1/clientes/{clienteId}/contas{?tipo}")
    fun buscaContaPorTipo(@PathVariable clienteId: String, @QueryValue tipo: String): HttpResponse<DadosDaContaResponse>

}