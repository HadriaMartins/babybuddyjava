package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String titulo;

    @Column(name = "data_publicacap", nullable = false)
    private LocalDateTime data_publicacao;

    @Column(length = 100, nullable = false)
    private String autor;

    @Column
    private boolean status_material;

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

    public boolean getStatus_material() {
        return status_material;
    }

    public void setStatus_material(boolean status_material) {
        this.status_material = status_material;
    }
}
