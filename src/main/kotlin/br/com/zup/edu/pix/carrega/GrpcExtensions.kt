package br.com.zup.edu.pix.carrega

import br.com.zup.edu.grpc.CarregaChavePixRequest
import br.com.zup.edu.grpc.CarregaChavePixRequest.FiltroCase.*
import javax.validation.ConstraintViolationException
import javax.validation.Validator


fun CarregaChavePixRequest.toModel(validator: Validator): Filtro {

    val filtro = when (filtroCase!!) {
        PIXID -> pixId.let {
            Filtro.PorPixId(clienteId = it.clienteId, pixId = it.pixId)
        }
        CHAVE -> Filtro.PorChave(chave)
        FILTRO_NOT_SET -> Filtro.Invalido()
    }

    val violations = validator.validate(filtro)
    if (violations.isNotEmpty()) {
        throw ConstraintViolationException(violations);
    }

    return filtro
}
