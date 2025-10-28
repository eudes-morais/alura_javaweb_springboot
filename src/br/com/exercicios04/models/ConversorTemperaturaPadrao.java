package br.com.exercicios04.models;

import br.com.exercicios04.calculos.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        double conv_fahrenheit = (celsius * 1.8) + 32;
        return conv_fahrenheit;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        double conv_celsius = (fahrenheit - 32) * 5/9;
        return conv_celsius;
    }
}
