package com.petstore.domain.atendimento.controller;

import com.petstore.domain.atendimento.model.dto.AtendimentoRequest;
import com.petstore.domain.atendimento.model.dto.AtendimentoResponse;
import com.petstore.domain.atendimento.service.AtendimentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoController {
    @Autowired
    private AtendimentoService service;

    @GetMapping()
    public List<AtendimentoResponse> get(){
        return service.listar();
    }

    @PostMapping
    public Integer gravar(@RequestBody AtendimentoRequest request) {
        return service.gravar(request);
    }

    @PutMapping("/{id}")
    public Integer atualizar(@PathVariable ("id") Integer id, @RequestBody AtendimentoRequest request) {
        return service.alterar(id,request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id) {
        service.deletar(id);
    }
}
