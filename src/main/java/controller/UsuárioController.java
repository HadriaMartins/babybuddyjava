package controller;

public class UsuárioController {
    package com.seguranca.gestacional.babybuddy;

import com.seguranca.gestacional.babybuddy.Usuário;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuário;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

    @RestController
    @RequestMapping("/api/v1/Usuário")

    public class UsuárioController {
        List<Usuário> Usuários = new ArrayList<>();
        @GetMapping
        public List<Usuário> findAll() {
            Usuário u1 = new Usuário();
            u1.setId(1L);
            u1.setNome("Fulano da Silva");
            u1.setEmail("fulano@gmail.com");
            u1.setSenha("MTIzNDU2Nzg=");
            u1.setNivelAcesso("ADMIN");
            u1.setFoto(null);
            u1.setDataCadastro(LocalDateTime.now());
            u1.setStatusUsuário("ATIVO");

            Usuário u2 = new Usuário();
            u2.setId(2L);
            u2.setNome("Beltrana de Sá");
            u2.setEmail("beltrana@gmail.com");
            u2.setSenha("MTIzNDU2Nzg=");
            u2.setNivelAcesso("USER");
            u2.setFoto(null);
            u2.setDataCadastro(LocalDateTime.now());
            u2.setStatusUsuário("INATIVO");


            Usuário u3 = new Usuário();
            u3.setId(3L);
            u3.setNome("Sicrana de Oliveira");
            u3.setEmail("sicrana@gmail.com");
            u3.setSenha("MTIzNDU2Nzg=");
            u3.setNivelAcesso("PRESTADOR");
            u3.setFoto(null);
            u3.setDataCadastro(LocalDateTime.now());
            u3.setStatusUsuário("ATIVO");

            Usuário u4 = new Usuário();
            u4.setId(4L);
            u4.setNome("Ordnael Zurc");
            u4.setEmail("ordnael@gmail.com");
            u4.setSenha("MTIzNDU2Nzg=");
            u4.setNivelAcesso("USER");
            u4.setFoto(null);
            u4.setDataCadastro(LocalDateTime.now());
            u4.setStatusUsuário("TROCAR_SENHA");

            // Adicionando o produto
            Usuários.add(u1);
            Usuários.add(u2);
            Usuários.add(u3);
            Usuários.add(u4);


            return Usuários;
        }
    }

}
