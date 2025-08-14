package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Evento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusEvento;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Evento")

public class EventoController {
    List<Evento> Eventos = new ArrayList<>();
    @GetMapping
    public List<Evento> findAll() {
        Evento u1 = new Evento();
        u1.setId(1L);
        u1.setTipo_evento("Ultrassom");

        // Adicionando o produto
        Eventos.add(u1);

        return Eventos;
    }
}
 