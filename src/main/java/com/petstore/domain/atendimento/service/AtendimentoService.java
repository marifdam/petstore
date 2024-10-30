package com.petstore.domain.atendimento.service;

import com.petstore.domain.atendimento.model.dto.AtendimentoRequest;
import com.petstore.domain.atendimento.model.dto.AtendimentoResponse;
import com.petstore.domain.atendimento.model.entity.AtendimentoEntity;
import com.petstore.domain.atendimento.repository.AtendimentoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public Integer gravar(AtendimentoRequest atendimentoRequest) {
        AtendimentoEntity atendimentoEntity = new AtendimentoEntity();
        BeanUtils.copyProperties(atendimentoRequest, atendimentoEntity);
        return atendimentoRepository.save(atendimentoEntity).getId();
    }

    public Integer alterar(Integer id, AtendimentoRequest atendimentoRequest) {
        AtendimentoEntity atendimentoEntity = atendimentoRepository.findById(id).orElse(null);

        if(atendimentoEntity != null) {
            BeanUtils.copyProperties(atendimentoRequest, atendimentoEntity);
            return atendimentoRepository.save(atendimentoEntity).getId();
        } else {
            return null;
        }
    }

    public void deletar(Integer id){
        atendimentoRepository.deleteById(id);
    }

    public List<AtendimentoResponse> listar(){
        List<AtendimentoEntity> entities = atendimentoRepository.findAll();
        List<AtendimentoResponse> responses = new ArrayList<>();
        for(AtendimentoEntity e : entities) {
            AtendimentoResponse res = new AtendimentoResponse();
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }
        return responses;
    }
}
