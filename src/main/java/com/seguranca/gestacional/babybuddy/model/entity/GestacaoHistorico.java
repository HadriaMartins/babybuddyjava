package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "GestacaoHistorico")
public class GestacaoHistorico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "gestacao_id")
    private Gestacao gestacao;

    @Column(name = "data_registro", nullable = false)
    private LocalDateTime dataRegistro;

    @Column(nullable = false, length = 200)
    private String observacoes;

    @Column(name = "peso_materno", nullable = false, precision = 5, scale = 2)
    private Double pesoMaterno;

    @Column(name = "pressao_arterial", nullable = false, length = 20)
    private String pressaoArterial;

    @Column(name = "semana_gestacional", nullable = false)
    private Integer semanaGestacional;

    public GestacaoHistorico() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Gestacao getGestacao() { return gestacao; }
    public void setGestacao(Gestacao gestacao) { this.gestacao = gestacao; }

    public LocalDateTime getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(LocalDateTime dataRegistro) { this.dataRegistro = dataRegistro; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public Double getPesoMaterno() { return pesoMaterno; }
    public void setPesoMaterno(Double pesoMaterno) { this.pesoMaterno = pesoMaterno; }

    public String getPressaoArterial() { return pressaoArterial; }
    public void setPressaoArterial(String pressaoArterial) { this.pressaoArterial = pressaoArterial; }

    public Integer getSemanaGestacional() { return semanaGestacional; }
    public void setSemanaGestacional(Integer semanaGestacional) { this.semanaGestacional = semanaGestacional; }
}
