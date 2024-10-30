package com.petstore.domain.cadastro.repository;

import com.petstore.domain.cadastro.model.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Long>
{
}
