package br.com.zup.edu.pix.carrega

import br.com.zup.edu.grpc.CarregaChavePixResponse
import com.google.protobuf.Timestamp
import java.time.ZoneId

class CarregaChavePixResponseConverter {

    fun convert(chaveInfo: ChavePixInfo): CarregaChavePixResponse {
        return CarregaChavePixResponse.newBuilder()
            .setClienteId(chaveInfo.clienteId?.toString() ?: "")
            .setPixId(chaveInfo.pixId?.toString() ?: "")
            .setChave(
                CarregaChavePixResponse.ChavePix
                    .newBuilder()
                    .setTipo(br.com.zup.edu.grpc.TipoDeChave.valueOf(chaveInfo.tipo.name))
                    .setChave(chaveInfo.chave)
                    .setConta(
                        CarregaChavePixResponse.ChavePix.ContaInfo.newBuilder()
                            .setTipo(br.com.zup.edu.grpc.TipoDeConta.valueOf(chaveInfo.tipoDeConta.name))
                            .setInstituicao(chaveInfo.conta.instituicao)
                            .setNomeDoTitular(chaveInfo.conta.nomeDoTitular)
                            .setCpfDoTitular(chaveInfo.conta.cpfDoTitular)
                            .setAgencia(chaveInfo.conta.agencia)
                            .setNumeroDaConta(chaveInfo.conta.numeroDaConta)
                            .build()
                    )
                    .setCriadaEm(chaveInfo.registradaEm.let {
                        val createdAt = it.atZone(ZoneId.of("UTC")).toInstant()
                        Timestamp.newBuilder()
                            .setSeconds(createdAt.epochSecond)
                            .setNanos(createdAt.nano)
                            .build()
                    })
            )
            .build()
    }

}
