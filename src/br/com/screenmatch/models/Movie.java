package br.com.screenmatch.models;

import br.com.screenmatch.calculos.Classificacao;

public class Movie extends Titulo implements Classificacao {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int)getMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme:" + this.getName();
    }
}
