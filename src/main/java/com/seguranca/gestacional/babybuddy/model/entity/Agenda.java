package com.seguranca.gestacional.babybuddy.model.entity;

import java.time.LocalDateTime;

public class Agenda {
    private Long id;
    private String titulo;
    private LocalDateTime data_evento;
    private LocalDateTime data_criado;
    private String status_evento;

    public void setId(Long id) {
        this.id = id;
    }                                           

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setData_evento(LocalDateTime data_evento) {
        this.data_evento = data_evento;
    }

    public void setData_criado(LocalDateTime data_criado) {
        this.data_criado = data_criado;
    }

    public void setStatus_evento(String status_evento) {
        this.status_evento = status_evento;
    }
}
