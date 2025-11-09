
import br.com.desafio.CartaoCredito;
import br.com.desafio.Compra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o valor do limite do cartão: ");
        double limiteCartao = ler.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limiteCartao);
        List<Compra> listaCompras = new ArrayList<>();

        int sair = 0;
        while (sair == 0) {
            System.out.println("Informe o nome da compra: ");
            String nome = ler.next();

            System.out.println("Informe o valor da compra: ");
            double valor = ler.nextDouble();

            Compra compra = new Compra(nome, valor);
            boolean compraRealizada = cartao.podeComprar(compra);

            if (compraRealizada) {
                listaCompras.add(compra);
                System.out.printf("Compra realizada!\n");
                System.out.printf("Deseja cadastrar mais algum produto? (0-Sim, 1-Não): ");
                sair = ler.nextInt();
            } else {
                System.out.printf("Saldo insuficiente!\n");
                sair = 1;
            }
        }

        System.out.printf("************************************************************\n");
        System.out.printf("Compras realizadas:\n");
        Collections.sort(listaCompras);
        
        double valorTotalCompras = 0;
        for (Compra umaCompra : listaCompras) {
            System.out.printf("%s - %s\n", umaCompra.getNome(), umaCompra.getValor());
            valorTotalCompras += umaCompra.getValor();
        }

        System.out.printf("************************************************************\n");
        System.out.printf("Saldo no cartão: %.2f\n", cartao.getSaldo());

        System.out.printf("************************************************************\n");
        System.out.printf("Valor total das compras: %.2f\n", valorTotalCompras);
    }
}
