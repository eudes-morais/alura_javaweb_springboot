import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.Recommendation;
import br.com.screenmatch.models.Episodio;
import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Serie;

public class App {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setName("The Matrix");
        movie.setReleaseYear(1999);
        // movie.includedInPlan = true;
        // movie.rating = 8.7;
        // movie.totalRatings = 1500;
        movie.setDurationInMinutes(136);

        movie.displayTechnicalDetails();

        movie.addRating(7.0);
        movie.addRating(6.5);
        movie.addRating(6.5);

        System.out.println("Total das avaliações: " + movie.getTotalOfRating());
        // System.out.println("Total de avaliações: " + movie.totalRatings);
        System.out.println("Média das avaliações: " + movie.getAverageRating());

        Serie serie = new Serie();
        serie.setName("Breaking Bad");
        serie.setReleaseYear(2008);
        serie.setNumberOfSeasons(5);
        serie.showFichaTecnica();
        serie.setMinutesPerEpisode(47);
        serie.setNumberOfSeasons(5);
        serie.setEpisodesPerSeason(12);
        System.out.println("Tempo da série: " + serie.getDurationInMinutes());

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Interstellar");
        anotherMovie.setReleaseYear(2014);
        anotherMovie.setDurationInMinutes(169);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(movie);
        calculadora.inclui(serie);
        calculadora.inclui(anotherMovie);
        System.out.println("Tempo total de maratona: " + calculadora.getTempoTotal());

        Recommendation recommendation = new Recommendation();
        recommendation.isRecommended(movie);

        Episodio episodio = new Episodio();
        episodio.setNumber(1);
        episodio.setSerie(serie);
        episodio.setTotalScore(300);
        recommendation.isRecommended(episodio);

        // ArrayList<Movie> myMovies = new ArrayList<>();       
    }
}
