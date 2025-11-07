package br.com.screenmatch.principal;

import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.models.Titulo;
import java.util.ArrayList;
import java.util.Collections;

public class Listas {
    public static void main(String[] args) {
        Movie movie = new Movie("The Matrix", 1999);
        movie.addRating(9);
        Movie anotherMovie = new Movie("Interstellar", 2014);
        anotherMovie.addRating(6);
        var oneMoreMovie = new Movie("Dogville", 2003);
        oneMoreMovie.addRating(10);
        Serie serie = new Serie("Breaking Bad", 2008);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(movie);
        lista.add(anotherMovie);
        lista.add(oneMoreMovie);
        lista.add(serie);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Primeiro filme: " + lista.get(0).getName());
        // System.out.println(lista);
        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Movie iMovie && iMovie.getClassificacao() > 2) {
                System.out.println("Classificação: " + iMovie.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.printf("Lista de títulos ordenados alfabeticamente: %s", lista);
    }
}
