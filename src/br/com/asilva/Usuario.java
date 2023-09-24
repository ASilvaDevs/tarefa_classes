package br.com.asilva;

import java.util.ArrayList;
import java.util.List;

/**
 *@author alex.silva
 */

public class Usuario {
    private String nome;
    private String ID;
    private List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, String ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public String getID() {
        return ID;
    }

    public void emprestaLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void retornaLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}

