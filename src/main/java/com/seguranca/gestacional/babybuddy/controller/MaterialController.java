package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Material;
import com.seguranca.gestacional.babybuddy.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/materiais")
@CrossOrigin("*")
public class MaterialController {

    @Autowired
    private MaterialRepository materialRepository;

    @GetMapping
    public List<Material> listarTodos() {
        return materialRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Material> buscarPorId(@PathVariable Integer id) {
        return materialRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Material> cadastrar(@RequestBody Material material) {
        material.setDataPublicacao(LocalDateTime.now());
        material.setStatusMaterial("ATIVO");
        return ResponseEntity.ok(materialRepository.save(material));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Material> atualizar(@PathVariable Integer id, @RequestBody Material dados) {
        return materialRepository.findById(id).map(m -> {
            m.setTitulo(dados.getTitulo());
            m.setLink(dados.getLink());
            m.setArquivo(dados.getArquivo());
            m.setAutor(dados.getAutor());
            m.setStatusMaterial(dados.getStatusMaterial());
            return ResponseEntity.ok(materialRepository.save(m));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão lógica
    @PatchMapping("/{id}/inativar")
    public ResponseEntity<Material> inativar(@PathVariable Integer id) {
        return materialRepository.findById(id).map(m -> {
            m.setStatusMaterial("INATIVO");
            return ResponseEntity.ok(materialRepository.save(m));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão física
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return materialRepository.findById(id).map(m -> {
            materialRepository.delete(m);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
