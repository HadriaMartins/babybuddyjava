package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Usuario;
import com.seguranca.gestacional.babybuddy.services.GestanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Gestante")
public class GestanteController {

    @Autowired
    private GestanteService gestanteService;

    @GetMapping
    public List<Usuario> findAll() {
        return gestanteService.findAll();
    }
}
