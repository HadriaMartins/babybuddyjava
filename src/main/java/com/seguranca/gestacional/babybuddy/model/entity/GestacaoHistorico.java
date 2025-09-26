package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Entity
public class GestacaoHistorico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_registro", nullable = false)
    private LocalDateTime data_registro;
    @Column(length = 200, nullable = false)
    private String observacoes;
    @Column(length = 6, nullable = false)
    private double peso_materno;
    @Column(length = 20, nullable = false)
    private DecimalFormat pressao_arterial;
    @Column(length = 100, nullable = false)
    private String semana_gestacional;

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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getPeso_materno() {
        return peso_materno;
    }

    public void setPeso_materno(double peso_materno) {
        this.peso_materno = peso_materno;
    }

    public DecimalFormat getPressao_arterial() {
        return pressao_arterial;
    }

    public void setPressao_arterial(DecimalFormat pressao_arterial) {
        this.pressao_arterial = pressao_arterial;
    }

    public String getSemana_gestacional() {
        return semana_gestacional;
    }

    public void setSemana_gestacional(String semana_gestacional) {
        this.semana_gestacional = semana_gestacional;
    }
}
