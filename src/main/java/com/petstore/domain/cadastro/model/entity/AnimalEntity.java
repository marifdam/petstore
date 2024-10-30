package com.petstore.domain.cadastro.model.entity;

import com.petstore.domain.cadastro.model.Especie;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 40, nullable = false)
    private String nome;
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private Especie especie;

    @Column(name="cad_tutor")
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
