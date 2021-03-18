package br.com.mcos.pix.registra

import br.com.mcos.pix.ChavePix
import br.com.mcos.pix.ChavePixExistenteException
import br.com.mcos.pix.ChavePixRepository
import br.com.mcos.integration.ContasDeClientesNoItauClient
import io.micronaut.validation.Validated
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Singleton
class NovaChavePixService(@Inject val repository: ChavePixRepository,
                          @Inject val itauClient: ContasDeClientesNoItauClient,
) {

    private val LOGGER = LoggerFactory.getLogger(this::class.java)

    @Transactional
    /**
     * Registra a nova chave pix no banco de dados,
     * caso a persistência seja bem sucedida retorna
     * o objeto ChavePix, que contem o que foi salvo.
     */
    fun registra(@Valid novaChave: NovaChavePix): ChavePix {

//        Caso a chave já exista lança ChavePixExistenteException
        if (repository.existsByChave(novaChave.chave))
            throw ChavePixExistenteException("Chave Pix '${novaChave.chave}' existente.")

//        Busca a conta utilizando o Client Http,
        val response = itauClient.buscaContaPorTipo(novaChave.clienteId!!, novaChave.tipoDeConta!!.name)

//        Transforma o corpo do request em um objeto de ContaAssociada,
//        Caso o cliente não for encontrado lança IllegalStateException
        val conta = response.body()?.toModel() ?: throw IllegalStateException("Cliente não encontrado no Itaú")

//        Transforma o objeto NovaChavePix em ChavePix
        val chave = novaChave.toModel(conta)

//        Salva e retorna a chavePix
        return repository.save(chave)
    }
}