package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;

    @Column(name = "tipo_sanguineo", nullable = false, length = 20)
    private String tipoSanguineo;

    @Column(name = "ja_houve_parto", nullable = false, length = 20)
    private String jaHouveParto;

    @Column(name = "possui_algum_problema_de_saude", nullable = false, length = 20)
    private String possuiAlgumProblemaDeSaude;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "nivel_acesso", nullable = false, length = 20)
    private String nivelAcesso;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "status_usuario", nullable = false, length = 10)
    private String statusUsuario;

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getJaHouveParto() {
        return jaHouveParto;
    }

    public void setJaHouveParto(String jaHouveParto) {
        this.jaHouveParto = jaHouveParto;
    }

    public String getPossuiAlgumProblemaDeSaude() {
        return possuiAlgumProblemaDeSaude;
    }

    public void setPossuiAlgumProblemaDeSaude(String possuiAlgumProblemaDeSaude) {
        this.possuiAlgumProblemaDeSaude = possuiAlgumProblemaDeSaude;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
}