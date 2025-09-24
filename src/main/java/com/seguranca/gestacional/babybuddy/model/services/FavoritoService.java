package com.seguranca.gestacional.babybuddy.model.services;

import com.seguranca.gestacional.babybuddy.model.entity.Favorito;
import com.seguranca.gestacional.babybuddy.model.repository.FavoritoRepository;
import com.seguranca.gestacional.babybuddy.model.services.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class FavoritoService {

    @Autowired
    private FavoritoRepository favoritoRepository;

    public List<Favorito> findAll() {
        return favoritoRepository.findAll();
    }

    public Favorito save(Favorito favorito) {

        return favoritoRepository.save(favorito);
    }
}