package com.redesocial;

import com.redesocial.modelo.Usuario;
import com.redesocial.modelo.Post;
import com.redesocial.modelo.Comentario;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario usuario1 = new Usuario("Maria", "maria123", "maria@email.com", "senha123");
        Usuario usuario2 = new Usuario("João", "joao456", "joao@email.com", "senha456");

        // Adicionando amigo
        usuario1.adicionarAmigo(usuario2);

        // Criando post
        Post post1 = new Post(usuario1, "Primeiro post de Maria!");

        // Adicionando post ao usuário
        usuario1.adicionarPost(post1);

        // Criando comentário
        Comentario comentario1 = new Comentario(usuario2, "Legal o post, Maria!", post1);

        // Adicionando comentário ao post
        post1.adicionarComentario(comentario1);

        // Curtindo o post
        post1.adicionarCurtida(usuario2);

        // Exibindo informações
        System.out.println("Usuário: " + usuario1.getNome() + " (" + usuario1.getUsername() + ")");
        System.out.println("Amigos de " + usuario1.getNome() + ":");
        for (Usuario amigo : usuario1.getAmigos()) {
            System.out.println("- " + amigo.getNome());
        }

        System.out.println("\nPost do usuário " + usuario1.getUsername() + ":");
        System.out.println(post1);

        System.out.println("\nComentários no post:");
        for (Comentario comentario : post1.getComentarios()) {
            System.out.println(comentario);
        }

        System.out.println("\nCurtidas no post:");
        for (Usuario curtidor : post1.getCurtidas()) {
            System.out.println(curtidor.getUsername());
        }
    }
}