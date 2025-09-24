package com.seguranca.gestacional.babybuddy.model.repository;


import com.seguranca.gestacional.babybuddy.model.entity.Favorito;
import com.seguranca.gestacional.babybuddy.model.entity.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {
}
