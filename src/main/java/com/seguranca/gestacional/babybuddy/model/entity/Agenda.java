package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Agenda {
    @Id
    private Long id;
    private String titulo;
    private LocalDateTime data_evento;
    private LocalDateTime data_criado;
    private boolean status_evento;

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

    public LocalDateTime getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDateTime data_evento) {
        this.data_evento = data_evento;
    }

    public LocalDateTime getData_criado() {
        return data_criado;
    }

    public void setData_criado(LocalDateTime data_criado) {
        this.data_criado = data_criado;
    }

    public boolean getStatus_evento() {
        return status_evento;
    }

    public void setStatus_evento(boolean status_evento) {
        this.status_evento = status_evento;
    }
}
