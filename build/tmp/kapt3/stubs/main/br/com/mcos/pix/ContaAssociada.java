package br.com.mcos.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lbr/com/mcos/pix/ContaAssociada;", "", "instituicao", "", "nomeDoTitular", "cpfDoTitular", "agencia", "numeroDaConta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgencia", "()Ljava/lang/String;", "getCpfDoTitular", "getInstituicao", "getNomeDoTitular", "getNumeroDaConta", "keymanagerGrpc"})
@javax.persistence.Embeddable
public final class ContaAssociada {
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(name = "conta_instituicao", nullable = false)
    private final java.lang.String instituicao = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(name = "conta_titular_nome", nullable = false)
    private final java.lang.String nomeDoTitular = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Size(max = 11)
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(name = "conta_titular_cpf", length = 11, nullable = false)
    private final java.lang.String cpfDoTitular = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Size(max = 4)
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(name = "conta_agencia", length = 4, nullable = false)
    private final java.lang.String agencia = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Size(max = 6)
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(name = "conta_numero", length = 6, nullable = false)
    private final java.lang.String numeroDaConta = null;
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getInstituicao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNomeDoTitular() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCpfDoTitular() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAgencia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumeroDaConta() {
        return null;
    }
    
    public ContaAssociada(@org.jetbrains.annotations.NotNull
    java.lang.String instituicao, @org.jetbrains.annotations.NotNull
    java.lang.String nomeDoTitular, @org.jetbrains.annotations.NotNull
    java.lang.String cpfDoTitular, @org.jetbrains.annotations.NotNull
    java.lang.String agencia, @org.jetbrains.annotations.NotNull
    java.lang.String numeroDaConta) {
        super();
    }
}