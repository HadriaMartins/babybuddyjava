package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Agenda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusAgenda;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Agenda")

public class AgendaController {
    List<Agenda> Agendas = new ArrayList<>();
    @GetMapping
    public List<Agenda> findAll() {
        Agenda u1 = new Agenda();
        u1.setId(1L);
        u1.setTitulo("Fulano da Silva");
        u1.setData_evento(LocalDateTime.now());
        u1.setData_criado(LocalDateTime.now());
        u1.setStatus_evento(Boolean.parseBoolean("Ocorreu"));
        // Adicionando o produto
        Agendas.add(u1);

        return Agendas;
    }
}
 