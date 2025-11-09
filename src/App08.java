import br.com.exercicios08.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App08 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(12);
        listaNumeros.add(450);
        listaNumeros.add(7);
        listaNumeros.add(20);
        listaNumeros.add(300);
        listaNumeros.add(500);
        listaNumeros.add(247);
        listaNumeros.add(132);
        listaNumeros.add(456);
        listaNumeros.add(592);   

        Collections.sort(listaNumeros);
        System.out.printf("Lista ordenada: %s\n", listaNumeros);

        System.out.printf("==================================================================================\n");

        Titulo titulo1 = new Titulo("Blade Runner: O caçador de androides");
        Titulo titulo2 = new Titulo("Lady Hawk: O feitiço de Áquila");
        Titulo titulo3 = new Titulo("Highlander: O guerreiro imortal");
        Titulo titulo4 = new Titulo("Top Gun: Ases indomáveis");
        Titulo titulo5 = new Titulo("Curtindo a vida adoidado");
        Titulo titulo6 = new Titulo("Mulher nota 1000");
        Titulo titulo7 = new Titulo("Apocalipse Now");
        Titulo titulo8 = new Titulo("Fomos heróis");
        Titulo titulo9 = new Titulo("O resgate do soldado Ryan");
        Titulo titulo10 = new Titulo("O homem de aço");
        Titulo titulo11 = new Titulo("Batman o cavaleiro das trevas");
        Titulo titulo12 = new Titulo("Star Wars: A ameaça fantasma");

        List<Titulo> listaFilmes = new ArrayList<>();
        listaFilmes.add(titulo1);
        listaFilmes.add(titulo2);
        listaFilmes.add(titulo3);
        listaFilmes.add(titulo4);
        listaFilmes.add(titulo5);
        listaFilmes.add(titulo6);
        listaFilmes.add(titulo7);
        listaFilmes.add(titulo8);
        listaFilmes.add(titulo9);
        listaFilmes.add(titulo10);
        listaFilmes.add(titulo11);
        listaFilmes.add(titulo12);

        Collections.sort(listaFilmes);
        System.out.printf("Lista de filmes ordenada com ArrayList: %s\n", listaFilmes);

        List<Titulo> lFilmes = new LinkedList<>();
        lFilmes.add(titulo1);
        lFilmes.add(titulo2);
        lFilmes.add(titulo3);
        lFilmes.add(titulo4);
        lFilmes.add(titulo5);
        lFilmes.add(titulo6);
        lFilmes.add(titulo7);
        lFilmes.add(titulo8);
        lFilmes.add(titulo9);
        lFilmes.add(titulo10);
        lFilmes.add(titulo11);
        lFilmes.add(titulo12);

        Collections.sort(lFilmes);
        System.out.printf("Lista de filmes ordenada com LinkedList: %s\n", lFilmes);

        System.out.printf("==================================================================================\n");

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}