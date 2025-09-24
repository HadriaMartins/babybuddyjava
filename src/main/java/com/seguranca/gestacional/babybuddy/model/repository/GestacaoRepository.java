package com.seguranca.gestacional.babybuddy.model.repository;


import com.seguranca.gestacional.babybuddy.model.entity.Gestacao;
import com.seguranca.gestacional.babybuddy.model.entity.Gestacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestacaoRepository extends JpaRepository<Gestacao, Long> {
}
