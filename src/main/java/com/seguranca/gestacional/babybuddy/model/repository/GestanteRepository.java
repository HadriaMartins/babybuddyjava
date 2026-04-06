package com.seguranca.gestacional.babybuddy.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestanteRepository extends JpaRepository<Gestante, Long> {
}
