package br.com.asilva;

/**
 *@author alex.silva
 */

public class Livro {
    private String titulo;
    private String autor;
    private boolean isDisponivel;

    public Livro(String titulo, String autor, boolean isDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isDisponivel = isDisponivel;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void emprestar() {
        this.isDisponivel = false;
    }

    public void retornar() {
        this.isDisponivel = true;
    }
}