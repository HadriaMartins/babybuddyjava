package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Favorito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_favoritado", nullable = false)
    private LocalDateTime data_favoritado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_favoritado() {
        return data_favoritado;
    }

    public void setData_favoritado(LocalDateTime data_favoritado) {
        this.data_favoritado = data_favoritado;
    }
}
