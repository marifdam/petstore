package com.petstore.domain.cadastro.repository;

import com.petstore.domain.cadastro.model.entity.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<CadastroEntity,Integer> {
}
