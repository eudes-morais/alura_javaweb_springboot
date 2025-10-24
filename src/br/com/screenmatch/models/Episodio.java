package br.com.screenmatch.models;

import br.com.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {
    private int number;
    private String name;
    private Serie serie;
    private int totalScore;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public int getClassificacao() {
        if (totalScore > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
