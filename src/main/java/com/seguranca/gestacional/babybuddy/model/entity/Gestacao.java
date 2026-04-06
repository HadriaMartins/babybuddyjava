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
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "data_inicio", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "data_prevista_parto", nullable = false)
    private LocalDateTime dataPrevistaParto;

    @Column(name = "data_parto")
    private LocalDateTime dataParto;

    @Column(name = "tipo_gestacao", nullable = false, length = 100)
    private String tipoGestacao;

    @Column(name = "esta_na_sua_primeira_gestacao", nullable = false, length = 100)
    private String estaNaSuaPrimeiraGestacao;

    @Column(nullable = false, length = 200)
    private String observacoes;

    @Column(name = "status_gestacao", nullable = false, length = 30)
    private String statusGestacao;

    public Gestacao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id == null ? null : id.intValue();
    }

    public void setData_inicio(java.time.LocalDateTime v) { this.dataInicio = v; }
    public void setData_prevista_parto(java.time.LocalDateTime v) { this.dataPrevistaParto = v; }
    public void setTipo_gestacao(String v) { this.tipoGestacao = v; }
    public void setStatus_gestacao(boolean v) { this.statusGestacao = v ? "ATIVO" : "INATIVO"; }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataPrevistaParto() {
        return dataPrevistaParto;
    }

    public void setDataPrevistaParto(LocalDateTime dataPrevistaParto) {
        this.dataPrevistaParto = dataPrevistaParto;
    }

    public LocalDateTime getDataParto() {
        return dataParto;
    }

    public void setDataParto(LocalDateTime dataParto) {
        this.dataParto = dataParto;
    }

    public String getTipoGestacao() {
        return tipoGestacao;
    }

    public void setTipoGestacao(String tipoGestacao) {
        this.tipoGestacao = tipoGestacao;
    }

    public String getEstaNaSuaPrimeiraGestacao() {
        return estaNaSuaPrimeiraGestacao;
    }

    public void setEstaNaSuaPrimeiraGestacao(String estaNaSuaPrimeiraGestacao) {
        this.estaNaSuaPrimeiraGestacao = estaNaSuaPrimeiraGestacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getStatusGestacao() {
        return statusGestacao;
    }

    public void setStatusGestacao(String statusGestacao) {
        this.statusGestacao = statusGestacao;
    }
}