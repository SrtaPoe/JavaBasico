package Exercicios;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double temperaturaCelsius;
        System.out.println("Digite a temperatura em Celsius: ");
        temperaturaCelsius = dadoEntrada.nextDouble();

        double conversaoCelsiusFarenheit = (temperaturaCelsius * 9 / 5)+32;

        System.out.println("A temperatura em Farenheit é de " +conversaoCelsiusFarenheit);

    }
}

/*
    Faça um Programa que peça a temperatura em graus Celsius,
    transforme e mostre em graus Farenheit.
 */