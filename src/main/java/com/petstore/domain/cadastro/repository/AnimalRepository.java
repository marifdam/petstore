package com.petstore.domain.cadastro.repository;

import com.petstore.domain.cadastro.model.entity.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
}
