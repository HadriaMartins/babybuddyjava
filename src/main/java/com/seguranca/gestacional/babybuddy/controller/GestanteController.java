package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Gestante;
import com.seguranca.gestacional.babybuddy.repository.GestanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/gestantes")
@CrossOrigin("*")
public class GestanteController {

    @Autowired
    private GestanteRepository gestanteRepository;

    @GetMapping
    public List<Gestante> listarTodos() {
        return gestanteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gestante> buscarPorId(@PathVariable Integer id) {
        return gestanteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Gestante> cadastrar(@RequestBody Gestante gestante) {
        gestante.setDataRegistro(LocalDateTime.now());
        return ResponseEntity.ok(gestanteRepository.save(gestante));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gestante> atualizar(@PathVariable Integer id, @RequestBody Gestante dados) {
        return gestanteRepository.findById(id).map(g -> {
            g.setObservacoes(dados.getObservacoes());
            g.setTipoSanguineo(dados.getTipoSanguineo());
            g.setDataNascimento(dados.getDataNascimento());
            return ResponseEntity.ok(gestanteRepository.save(g));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return gestanteRepository.findById(id).map(g -> {
            gestanteRepository.delete(g);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
