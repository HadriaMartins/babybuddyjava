package com.seguranca.gestacional.babybuddy.model.entity;

import java.time.LocalDateTime;

public class GestacaoHistorico {

    private Long id;
    private LocalDateTime data_registro;
    private String observacoes;
    private String peso_materno;
    private String pressao_arterial;
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

    public String getPeso_materno() {
        return peso_materno;
    }

    public void setPeso_materno(String peso_materno) {
        this.peso_materno = peso_materno;
    }

    public String getPressao_arterial() {
        return pressao_arterial;
    }

    public void setPressao_arterial(String pressao_arterial) {
        this.pressao_arterial = pressao_arterial;
    }

    public String getSemana_gestacional() {
        return semana_gestacional;
    }

    public void setSemana_gestacional(String semana_gestacional) {
        this.semana_gestacional = semana_gestacional;
    }
}
