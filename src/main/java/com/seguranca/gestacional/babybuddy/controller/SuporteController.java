package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Suporte;
import com.seguranca.gestacional.babybuddy.repository.SuporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/suportes")
@CrossOrigin("*")
public class SuporteController {

    @Autowired
    private SuporteRepository suporteRepository;

    @GetMapping
    public List<Suporte> listarTodos() {
        return suporteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suporte> buscarPorId(@PathVariable Integer id) {
        return suporteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Suporte> cadastrar(@RequestBody Suporte suporte) {
        suporte.setDataEnvio(LocalDateTime.now());
        suporte.setSituacaoAtual("pendente");
        return ResponseEntity.ok(suporteRepository.save(suporte));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Suporte> atualizar(@PathVariable Integer id, @RequestBody Suporte dados) {
        return suporteRepository.findById(id).map(s -> {
            s.setResposta(dados.getResposta());
            s.setSituacaoAtual(dados.getSituacaoAtual());
            s.setDataResposta(LocalDateTime.now());
            return ResponseEntity.ok(suporteRepository.save(s));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão lógica
    @PatchMapping("/{id}/fechar")
    public ResponseEntity<Suporte> fechar(@PathVariable Integer id) {
        return suporteRepository.findById(id).map(s -> {
            s.setSituacaoAtual("fechado");
            return ResponseEntity.ok(suporteRepository.save(s));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão física
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return suporteRepository.findById(id).map(s -> {
            suporteRepository.delete(s);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
