package br.com.asilva;

import java.util.ArrayList;
import java.util.List;

/**
 *@author alex.silva
 */


public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();


    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarLivro(Livro livro1) {
    }
}