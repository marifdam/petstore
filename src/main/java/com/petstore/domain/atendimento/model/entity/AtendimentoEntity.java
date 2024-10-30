package com.petstore.domain.atendimento.model.entity;

import com.petstore.domain.atendimento.AtendimentoStatus;
import com.petstore.domain.atendimento.AtendimentoTipo;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class AtendimentoEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private Date data;
    private Double valor;
    private boolean emergencia;
    @Enumerated(EnumType.STRING)
    private AtendimentoTipo tipo;
    @Enumerated(EnumType.STRING)
    private AtendimentoStatus status;

    @Column(name="pet_id")
    private Integer animal;
    @Column(name="prod_id")
    private Integer produtoServico;
    @Column(name="cad_id")
    private Integer cadastro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
