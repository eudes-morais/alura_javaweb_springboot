package br.com.exercicios04.models;

import br.com.exercicios04.calculos.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel {
    private double preco;
    
    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
