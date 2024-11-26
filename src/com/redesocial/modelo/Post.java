package com.redesocial.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private int id;
    private Usuario autor;
    private String conteudo;
    private LocalDateTime dataPublicacao;
    private List<Usuario> curtidas = new ArrayList<>();
    private List<Comentario> comentarios = new ArrayList<>();

    // Construtor completo
    public Post(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicacao = LocalDateTime.now();
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Usuario getAutor() { return autor; }
    public String getConteudo() { return conteudo; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }
    public LocalDateTime getDataPublicacao() { return dataPublicacao; }
    public List<Usuario> getCurtidas() { return curtidas; }
    public List<Comentario> getComentarios() { return comentarios; }

    // Adicionar curtida e comentário
    public void adicionarCurtida(Usuario usuario) { curtidas.add(usuario); }
    public void adicionarComentario(Comentario comentario) { comentarios.add(comentario); }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", autor=" + autor.getUsername() +
                ", conteudo='" + conteudo + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                '}';
    }
}