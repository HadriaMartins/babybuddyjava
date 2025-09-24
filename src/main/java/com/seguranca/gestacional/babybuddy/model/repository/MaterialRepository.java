package com.seguranca.gestacional.babybuddy.model.repository;

import com.seguranca.gestacional.babybuddy.model.entity.Material;
import com.seguranca.gestacional.babybuddy.model.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
}
