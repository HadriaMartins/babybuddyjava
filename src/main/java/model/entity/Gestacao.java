package model.entity;

import java.time.LocalDateTime;

public class Gestacao {
    private Long id;
    private LocalDateTime data_inicio;
    private LocalDateTime data_prevista_parto;
    private String tipo_gestacao;
    private String risco;
    private String observacoes;

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

    public String getTipo_gestacao() {
        return tipo_gestacao;
    }

    public void setTipo_gestacao(String tipo_gestacao) {
        this.tipo_gestacao = tipo_gestacao;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}



