package br.com.desafio;

public class Compra implements Comparable<Compra> {
    private final String nome;
    private final double valor;

    public Compra(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("Compra: %s, valor: %s\n", getNome(), getValor());
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valor, outraCompra.getValor());
    }
}
