package com.petstore.domain.cadastro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

    @Column(name="Logra", length =50)
    private String logradouro;

    @Column(name="nm", length = 6)
    private String numero;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}