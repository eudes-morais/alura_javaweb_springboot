package br.com.exercicios04.models;

import br.com.exercicios04.calculos.Calculavel;

public class Livro extends Produto implements Calculavel {
    private String autor;
    private double preco;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
