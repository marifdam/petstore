package com.petstore.domain.cadastro.service;

import com.petstore.domain.cadastro.model.dto.AnimalRequest;
import com.petstore.domain.cadastro.model.dto.AnimalResponse;
import com.petstore.domain.cadastro.model.entity.AnimalEntity;
import com.petstore.domain.cadastro.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Integer gravar(AnimalRequest animalRequest) {
        AnimalEntity animalEntity = new AnimalEntity();
        BeanUtils.copyProperties(animalRequest, animalEntity);
        return animalRepository.save(animalEntity).getId();
    }

    public Integer alterar(Integer id, AnimalRequest animalRequest) {
        AnimalEntity animalEntity = animalRepository.findById(id).orElse(null);

        if(animalEntity != null) {
            BeanUtils.copyProperties(animalRequest, animalEntity);
           return animalRepository.save(animalEntity).getId();
        } else {
            return null;
        }
    }

    public void deletar(Integer id){
        animalRepository.deleteById(id);
    }

    public List<AnimalResponse> listar(){
        List<AnimalEntity> entities = animalRepository.findAll();
        List<AnimalResponse> responses = new ArrayList<>();
        for(AnimalEntity e : entities) {
            AnimalResponse res = new AnimalResponse();
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }
        return responses;
    }
}
