package br.com.mcos.pix.registra

import br.com.mcos.integration.bcb.BancoCentralClient
import br.com.mcos.integration.bcb.CreatePixKeyRequest
import br.com.mcos.pix.ChavePix
import br.com.mcos.pix.ChavePixExistenteException
import br.com.mcos.pix.ChavePixRepository
import br.com.mcos.integration.itau.ContasDeClientesNoItauClient
import io.micronaut.http.HttpStatus
import io.micronaut.validation.Validated
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Singleton
class NovaChavePixService(
    @Inject val repository: ChavePixRepository,
    @Inject val itauClient: ContasDeClientesNoItauClient,
    @Inject val bcbClient: BancoCentralClient
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
        repository.save(chave)


//      ************* Registrando a chave Pix no BCB *************
        val bcbRequest = CreatePixKeyRequest
            .of(chave)
            .also {
                LOGGER.info("Registrando chave Pix no Banco Central do Brasil (BCB): $it")
            }

//        Acessa a API do Banco Central do Brasil
        val bcbResponse = bcbClient.create(bcbRequest)
        if (bcbResponse.status != HttpStatus.CREATED)
            throw IllegalStateException("Erro ao registrar chave Pix no Banco Central do Brasil (BCB).")

//        Atualiza a chave pix com a vinda do Banco Central do Brasil
        chave.atualiza(bcbResponse.body()!!.key)

        return chave
    }
}