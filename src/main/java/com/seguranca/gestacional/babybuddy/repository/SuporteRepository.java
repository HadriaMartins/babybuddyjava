package com.seguranca.gestacional.babybuddy.repository;

import com.seguranca.gestacional.babybuddy.model.entity.Suporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuporteRepository extends JpaRepository<Suporte, Integer> {
}
