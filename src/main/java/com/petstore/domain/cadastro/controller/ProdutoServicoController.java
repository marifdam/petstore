package com.petstore.domain.cadastro.controller;

import com.petstore.domain.cadastro.model.ProdutoServico;
import com.petstore.domain.cadastro.repository.ProdutoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestControllerAdvice
@RequestMapping("/produtos")
public class ProdutoServicoController {
    @Autowired
    private ProdutoServicoRepository produtoServicoRepository;

    @GetMapping()
    public List<ProdutoServico> produtos(){
        return produtoServicoRepository.findAll();
    }

    @PostMapping()
    public Integer gravar(@RequestBody ProdutoServico requisicao){
        produtoServicoRepository.save(requisicao);
        return requisicao.getId();
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id, @RequestBody ProdutoServico requisicao){
        requisicao.setId(id);
        produtoServicoRepository.save(requisicao);
        return requisicao.getId();
    }

    @DeleteMapping("/{id}")
    public Integer deletar(@PathVariable("id") Integer id, @RequestBody ProdutoServico requisicao){
        requisicao.setId(id);
        produtoServicoRepository.save(requisicao);
        return requisicao.getId();

    }
}
