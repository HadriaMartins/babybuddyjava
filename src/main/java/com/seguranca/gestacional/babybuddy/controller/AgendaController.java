package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Agenda;
import com.seguranca.gestacional.babybuddy.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/agendas")
@CrossOrigin("*")
public class AgendaController {

    @Autowired
    private AgendaRepository agendaRepository;

    @GetMapping
    public List<Agenda> listarTodos() {
        return agendaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agenda> buscarPorId(@PathVariable Integer id) {
        return agendaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Agenda> cadastrar(@RequestBody Agenda agenda) {
        agenda.setDataCadastro(LocalDateTime.now());
        agenda.setStatusAgenda("AGENDADO");
        return ResponseEntity.ok(agendaRepository.save(agenda));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Agenda> atualizar(@PathVariable Integer id, @RequestBody Agenda dados) {
        return agendaRepository.findById(id).map(a -> {
            a.setTitulo(dados.getTitulo());
            a.setInformacao(dados.getInformacao());
            a.setDataAgendada(dados.getDataAgendada());
            a.setStatusAgenda(dados.getStatusAgenda());
            return ResponseEntity.ok(agendaRepository.save(a));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão lógica
    @PatchMapping("/{id}/cancelar")
    public ResponseEntity<Agenda> cancelar(@PathVariable Integer id) {
        return agendaRepository.findById(id).map(a -> {
            a.setStatusAgenda("CANCELADO");
            return ResponseEntity.ok(agendaRepository.save(a));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Exclusão física
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return agendaRepository.findById(id).map(a -> {
            agendaRepository.delete(a);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
