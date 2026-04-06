package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Gestacao;
import com.seguranca.gestacional.babybuddy.repository.GestacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gestacoes")
@CrossOrigin("*")
public class GestacaoController {

    @Autowired
    private GestacaoRepository gestacaoRepository;

    @GetMapping
    public List<Gestacao> listarTodos() {
        return gestacaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gestacao> buscarPorId(@PathVariable Integer id) {
        return gestacaoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Gestacao> cadastrar(@RequestBody Gestacao gestacao) {
        gestacao.setStatusGestacao("Ocorrendo");
        return ResponseEntity.ok(gestacaoRepository.save(gestacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gestacao> atualizar(@PathVariable Integer id, @RequestBody Gestacao dados) {
        return gestacaoRepository.findById(id).map(g -> {
            g.setDataInicio(dados.getDataInicio());
            g.setDataPrevistaParto(dados.getDataPrevistaParto());
            g.setDataParto(dados.getDataParto());
            g.setTipoGestacao(dados.getTipoGestacao());
            g.setObservacoes(dados.getObservacoes());
            g.setStatusGestacao(dados.getStatusGestacao());
            return ResponseEntity.ok(gestacaoRepository.save(g));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão lógica
    @PatchMapping("/{id}/encerrar")
    public ResponseEntity<Gestacao> encerrar(@PathVariable Integer id) {
        return gestacaoRepository.findById(id).map(g -> {
            g.setStatusGestacao("Encerrada");
            return ResponseEntity.ok(gestacaoRepository.save(g));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão física
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return gestacaoRepository.findById(id).map(g -> {
            gestacaoRepository.delete(g);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
