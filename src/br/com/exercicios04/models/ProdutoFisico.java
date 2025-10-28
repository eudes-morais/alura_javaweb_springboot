package br.com.exercicios04.models;

import br.com.exercicios04.calculos.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 1.05;
    }
}
