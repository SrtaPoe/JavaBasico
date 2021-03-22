package Exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double raio;
        System.out.println("Digite o valor do raio: ");
        raio = dadoEntrada.nextDouble();
        double pi = 3.14;
        double areaCirculo = pi*(raio*raio);

        System.out.println("A área total do círculo é " + areaCirculo);

    }
}

/*
    Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.
 */