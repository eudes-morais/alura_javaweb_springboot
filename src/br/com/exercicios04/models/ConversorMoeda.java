package br.com.exercicios04.models;

import br.com.exercicios04.calculos.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CONVERSAO = 5.25; // Exemplo de taxa de conversão

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * TAXA_CONVERSAO;
    }
}
