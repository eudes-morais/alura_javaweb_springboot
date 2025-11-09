package br.com.exercicios08;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo nomeTitulo) {
        return this.getNome().compareTo(nomeTitulo.getNome());
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
