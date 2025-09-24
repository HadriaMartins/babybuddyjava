package com.seguranca.gestacional.babybuddy.model.repository;


import com.seguranca.gestacional.babybuddy.model.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
