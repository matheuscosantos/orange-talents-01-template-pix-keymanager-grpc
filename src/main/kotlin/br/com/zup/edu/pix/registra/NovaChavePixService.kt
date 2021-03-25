package br.com.zup.edu.pix.registra

import br.com.zup.edu.integration.bcb.BancoCentralClient
import br.com.zup.edu.integration.bcb.CreatePixKeyRequest
import br.com.zup.edu.integration.itau.ContasDeClientesNoItauClient
import br.com.zup.edu.pix.ChavePix
import br.com.zup.edu.pix.ChavePixExistenteException
import br.com.zup.edu.pix.ChavePixRepository
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
    @Inject val bcbClient: BancoCentralClient,
) {

    private val LOGGER = LoggerFactory.getLogger(this::class.java)

    @Transactional
    fun registra(@Valid novaChave: NovaChavePix): ChavePix {

        if (repository.existsByChave(novaChave.chave))
            throw ChavePixExistenteException("Chave Pix '${novaChave.chave}' existente")

        val response = itauClient.buscaContaPorTipo(novaChave.clienteId!!, novaChave.tipoDeConta!!.name)
        val conta = response.body()?.toModel() ?: throw IllegalStateException("Cliente não encontrado no Itau")

        val chave = novaChave.toModel(conta)
        repository.save(chave)

        val bcbRequest = CreatePixKeyRequest.of(chave).also {
            LOGGER.info("Registrando chave Pix no Banco Central do Brasil (BCB): $it")
        }

        val bcbResponse = bcbClient.create(bcbRequest)
        if (bcbResponse.status != HttpStatus.CREATED)
            throw IllegalStateException("Erro ao registrar chave Pix no Banco Central do Brasil (BCB)")

        chave.atualiza(bcbResponse.body()!!.key)

        return chave
    }

}