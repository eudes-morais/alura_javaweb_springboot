package br.com.screenmatch.calculos;

public class Recommendation {
    public void isRecommended(Classificacao classificacao) {
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Altamente recomendado!");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Recomendado.");
        } else {   
            System.out.println("Adicione na sua lista");
        }
    }
}
