# Sistema de Rede Social

![Java](https://img.shields.io/badge/Java-17-orange)
![Status](https://img.shields.io/badge/Status-Stable-green)
![License](https://img.shields.io/badge/License-MIT-blue)

## 📋 Descrição

Sistema de rede social simples desenvolvido em Java, que permite realizar operações de cadastro, postagem, comentário, curtidas e interação entre usuários. O sistema possui uma interface via console e oferece funcionalidades essenciais de uma rede social, como a gestão de amigos e posts.

## 🎯 Funcionalidades

- Cadastro de usuários
- Criação de posts
- Adicionar e remover amigos
- Curtir posts
- Comentários em posts
- Excluir e atualizar dados
- Exibição de dados no console com uma interface simples

## 🔧 Tecnologias Utilizadas

- Programação Orientada a Objetos (POO)
- Tratamento de Exceções
- Interface com o usuário via console


## 📌 Classes Principais

### Usuario (modelo)
- Representa a entidade Usuario
- Atributos: id, nome, username, email, senha, dataCadastro, amigos, posts
- Métodos para adicionar/remover amigos e criar posts

### Post (modelo)
- Representa a entidade Post
- Atributos: id, autor (usuario), conteudo, dataPublicacao, curtidas, comentarios
- Métodos para adicionar curtidas e comentários

### Comentario (modelo)
- Representa a entidade Comentario
- Atributos: id, autor (usuario), conteudo, dataComentario, post
- Relacionado com a classe `Post`

### GerenciadorUsuarios (gerenciador)
- Gerencia operações relacionadas aos usuários
- Inclui funcionalidades como adicionar, remover, listar usuários e gerenciar interações

### MenuPrincipal (ui)
- Interface com o usuário via console
- Exibe o menu principal e gerencia a interação com o sistema

### Validador (util)
- Utilitário para validar os dados fornecidos pelos usuários (ex: email, senha)

## 🚀 Como Executar

1. **Requisitos**
    - Java JDK 8 ou superior
    - Terminal para execução do código

2. **Compilação**
   ```bash
   javac -d bin src/com/redesocial/**/*.java
   ```
3.**Execução**
   ```bash   
   java -cp bin com.redesocial.ui.TelaPrincipal
   ```
 ### Menu Principal
=== Menu Principal ===
1. Cadastrar Usuario
2. Criar Post
3. Adicionar Amigo
4. Remover Amigo
5. Curtir Post
6. Comentar em Post
7. Listar Todos os Usuarios
8. Listar Todos os Posts
9. Excluir Usuario
10. Excluir Post
11. Sair

## 🤝 Contribuindo

Para contribuir com o projeto:

1. Faça um fork do repositório
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👤 Autor

Sanatiel Murceski

## 📞 Suporte

Para suporte, envie um email para sanatielmurceski@estudante.sesisenai.org.br

## 🔄 Status do Projeto

O projeto está em desenvolvimento ativo e aberto para contribuições.