package br.com.mcos.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020\u0007H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2 = {"Lbr/com/mcos/pix/ChavePix;", "", "clienteId", "Ljava/util/UUID;", "tipo", "Lbr/com/mcos/pix/TipoDeChave;", "chave", "", "tipoDeConta", "Lbr/com/mcos/TipoDeConta;", "conta", "Lbr/com/mcos/pix/ContaAssociada;", "(Ljava/util/UUID;Lbr/com/mcos/pix/TipoDeChave;Ljava/lang/String;Lbr/com/mcos/TipoDeConta;Lbr/com/mcos/pix/ContaAssociada;)V", "getChave", "()Ljava/lang/String;", "setChave", "(Ljava/lang/String;)V", "getClienteId", "()Ljava/util/UUID;", "getConta", "()Lbr/com/mcos/pix/ContaAssociada;", "criadaEm", "Ljava/time/LocalDateTime;", "getCriadaEm", "()Ljava/time/LocalDateTime;", "id", "getId", "getTipo", "()Lbr/com/mcos/pix/TipoDeChave;", "getTipoDeConta", "()Lbr/com/mcos/TipoDeConta;", "toString", "keymanagerGrpc"})
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(name = "uk_chave_pix", columnNames = {"chave"})})
@javax.persistence.Entity
public final class ChavePix {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(nullable = false)
    private final java.time.LocalDateTime criadaEm = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    @javax.persistence.Column(nullable = false)
    private final java.util.UUID clienteId = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    @javax.persistence.Column(nullable = false)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.mcos.pix.TipoDeChave tipo = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(unique = true, nullable = false)
    private java.lang.String chave;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    @javax.persistence.Column(nullable = false)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.mcos.TipoDeConta tipoDeConta = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @javax.persistence.Embedded
    private final br.com.mcos.pix.ContaAssociada conta = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getCriadaEm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.UUID getClienteId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.mcos.pix.TipoDeChave getTipo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChave() {
        return null;
    }
    
    public final void setChave(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.mcos.TipoDeConta getTipoDeConta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.mcos.pix.ContaAssociada getConta() {
        return null;
    }
    
    public ChavePix(@org.jetbrains.annotations.NotNull
    java.util.UUID clienteId, @org.jetbrains.annotations.NotNull
    br.com.mcos.pix.TipoDeChave tipo, @org.jetbrains.annotations.NotNull
    java.lang.String chave, @org.jetbrains.annotations.NotNull
    br.com.mcos.TipoDeConta tipoDeConta, @org.jetbrains.annotations.NotNull
    br.com.mcos.pix.ContaAssociada conta) {
        super();
    }
}