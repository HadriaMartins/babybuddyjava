package com.seguranca.gestacional.babybuddy.model.entity;

import java.time.LocalDateTime;

public class Favorito {
    private Long id;
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
