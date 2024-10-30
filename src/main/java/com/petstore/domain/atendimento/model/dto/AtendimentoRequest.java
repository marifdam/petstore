package com.petstore.domain.atendimento.model.dto;

import com.petstore.domain.atendimento.AtendimentoStatus;
import com.petstore.domain.atendimento.AtendimentoTipo;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

public class AtendimentoRequest {
    private String descricao;
    private Date data;
    private Double valor;
    private boolean emergencia;
    private AtendimentoTipo tipo;
    private AtendimentoStatus status;
    private Integer animal;
    private Integer produtoServico;
    private Integer cadastro;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isEmergencia() {
        return emergencia;
    }

    public void setEmergencia(boolean emergencia) {
        this.emergencia = emergencia;
    }

    public AtendimentoTipo getTipo() {
        return tipo;
    }

    public void setTipo(AtendimentoTipo tipo) {
        this.tipo = tipo;
    }

    public AtendimentoStatus getStatus() {
        return status;
    }

    public void setStatus(AtendimentoStatus status) {
        this.status = status;
    }

    public Integer getAnimal() {
        return animal;
    }

    public void setAnimal(Integer animal) {
        this.animal = animal;
    }

    public Integer getProdutoServico() {
        return produtoServico;
    }

    public void setProdutoServico(Integer produtoServico) {
        this.produtoServico = produtoServico;
    }

    public Integer getCadastro() {
        return cadastro;
    }

    public void setCadastro(Integer cadastro) {
        this.cadastro = cadastro;
    }
}
