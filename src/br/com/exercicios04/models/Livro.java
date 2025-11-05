package br.com.exercicios04.models;

import br.com.exercicios04.calculos.Calculavel;

public class Livro extends Produto implements Calculavel {
    private String autor;
    private double preco;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
