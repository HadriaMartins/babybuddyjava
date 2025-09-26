package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String titulo;
    @Column(length = 200, nullable = false)
    private String informacao;
    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime data_cadastro;
    @Column
    private boolean status_agenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public boolean isStatus_agenda() {
        return status_agenda;
    }

    public void setStatus_agenda(boolean status_agenda) {
        this.status_agenda = status_agenda;
    }
}
