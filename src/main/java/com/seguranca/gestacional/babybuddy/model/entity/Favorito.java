package com.seguranca.gestacional.babybuddy.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Favorit")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    @Column(name = "data_favoritada", nullable = false)
    private LocalDateTime dataFavoritada;

    public Favorito() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public LocalDateTime getDataFavoritada() {
        return dataFavoritada;
    }

    public void setDataFavoritada(LocalDateTime dataFavoritada) {
        this.dataFavoritada = dataFavoritada;
    }

    public void setData_favoritado(LocalDateTime dataFavoritada) {
        this.dataFavoritada = dataFavoritada;
    }
}
