import br.com.exercicios05.Pessoa;
import java.util.ArrayList;

public class App05 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Eudes");
        p1.setIdade(51);

        Pessoa p2 = new Pessoa();
        p2.setNome("Rafael");
        p2.setIdade(10);

        Pessoa p3 = new Pessoa();
        p3.setNome("Manuela");
        p3.setIdade(2);



        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}
