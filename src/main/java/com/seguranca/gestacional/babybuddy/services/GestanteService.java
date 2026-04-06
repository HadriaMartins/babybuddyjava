package com.seguranca.gestacional.babybuddy.services;

import com.seguranca.gestacional.babybuddy.model.entity.Usuario;
import com.seguranca.gestacional.babybuddy.repository.GestanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestanteService {

    @Autowired
    private GestanteRepository gestanteRepository;

    public List<Usuario> findAll() {
        return gestanteRepository.findAll();
    }

    public Usuario save(Usuario gestante) {
        return gestanteRepository.save(gestante);
    }
}
