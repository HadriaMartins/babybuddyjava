package com.seguranca.gestacional.babybuddy.controller;

import com.seguranca.gestacional.babybuddy.model.entity.Usuario;
import com.seguranca.gestacional.babybuddy.model.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService; // Service, não repository

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll(); // chama o service
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario); // chama o service
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> listarUsuarioPorId(@PathVariable String id) {
        try {
            return ResponseEntity.ok(usuarioService.findById(Long.parseLong(id)));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );


        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Usuario não encontrada com o id " + id
                    )

            );

        }


    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarUsuario(@PathVariable String id, @RequestBody Usuario Usuario) {
        try {
            Long UsuarioId = Long.parseLong(id);
            Usuario UsuarioExistente = usuarioService.findById(UsuarioId); // já lança exceção se não achar

            UsuarioExistente.setNome(Usuario.getNome());

            Usuario UsuarioAtualizada = usuarioService.save(UsuarioExistente);

            return ResponseEntity.ok(UsuarioAtualizada);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Usuario não encontrada com o id " + id
                    )
            );
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluirUsuario(@PathVariable String id) {
        try {
            Long UsuarioId = Long.parseLong(id);
            usuarioService.delete(UsuarioId); // chama o service
            return ResponseEntity.ok(Map.of("message", "Usuario deletada com sucesso"));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Usuario não encontrada com o id " + id
                    )
            );
        }
    }
}