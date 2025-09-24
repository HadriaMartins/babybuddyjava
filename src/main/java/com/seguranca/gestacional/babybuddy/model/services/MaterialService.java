package com.seguranca.gestacional.babybuddy.model.services;

import com.seguranca.gestacional.babybuddy.model.entity.Material;
import com.seguranca.gestacional.babybuddy.model.repository.MaterialRepository;
import com.seguranca.gestacional.babybuddy.model.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> findAll() {
        return materialRepository.findAll();
    }

    public Material save(Material material) {
        material.setStatus_material(true);
        return materialRepository.save(material);
    }
}