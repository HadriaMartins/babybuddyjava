package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.GestacaoHistorico;
import com.seguranca.gestacional.babybuddy.repository.GestacaoHistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/gestacao-historico")
@CrossOrigin("*")
public class GestacaoHistoricoController {

    @Autowired
    private GestacaoHistoricoRepository gestacaoHistoricoRepository;

    @GetMapping
    public List<GestacaoHistorico> listarTodos() {
        return gestacaoHistoricoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GestacaoHistorico> buscarPorId(@PathVariable Integer id) {
        return gestacaoHistoricoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<GestacaoHistorico> cadastrar(@RequestBody GestacaoHistorico historico) {
        historico.setDataRegistro(LocalDateTime.now());
        return ResponseEntity.ok(gestacaoHistoricoRepository.save(historico));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GestacaoHistorico> atualizar(@PathVariable Integer id, @RequestBody GestacaoHistorico dados) {
        return gestacaoHistoricoRepository.findById(id).map(h -> {
            h.setObservacoes(dados.getObservacoes());
            h.setPesoMaterno(dados.getPesoMaterno());
            h.setPressaoArterial(dados.getPressaoArterial());
            h.setSemanaGestacional(dados.getSemanaGestacional());
            return ResponseEntity.ok(gestacaoHistoricoRepository.save(h));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return gestacaoHistoricoRepository.findById(id).map(h -> {
            gestacaoHistoricoRepository.delete(h);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
