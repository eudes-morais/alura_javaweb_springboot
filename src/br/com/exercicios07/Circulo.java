package br.com.exercicios07;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * getRaio() * getRaio();
    }

    @Override
    public String toString() {
        return "Círculo";
    }
}
