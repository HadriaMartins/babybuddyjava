package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Gestacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_inicio", nullable = false)
    private LocalDateTime data_inicio;
    @Column(name = "data_prevista_parto", nullable = false)
    private LocalDateTime data_prevista_parto;
    @Column(name = "data_parto", nullable = false)
    private LocalDateTime data_parto;
    @Column(length = 100, nullable = false)
    private String tipo_gestacao;
    @Column(length = 200, nullable = false)
    private String observacoes;
    @Column
    private boolean status_gestacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDateTime getData_prevista_parto() {
        return data_prevista_parto;
    }

    public void setData_prevista_parto(LocalDateTime data_prevista_parto) {
        this.data_prevista_parto = data_prevista_parto;
    }

    public LocalDateTime getData_parto() {
        return data_parto;
    }

    public void setData_parto(LocalDateTime data_parto) {
        this.data_parto = data_parto;
    }

    public String getTipo_gestacao() {
        return tipo_gestacao;
    }

    public void setTipo_gestacao(String tipo_gestacao) {
        this.tipo_gestacao = tipo_gestacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public boolean isStatus_gestacao() {
        return status_gestacao;
    }

    public void setStatus_gestacao(boolean status_gestacao) {
        this.status_gestacao = status_gestacao;
    }
}



