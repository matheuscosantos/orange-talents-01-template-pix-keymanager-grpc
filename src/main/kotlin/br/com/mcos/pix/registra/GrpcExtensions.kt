package br.com.mcos.pix.registra

import br.com.mcos.RegistraChavePixRequest
import br.com.mcos.TipoDeChave.*
import br.com.mcos.TipoDeConta.*
import br.com.mcos.pix.TipoDeChave
import br.com.mcos.pix.TipoDeConta

// Extension method - Com ele podemos adicionar métodos em uma classe já existente sem altera-la
// Como a classe RegistraChavePixRequest é criada pelo protobuff não devemos modifica-la, com isso devemos
// utilizar o Extension Method.
/**
 * Transforma o objeto ResgistraChavePixRequest
 * em um objeto NovaChavePix e o retorna.
 * Caso o tipoDeChave for UNKNOWN_TIPO_CHAVE deve-se atribuir null,
 * Caso contrário atríbui-se o nome de tipoDeChave
 */

fun RegistraChavePixRequest.toModel() : NovaChavePix {
    return NovaChavePix( // 1
        clienteId = clienteId,
        tipo = when (tipoDeChave) {
            UNKNOWN_TIPO_CHAVE -> null
            else -> TipoDeChave.valueOf(tipoDeChave.name)
        },
        chave = chave,
        tipoDeConta = when (tipoDeConta) {
            UNKNOWN_TIPO_CONTA -> null
            else -> TipoDeConta.valueOf(tipoDeConta.name)
        }
    )
}
