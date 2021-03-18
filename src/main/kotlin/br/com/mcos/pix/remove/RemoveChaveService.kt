package br.com.mcos.pix.remove

import br.com.mcos.pix.ChavePixNaoEncontradaException
import br.com.mcos.pix.ChavePixRepository
import br.com.mcos.shared.validation.ValidUUID
import io.micronaut.validation.Validated
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional
import javax.validation.constraints.NotBlank

@Validated
@Singleton
class RemoveChaveService(@Inject val repository: ChavePixRepository) {

    @Transactional
    fun remove(
        @NotBlank @ValidUUID(message = "cliente ID com formato inválido") clienteId: String?,
        @NotBlank @ValidUUID(message = "pix ID com formato inválido") pixId: String?,
    ){

        val uuidClienteId = UUID.fromString(clienteId)
        val uuidPixId = UUID.fromString(pixId)

        val chave = repository.findByIdAndClienteId(uuidPixId, uuidClienteId)
            .orElseThrow{ ChavePixNaoEncontradaException("Chave pix não encontrada ou não pertence ao cliente.")}

        repository.deleteById(uuidPixId)
    }

}
