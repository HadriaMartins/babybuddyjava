package com.seguranca.gestacional.babybuddy.model.entity;

import java.time.LocalDateTime;

public class Gestante {
    private Long id;
    private double cpf;
    private double telefone;
    private LocalDateTime data_cadastro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}