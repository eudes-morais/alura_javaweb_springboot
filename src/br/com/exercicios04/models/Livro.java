package br.com.exercicios04.models;

import br.com.exercicios04.calculos.Calculavel;

public class Livro extends Produto implements Calculavel {
    private String autor;

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.9;
    }
}
