
import br.com.exercicios04.models.CalculadoraSalaRetangular;
import br.com.exercicios04.models.ConversorMoeda;
import br.com.exercicios04.models.ConversorTemperaturaPadrao;
import br.com.exercicios04.models.TabuadaMultiplicacao;

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
        System.out.println("-----------------------------------");

        // Tabuada
        int numero = 7;
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(numero);
        System.out.println("-----------------------------------");

        // Conversor de temperaturas
        ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
        double celsius = 20.0;
        double fahrenheit = 60.0;
        double tempFahrenheit = conversorTemp.celsiusParaFahrenheit(celsius);
        double tempCelsius = conversorTemp.fahrenheitParaCelsius(fahrenheit);
        System.out.println(celsius + "°C = " + tempFahrenheit + "°F");
        System.out.println(fahrenheit + "°F = " + tempCelsius + "°C");
        System.out.println("-----------------------------------");
    }
}
