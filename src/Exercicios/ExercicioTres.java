package Exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner dadoEntrada = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        System.out.println("Digite um número: ");
        numeroUm = dadoEntrada.nextInt();
        System.out.println("Digite outro número: ");
        numeroDois = dadoEntrada.nextInt();

        int soma = numeroUm+numeroDois;

        System.out.println("A soma dos números é " + soma);


    }
}

/*
Faça um Programa que peça dois números e imprima a soma.
 */