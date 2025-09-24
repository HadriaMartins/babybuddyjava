package com.seguranca.gestacional.babybuddy.model.repository;


import com.seguranca.gestacional.babybuddy.model.entity.Evento;
import com.seguranca.gestacional.babybuddy.model.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}
