package Exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double metros;
        System.out.println("Digite a medida em metros a ser convertida: ");
        metros = dadoEntrada.nextDouble();

        double conversaoMetrosCentimetros = metros*100;

        System.out.println("A medida em centímetros é " + conversaoMetrosCentimetros);
    }
}

/*
    Faça um Programa que converta metros para centímetros.
 */