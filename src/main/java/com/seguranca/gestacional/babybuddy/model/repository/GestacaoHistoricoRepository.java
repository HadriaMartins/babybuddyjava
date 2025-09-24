package com.seguranca.gestacional.babybuddy.model.repository;


import com.seguranca.gestacional.babybuddy.model.entity.GestacaoHistorico;
import com.seguranca.gestacional.babybuddy.model.entity.GestacaoHistorico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestacaoHistoricoRepository extends JpaRepository<GestacaoHistorico, Long> {
}
