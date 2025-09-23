package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Gestante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusGestante;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Gestante")

public class GestanteController {
    List<Gestante> Gestantes = new ArrayList<>();
    @GetMapping
    public List<Gestante> findAll() {
        Gestante u1 = new Gestante();
        u1.setId(1L);
        u1.setCpf(49386475);
        u1.setTelefone(1195229);
        u1.setData_cadastro(LocalDateTime.now());

        // Adicionando o produto
        Gestantes.add(u1);

        return Gestantes;
    }
}
 