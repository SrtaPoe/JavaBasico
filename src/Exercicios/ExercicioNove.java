package Exercicios;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double temperaturaFarenheit;
        System.out.println("Digite a temperatura em Farenheit: ");
        temperaturaFarenheit = dadoEntrada.nextDouble();

        double conversaoFarenheitCelsius = (temperaturaFarenheit -32)*5/9;

        System.out.println("A temperatura em Celsius é " + conversaoFarenheitCelsius);
    }
}

/*
    Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).
 */