package br.com.exercicios04.models;
import br.com.exercicios04.calculos.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private final double comprimento;
    private final double largura;

    public CalculadoraSalaRetangular(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}
