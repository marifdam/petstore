package com.petstore.domain.atendimento.repository;

import com.petstore.domain.atendimento.model.entity.AtendimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<AtendimentoEntity, Integer> {
}
