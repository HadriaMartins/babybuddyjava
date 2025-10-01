package com.seguranca.gestacional.babybuddy.model.services;

import com.seguranca.gestacional.babybuddy.model.entity.Usuario;
import com.seguranca.gestacional.babybuddy.model.repository.UsuarioRepository;
import com.seguranca.gestacional.babybuddy.model.services.UsuarioService;
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
        usuario.setStatusUsuario(true);
        return usuarioRepository.save(usuario);
    }

    // Método responsável em listar o Usuario por ID
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o id " + id));
    }

    // Método responsável em atualizar em atualizar a Usuario
    public Usuario update(Long id, Usuario Usuario) {
        Usuario usuarioExistente = findById(id);
        usuarioExistente.setNome(Usuario.getNome());
        usuarioExistente.setStatusUsuario(Usuario.isStatusUsuario());

        return usuarioRepository.save(usuarioExistente);
    }

    // Método responsável em excluir a Usuario ( exclusão física )
    public void delete(Long id) {


        Usuario usuarioExistente = findById(id);
        usuarioRepository.delete(usuarioExistente);
    }
}