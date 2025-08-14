package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Favorito;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusFavorito;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Favorito")

public class FavoritoController {
    List<Favorito> Favoritos = new ArrayList<>();
    @GetMapping
    public List<Favorito> findAll() {
        Favorito u1 = new Favorito();
        u1.setId(1L);
        u1.setData_favoritado(LocalDateTime.now());

        // Adicionando o produto
        Favoritos.add(u1);

        return Favoritos;
    }
}
 