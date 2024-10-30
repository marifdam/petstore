package com.petstore.domain.cadastro.service;

import com.petstore.domain.cadastro.model.dto.CadastroRequest;
import com.petstore.domain.cadastro.model.dto.CadastroResponse;
import com.petstore.domain.cadastro.model.entity.CadastroEntity;
import com.petstore.domain.cadastro.repository.CadastroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository CadastroRepository;

    public Integer gravar(CadastroRequest CadastroRequest) {
        CadastroEntity CadastroEntity = new CadastroEntity();
        BeanUtils.copyProperties(CadastroRequest, CadastroEntity);
        return CadastroRepository.save(CadastroEntity).getId();
    }

    public Integer alterar(Integer id, CadastroRequest CadastroRequest) {
        CadastroEntity CadastroEntity = CadastroRepository.findById(id).orElse(null);

        if(CadastroEntity != null) {
            BeanUtils.copyProperties(CadastroRequest, CadastroEntity);
            return CadastroRepository.save(CadastroEntity).getId();
        } else {
            return null;
        }
    }

    public void deletar(Integer id){
        CadastroRepository.deleteById(id);
    }

    public List<CadastroResponse> listar(){
        List<CadastroEntity> entities = CadastroRepository.findAll();
        List<CadastroResponse> responses = new ArrayList<>();
        for(CadastroEntity e : entities) {
            CadastroResponse res = new CadastroResponse();
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }
        return responses;
    }
}
