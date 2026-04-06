package com.seguranca.gestacional.babybuddy.controller;


import com.seguranca.gestacional.babybuddy.model.entity.GestacaoHistorico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusGestacaoHistorico;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/GestacaoHistorico")

public class GestacaoHistoricoController {
    List<GestacaoHistorico> GestacaoHistoricos = new ArrayList<>();

    @GetMapping
    public List<GestacaoHistorico> findAll() {
        GestacaoHistorico u1 = new GestacaoHistorico();
        u1.setId(1L);
        u1.setData_registro(LocalDateTime.now());
        u1.setObservacoes("Muitos Enjoos.");
        u1.setPeso_materno(75.5);


        // Adicionando o produto
        GestacaoHistoricos.add(u1);

        return GestacaoHistoricos;
    }
}
 