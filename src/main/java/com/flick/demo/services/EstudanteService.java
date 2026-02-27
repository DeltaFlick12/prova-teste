package com.flick.demo.services;

import com.flick.demo.models.EstudanteModel;
import com.flick.demo.repositories.EstudanteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    private static final Logger log = LoggerFactory.getLogger(EstudanteService.class);

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> ListarTodosEstudantes() {
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }
}