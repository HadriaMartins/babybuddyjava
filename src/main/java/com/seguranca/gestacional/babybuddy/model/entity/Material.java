package com.seguranca.gestacional.babybuddy.model.entity;

import java.time.LocalDateTime;

public class Material {
    private Long id;
    private String titulo;
    private LocalDateTime data_publicacao;
    private String autor;
    private String status_material;

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

    public LocalDateTime getData_publicacao() {
        return data_publicacao;
    }

    public void setData_publicacao(LocalDateTime data_publicacao) {
        this.data_publicacao = data_publicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus_material() {
        return status_material;
    }

    public void setStatus_material(String status_material) {
        this.status_material = status_material;
    }
}
