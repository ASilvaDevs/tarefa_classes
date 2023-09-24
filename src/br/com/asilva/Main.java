package br.com.asilva;

/**
*@author alex.silva
*/

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();


        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true);
        Livro livro2 = new Livro("1984", "George Orwell", true);
        Livro livro3 = new Livro("O Nome do Vento", "Patrick Rothfuss", true);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Usuario user1 = new Usuario("Alice", "001");
        Usuario user2 = new Usuario("Bob", "002");

        biblioteca.adicionarUsuario(user1);
        biblioteca.adicionarUsuario(user2);

        }
    }

