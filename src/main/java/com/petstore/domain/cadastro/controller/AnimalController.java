package com.petstore.domain.cadastro.controller;

import com.petstore.domain.cadastro.model.dto.AnimalRequest;
import com.petstore.domain.cadastro.model.dto.AnimalResponse;
import com.petstore.domain.cadastro.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalService service;

    @GetMapping()
    public List<AnimalResponse> get(){
        return service.listar();
    }

    @PostMapping
    public Integer gravar(@RequestBody AnimalRequest request) {
        return service.gravar(request);
    }

    @PutMapping("/{id}")
    public Integer atualizar(@PathVariable ("id") Integer id, @RequestBody AnimalRequest request) {
        return service.alterar(id,request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id) {
        service.deletar(id);
    }
}
