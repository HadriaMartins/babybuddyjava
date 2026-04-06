package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Gestacao")
public class Gestacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "gestante_id")
    private Gestante gestante;

    @Column(name = "data_inicio", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "data_prevista_parto", nullable = false)
    private LocalDateTime dataPrevistaParto;

    @Column(name = "data_parto")
    private LocalDateTime dataParto;

    @Column(name = "tipo_gestacao", nullable = false, length = 100)
    private String tipoGestacao;

    @Column(nullable = false, length = 200)
    private String observacoes;

    @Column(name = "status_gestacao", nullable = false, length = 30)
    private String statusGestacao;

    public Gestacao() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Gestante getGestante() { return gestante; }
    public void setGestante(Gestante gestante) { this.gestante = gestante; }

    public LocalDateTime getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDateTime dataInicio) { this.dataInicio = dataInicio; }

    public LocalDateTime getDataPrevistaParto() { return dataPrevistaParto; }
    public void setDataPrevistaParto(LocalDateTime dataPrevistaParto) { this.dataPrevistaParto = dataPrevistaParto; }

    public LocalDateTime getDataParto() { return dataParto; }
    public void setDataParto(LocalDateTime dataParto) { this.dataParto = dataParto; }

    public String getTipoGestacao() { return tipoGestacao; }
    public void setTipoGestacao(String tipoGestacao) { this.tipoGestacao = tipoGestacao; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public String getStatusGestacao() { return statusGestacao; }
    public void setStatusGestacao(String statusGestacao) { this.statusGestacao = statusGestacao; }
}
