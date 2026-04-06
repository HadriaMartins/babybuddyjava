package com.seguranca.gestacional.babybuddy.services;

import com.seguranca.gestacional.babybuddy.model.entity.Usuario;
import com.seguranca.gestacional.babybuddy.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        usuario.setStatusUsuario("ATIVO");
        return usuarioRepository.save(usuario);
    }

    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado: " + id));
    }

    public void delete(Integer id) {
        usuarioRepository.delete(findById(id));
    }
}
