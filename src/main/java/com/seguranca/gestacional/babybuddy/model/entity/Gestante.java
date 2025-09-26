package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Gestante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_registro", nullable = false)
    private LocalDateTime data_registro;
    @Column(name = "data_nascimento", nullable = false)
    private LocalDateTime data_nascimento;
    @Column(length = 200, nullable = false)
    private String observacoes;
    @Column(length = 20, nullable = false)
    private String tipo_sanquineo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_registro() {
        return data_registro;
    }

    public void setData_registro(LocalDateTime data_registro) {
        this.data_registro = data_registro;
    }

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getTipo_sanquineo() {
        return tipo_sanquineo;
    }

    public void setTipo_sanquineo(String tipo_sanquineo) {
        this.tipo_sanquineo = tipo_sanquineo;
    }
}