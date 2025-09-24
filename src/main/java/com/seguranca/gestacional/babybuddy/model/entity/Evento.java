package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.Entity;

@Entity
public class Evento {
    private Long id;
    private String tipo_evento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }
}
