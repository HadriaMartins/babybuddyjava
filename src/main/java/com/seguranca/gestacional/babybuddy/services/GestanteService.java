package com.seguranca.gestacional.babybuddy.services;

import com.seguranca.gestacional.babybuddy.model.entity.Gestante;
import com.seguranca.gestacional.babybuddy.repository.GestanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestanteService {

    @Autowired
    private GestanteRepository gestanteRepository;

    public List<Gestante> findAll() {
        return gestanteRepository.findAll();
    }

    public Gestante save(Gestante gestante) {
        return gestanteRepository.save(gestante);
    }
}
