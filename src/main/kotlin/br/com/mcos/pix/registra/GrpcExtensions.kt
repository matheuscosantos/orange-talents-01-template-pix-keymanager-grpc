package br.com.mcos.pix.registra

import br.com.mcos.RegistraChavePixRequest
import br.com.mcos.TipoDeChave.*
import br.com.mcos.TipoDeConta.*
import br.com.mcos.pix.TipoDeChave
import br.com.mcos.pix.TipoDeConta

fun RegistraChavePixRequest.toModel() : NovaChavePix {
    return NovaChavePix( // 1
        clienteId = clienteId,
        tipo = when (tipoDeChave) {
            UNKNOWN_TIPO_CHAVE -> null
            else -> TipoDeChave.valueOf(tipoDeChave.name) // 1
        },
        chave = chave,
        tipoDeConta = when (tipoDeConta) {
            UNKNOWN_TIPO_CONTA -> null
            else -> TipoDeConta.valueOf(tipoDeConta.name) // 1
        }
    )
}