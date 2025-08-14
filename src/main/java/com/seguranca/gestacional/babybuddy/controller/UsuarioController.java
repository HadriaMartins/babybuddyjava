package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Usuario")

public class UsuarioController {
    List<Usuario> usuarios = new ArrayList<>();
    @GetMapping
    public List<Usuario> findAll() {
        Usuario u1 = new Usuario();
        u1.setId(1L);
        u1.setNome("Fulano da Silva");
        u1.setEmail("fulano@gmail.com");
        u1.setSenha("MTIzNDU2Nzg=");
        u1.setNivel_acesso("Usuario");
        u1.setData_cadastro(LocalDateTime.now());
        u1.setData_nascimento(LocalDateTime.now());
        u1.setUltima_conexao(LocalDateTime.now());

        // Adicionando o produto
        usuarios.add(u1);

        return usuarios;
    }
}
