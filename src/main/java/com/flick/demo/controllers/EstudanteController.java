package com.flick.demo.controllers;

import com.flick.demo.models.EstudanteModel;
import com.flick.demo.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        return estudanteService.criarEstudante(estudanteModel);
    }
    public List<EstudanteModel> ListarTodoesEstudantes() {
        return estudanteService.ListarTodosEstudantes();
    }
    public void deletarEstudante(@PathVariable Long id) {
        estudanteService.deletarEstudante(id);
    }
}