package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Favorito;
import com.seguranca.gestacional.babybuddy.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/favoritos")
@CrossOrigin("*")
public class FavoritoController {

    @Autowired
    private FavoritoRepository favoritoRepository;

    @GetMapping
    public List<Favorito> listarTodos() {
        return favoritoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Favorito> buscarPorId(@PathVariable Integer id) {
        return favoritoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Favorito> cadastrar(@RequestBody Favorito favorito) {
        favorito.setDataFavoritada(LocalDateTime.now());
        return ResponseEntity.ok(favoritoRepository.save(favorito));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return favoritoRepository.findById(id).map(f -> {
            favoritoRepository.delete(f);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
