package com.petstore.domain.cadastro.controller;


import com.petstore.domain.cadastro.model.dto.CadastroRequest;
import com.petstore.domain.cadastro.model.dto.CadastroResponse;
import com.petstore.domain.cadastro.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cadastro")
public class CadastroController {
        @Autowired
        private CadastroService service;

        @GetMapping()
        public List<CadastroResponse> get(){
            return service.listar();
        }

        @PostMapping
        public Integer gravar(@RequestBody CadastroRequest request) {
            return service.gravar(request);
        }

        @PutMapping("/{id}")
        public Integer atualizar(@PathVariable ("id") Integer id, @RequestBody CadastroRequest request) {
            return service.alterar(id,request);
        }

        @DeleteMapping("/{id}")
        public void deletar(@PathVariable ("id") Integer id) {
            service.deletar(id);
        }
    }

