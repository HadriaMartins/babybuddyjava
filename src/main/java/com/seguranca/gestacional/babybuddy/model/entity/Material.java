package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String titulo;

    @Column(length = 200)
    private String link;

    @Column(columnDefinition = "VARCHAR(MAX)")
    private String arquivo;

    @Column(name = "data_publicacao", nullable = false)
    private LocalDateTime dataPublicacao;

    @Column(nullable = false, length = 200)
    private String autor;

    @Column(name = "status_material", nullable = false, length = 50)
    private String statusMaterial;

    public Material() {
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

    public void setData_publicacao(java.time.LocalDateTime v) { this.dataPublicacao = v; }
    public void setStatus_material(boolean v) { this.statusMaterial = v ? "ATIVO" : "INATIVO"; }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatusMaterial() {
        return statusMaterial;
    }

    public void setStatusMaterial(String statusMaterial) {
        this.statusMaterial = statusMaterial;
    }
}