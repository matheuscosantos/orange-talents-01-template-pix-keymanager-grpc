package br.com.zup.edu.pix.remove

import br.com.zup.edu.integration.bcb.BancoCentralClient
import br.com.zup.edu.integration.bcb.DeletePixKeyRequest
import br.com.zup.edu.pix.ChavePixNaoEncontradaException
import br.com.zup.edu.pix.ChavePixRepository
import br.com.zup.edu.shared.validation.ValidUUID
import io.micronaut.http.HttpStatus
import io.micronaut.validation.Validated
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional
import javax.validation.constraints.NotBlank

@Validated
@Singleton
class RemoveChaveService(
    @Inject val repository: ChavePixRepository,
    @Inject val bcbClient: BancoCentralClient,
) {

    @Transactional
    fun remove(
        @NotBlank @ValidUUID clienteId: String?,
        @NotBlank @ValidUUID pixId: String?,
    ) {

        val uuidPixId = UUID.fromString(pixId)
        val uuidClienteId = UUID.fromString(clienteId)

        val chave = repository.findByIdAndClienteId(uuidPixId, uuidClienteId)
            .orElseThrow { ChavePixNaoEncontradaException("Chave Pix não encontrada ou não pertence ao cliente") }

        repository.delete(chave)

        val request = DeletePixKeyRequest(chave.chave)

        val bcbResponse = bcbClient.delete(key = chave.chave, request = request)
        if (bcbResponse.status != HttpStatus.OK) {
            throw IllegalStateException("Erro ao remover chave Pix no Banco Central do Brasil (BCB)")
        }
    }

}