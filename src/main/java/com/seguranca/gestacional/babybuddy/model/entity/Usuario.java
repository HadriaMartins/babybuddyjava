package com.seguranca.gestacional.babybuddy.model.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
    public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;

    @Column(length = 100, nullable = false)
        private String nome;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 255, nullable = false)
    private String senha;

    @Column(length = 20, nullable = false)
    private String nivel_acesso;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime data_cadastro;

    @Column
    private boolean statusUsuario;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public String getNivel_acesso() {
            return nivel_acesso;
        }

        public void setNivel_acesso(String nivel_acesso) {
            this.nivel_acesso = nivel_acesso;
        }

        public LocalDateTime getData_cadastro() {
            return data_cadastro;
        }

        public void setData_cadastro(LocalDateTime data_cadastro) {
            this.data_cadastro = data_cadastro;
        }

    public boolean isStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
}


