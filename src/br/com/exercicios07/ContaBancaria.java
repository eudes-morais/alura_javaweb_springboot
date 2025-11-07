package br.com.exercicios07;

public class ContaBancaria {
    private final String numeroConta;
    private final double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Número da Conta: " + getNumeroConta();
    }
}
