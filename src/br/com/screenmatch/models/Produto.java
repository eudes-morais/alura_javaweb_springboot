package br.com.screenmatch.models;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double desconto = preco * (percentual / 100);
            preco -= desconto;
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }
}
