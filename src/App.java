public class App {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.name = "The Matrix";
        movie.releaseYear = 1999;
        // movie.includedInPlan = true;
        // movie.rating = 8.7;
        // movie.totalRatings = 1500;
        movie.durationInMinutes = 136;

        movie.displayTechnicalDetails();

        movie.addRating(10.0);
        movie.addRating(8.5);
        movie.addRating(9.5);

        System.out.println("Soma das avaliações: " + movie.sumOfRating);
        System.out.println("Total de avaliações: " + movie.totalRatings);
        System.out.println("Média das avaliações: " + movie.getAverageRating());
    }
}
