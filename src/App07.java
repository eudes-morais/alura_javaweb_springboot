import br.com.exercicios07.Animal;
import br.com.exercicios07.Cachorro;
import br.com.exercicios07.Circulo;
import br.com.exercicios07.ContaBancaria;
import br.com.exercicios07.Forma;
import br.com.exercicios07.Produto;
import br.com.exercicios07.Quadrado;
import java.util.ArrayList;

public class App07 {
    public static void main(String[] args) {
        
        ArrayList<String> listaDeString = new ArrayList<>();
        listaDeString.add("XC60");
        listaDeString.add("XC90");
        listaDeString.add("EC40");
        listaDeString.add("EX30");
        listaDeString.add("EX40");
        listaDeString.add("EX90");

        int index = 1;
        for (String elemString : listaDeString) {
            System.out.println(index + ") " + elemString);
            index++;
        }

        System.out.println("====================================================================");

        Cachorro toto = new Cachorro();

        if (toto instanceof Cachorro) {
            Animal totoAnimal = (Animal)toto;

            System.out.println(totoAnimal);
        }

        System.out.println("====================================================================");

        Produto produto1 = new Produto("Computador", 3500.00);
        Produto produto2 = new Produto("Monitor", 1500.00);
        Produto produto3 = new Produto("Mouse", 500.00);
        // Produto produto4 = new Produto("Te", 3500.00);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        // listaProdutos.add(produto4);

        double totalPreco = 0;
        for (Produto produto : listaProdutos) {
            totalPreco+=produto.getPreco();
        }

        double precoMedio = totalPreco/listaProdutos.size();

        System.out.printf("Preço médio dos produtos: %.2f\n", precoMedio);

        System.out.println("====================================================================");

        Circulo circulo = new Circulo(8);

        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma elem : listaFormas) {
            double area = elem.calcularArea();
            System.out.printf("Área do %s: %.2f\n", elem.toString(), area); 
        }

        System.out.println("====================================================================");

        ContaBancaria conta1 = new ContaBancaria("0001-1", 5000.00);
        ContaBancaria conta2 = new ContaBancaria("0002-2", 3000.00);
        ContaBancaria conta3 = new ContaBancaria("0003-3", 2500.00);
        ContaBancaria conta4 = new ContaBancaria("0004-4", 3600.00);
        ContaBancaria conta5 = new ContaBancaria("0005-5", 300.00);
        ContaBancaria conta6 = new ContaBancaria("0006-6", 30000.00);
        ContaBancaria conta7 = new ContaBancaria("0007-7", 2750.00);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        contas.add(conta6);
        contas.add(conta7);

        double maiorSaldo = 0;
        String contaMor = "";
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
                contaMor = conta.getNumeroConta();
            }
        }

        System.out.printf("Conta com maior saldo: %s\n", contaMor);
    }
}
