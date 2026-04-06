package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Agenda")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(length = 200)
    private String informacao;

    @Column(name = "data_agendada", nullable = false)
    private LocalDateTime dataAgendada;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "status_agenda", nullable = false, length = 100)
    private String statusAgenda;

    public Agenda() {
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

    public void setStatus_agenda(boolean v) { this.statusAgenda = v ? "ATIVO" : "INATIVO"; }
    public void setData_cadastro(java.time.LocalDateTime v) { this.dataCadastro = v; }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public LocalDateTime getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDateTime dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatusAgenda() {
        return statusAgenda;
    }

    public void setStatusAgenda(String statusAgenda) {
        this.statusAgenda = statusAgenda;
    }
}