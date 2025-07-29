package model.entity;

import java.time.LocalDateTime;

public class Usuário {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String nivel_acesso;
    private LocalDateTime data_nascimento;
    private LocalDateTime data_cadastro;
    private LocalDateTime ultima_conexao;

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

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public LocalDateTime getUltima_conexao() {
        return ultima_conexao;
    }

    public void setUltima_conexao(LocalDateTime ultima_conexao) {
        this.ultima_conexao = ultima_conexao;
    }
}
