package com.seguranca.gestacional.babybuddy.model.entity;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class GestacaoHistorico {

    private Long id;
    private LocalDateTime data_registro;
    private String observacoes;
    private Double peso_materno;
    private DecimalFormat pressao_arterial;
    private DecimalFormat semana_gestacional;

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

    public Double getPeso_materno() {
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

    public DecimalFormat getSemana_gestacional() {
        return semana_gestacional;
    }

    public void setSemana_gestacional(DecimalFormat semana_gestacional) {
        this.semana_gestacional = semana_gestacional;
    }
}
