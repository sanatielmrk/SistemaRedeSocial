package com.redesocial.gerenciador;

import com.redesocial.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarUsuario(Usuario usuario) {
        usuario.setId(proximoId++);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso: " + usuario);
    }

    public Usuario buscarPorUsername(String username) {
        return usuarios.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}