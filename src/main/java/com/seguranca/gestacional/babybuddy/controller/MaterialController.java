package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Material;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// id, nome, email, senha, nivelAcesso, foto, dataCadastro, statusMaterial;
// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Material")

public class MaterialController {
    List<Material> Materials = new ArrayList<>();
    @GetMapping
    public List<Material> findAll() {
        Material u1 = new Material();
        u1.setId(1L);
        u1.setTitulo("Parto NAtural");
        u1.setData_publicacao(LocalDateTime.now());
        u1.setAutor("Dr. Luana");
        u1.setStatus_material("ATIVO");

        // Adicionando o produto
        Materials.add(u1);

        return Materials;
    }
}
 