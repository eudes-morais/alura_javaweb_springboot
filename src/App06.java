import br.com.exercicios06.Produto;
import br.com.exercicios06.ProdutoPerecivel;
import java.util.ArrayList;

public class App06 {
    public static void main(String[] args) {
        

        Produto p1 = new Produto("Televisor 20pol",2000.00,20);
        Produto p2 = new Produto("Computador",3500.00,50);
        Produto p3 = new Produto("XBOX",5000.00,30);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Segundo Produto: " + listaDeProdutos.get(1).getNome());
        // System.out.println(listaDeProdutos);
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println("Produto " + (i+1) + ": " + listaDeProdutos.get(i));
        }



        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Iogurte", 10.00, 200, "05/11/2025");
        System.out.println(produtoPerecivel);
    }
}
