package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Gestacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusGestacao;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Gestacao")

public class GestacaoController {
    List<Gestacao> Gestacaos = new ArrayList<>();
    @GetMapping
    public List<Gestacao> findAll() {
        Gestacao u1 = new Gestacao();
        u1.setId(1L);
        u1.setData_inicio(LocalDateTime.now());
        u1.setData_prevista_parto(LocalDateTime.now());
        u1.setTipo_gestacao("Saudável");
        u1.setObservacoes("Enjoo matinal recorrente");

        // Adicionando o produto
        Gestacaos.add(u1);

        return Gestacaos;
    }
}
 