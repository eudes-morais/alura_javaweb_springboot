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

        movie.addRating(10.0);
        movie.addRating(8.5);
        movie.addRating(9.5);

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

        // =========================================================================================

        // ContaBancaria conta = new ContaBancaria();
        
        // conta.setNumeroConta(123);
        // conta.setSaldo(1000);
        // conta.titular = "João";

        // System.out.println("Número da Conta: " + conta.getNumeroConta());
        // System.out.println("Saldo: " + conta.getSaldo());
        // System.out.println("Titular: " + conta.titular);

        // conta.setSaldo(1500);
        // System.out.println("Novo Saldo: " + conta.getSaldo());

        // =========================================================================================

        // IdadePessoa pessoa1 = new IdadePessoa();
        // pessoa1.setNome("Carowl");
        // pessoa1.setIdade(22);

        // IdadePessoa pessoa2 = new IdadePessoa();
        // pessoa2.setNome("Camila");
        // pessoa2.setIdade(20);

        // System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        // pessoa1.verificarIdade();

        // System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        // pessoa2.verificarIdade();

        // =========================================================================================

        // Produto produto = new Produto();
        // produto.setNome("Celular");
        // produto.setPreco(2000.0);

        // System.out.println("Nome do Produto: " + produto.getNome());
        // System.out.println("Preço: " + produto.getPreco());

        // produto.aplicarDesconto(10);
        // System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}
