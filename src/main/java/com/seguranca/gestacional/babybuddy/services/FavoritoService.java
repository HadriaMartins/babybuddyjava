package com.seguranca.gestacional.babybuddy.services;

import com.seguranca.gestacional.babybuddy.model.entity.Favorito;
import com.seguranca.gestacional.babybuddy.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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