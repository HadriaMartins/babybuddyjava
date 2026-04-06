package com.seguranca.gestacional.babybuddy.repository;

import com.seguranca.gestacional.babybuddy.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
