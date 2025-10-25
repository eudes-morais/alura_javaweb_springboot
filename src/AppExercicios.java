
import br.com.exercicios04.models.CalculadoraSalaRetangular;
import br.com.exercicios04.models.ConversorMoeda;

public class AppExercicios {
    public static void main(String[] args) {
        // Conversor de moeda
        ConversorMoeda conversor = new ConversorMoeda();
        double valorEmDolar = 100.0;
        double valorEmReal = conversor.converterDolarParaReal(valorEmDolar);
        System.out.println(valorEmDolar + " dólares equivalem a " + valorEmReal + " reais.");
        System.out.println("-----------------------------------");

        // Calculadora de sala retangular
        double comprimento = 5.0;
        double largura = 3.0;
        CalculadoraSalaRetangular calculadoraSala = new CalculadoraSalaRetangular(comprimento, largura);
        double area = calculadoraSala.calcularArea();
        double perimetro = calculadoraSala.calcularPerimetro();
        System.out.println("Área da sala: " + area + " m²");
        System.out.println("Perímetro da sala: " + perimetro + " m");
    }
}
