package com.redesocial.ui;

import com.redesocial.modelo.Usuario;
import com.redesocial.modelo.Post;
import com.redesocial.modelo.Comentario;

import java.util.Scanner;

public class MenuPrincipal {
    private static Usuario usuario1;
    private static Usuario usuario2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar usuários iniciais
        usuario1 = new Usuario("Maria", "maria123", "maria@email.com", "senha123");
        usuario2 = new Usuario("João", "joao456", "joao@email.com", "senha456");

        while (true) {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Criar Post");
            System.out.println("2. Adicionar Amigo");
            System.out.println("3. Criar Comentário");
            System.out.println("4. Curtir Post");
            System.out.println("5. Exibir Usuários");
            System.out.println("6. Atualizar Usuário");
            System.out.println("7. Atualizar Post");
            System.out.println("8. Deletar Usuário");
            System.out.println("9. Deletar Post");
            System.out.println("10. Deletar Comentário");
            System.out.println("11. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    criarPost(scanner);
                    break;
                case 2:
                    adicionarAmigo(scanner);
                    break;
                case 3:
                    criarComentario(scanner);
                    break;
                case 4:
                    curtirPost(scanner);
                    break;
                case 5:
                    exibirUsuarios();
                    break;
                case 6:
                    atualizarUsuario(scanner);
                    break;
                case 7:
                    atualizarPost(scanner);
                    break;
                case 8:
                    deletarUsuario(scanner);
                    break;
                case 9:
                    deletarPost(scanner);
                    break;
                case 10:
                    deletarComentario(scanner);
                    break;
                case 11:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Método de criação de Post
    private static void criarPost(Scanner scanner) {
        System.out.print("Digite o conteúdo do post: ");
        String conteudo = scanner.nextLine();
        Post post = new Post(usuario1, conteudo);
        usuario1.adicionarPost(post);
        System.out.println("Post criado com sucesso!");
    }

    // Método de adicionar amigo
    private static void adicionarAmigo(Scanner scanner) {
        System.out.println("Escolha o amigo para adicionar: ");
        System.out.println("1. João");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (escolha == 1) {
            usuario1.adicionarAmigo(usuario2);
            System.out.println("João adicionado como amigo!");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    // Método de criação de Comentário
    private static void criarComentario(Scanner scanner) {
        System.out.print("Digite o conteúdo do comentário: ");
        String conteudo = scanner.nextLine();
        Comentario comentario = new Comentario(usuario1, conteudo, usuario1.getPosts().get(0)); // Criar comentário no primeiro post
        usuario1.getPosts().get(0).adicionarComentario(comentario);
        System.out.println("Comentário criado com sucesso!");
    }

    // Método de curtir Post
    private static void curtirPost(Scanner scanner) {
        usuario1.getPosts().get(0).adicionarCurtida(usuario1);
        System.out.println("Post curtido!");
    }

    // Método de exibir usuários
    private static void exibirUsuarios() {
        System.out.println("Usuários:");
        System.out.println(usuario1);
        System.out.println(usuario2);
    }

    // Método de atualizar dados do usuário
    private static void atualizarUsuario(Scanner scanner) {
        System.out.println("Escolha o que deseja atualizar: ");
        System.out.println("1. Nome");
        System.out.println("2. Username");
        System.out.println("3. Email");
        System.out.print("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        switch (escolha) {
            case 1:
                System.out.print("Digite o novo nome: ");
                String novoNome = scanner.nextLine();
                usuario1.setNome(novoNome);
                System.out.println("Nome atualizado!");
                break;
            case 2:
                System.out.print("Digite o novo username: ");
                String novoUsername = scanner.nextLine();
                usuario1.setUsername(novoUsername);
                System.out.println("Username atualizado!");
                break;
            case 3:
                System.out.print("Digite o novo email: ");
                String novoEmail = scanner.nextLine();
                usuario1.setEmail(novoEmail);
                System.out.println("Email atualizado!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    // Método de atualizar conteúdo do post
    private static void atualizarPost(Scanner scanner) {
        System.out.print("Digite o novo conteúdo do post: ");
        String novoConteudo = scanner.nextLine();
        usuario1.getPosts().get(0).setConteudo(novoConteudo); // Atualizando o primeiro post
        System.out.println("Post atualizado com sucesso!");
    }

    // Método de deletar usuário
    private static void deletarUsuario(Scanner scanner) {
        System.out.print("Tem certeza que deseja excluir o usuário? (S/N): ");
        String confirmacao = scanner.nextLine();

        if (confirmacao.equalsIgnoreCase("S")) {
            usuario1 = null;  // Remover o usuário
            System.out.println("Usuário excluído com sucesso!");
        } else {
            System.out.println("Exclusão cancelada.");
        }
    }

    // Método de deletar post
    private static void deletarPost(Scanner scanner) {
        System.out.print("Tem certeza que deseja excluir o post? (S/N): ");
        String confirmacao = scanner.nextLine();

        if (confirmacao.equalsIgnoreCase("S")) {
            usuario1.getPosts().clear(); // Exclui todos os posts do usuário
            System.out.println("Post excluído com sucesso!");
        } else {
            System.out.println("Exclusão cancelada.");
        }
    }

    // Método de deletar comentário
    private static void deletarComentario(Scanner scanner) {
        if (!usuario1.getPosts().get(0).getComentarios().isEmpty()) {
            System.out.print("Tem certeza que deseja excluir o comentário? (S/N): ");
            String confirmacao = scanner.nextLine();

            if (confirmacao.equalsIgnoreCase("S")) {
                usuario1.getPosts().get(0).getComentarios().clear(); // Exclui todos os comentários
                System.out.println("Comentário excluído com sucesso!");
            } else {
                System.out.println("Exclusão cancelada.");
            }
        } else {
            System.out.println("Não há comentários para excluir.");
        }
    }
}