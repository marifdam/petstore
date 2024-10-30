package com.petstore.domain.cadastro.model.dto;

import com.petstore.domain.cadastro.model.Especie;

import java.time.LocalDate;

public class AnimalRequest  {
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private Especie especie;
    private Integer tutor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
