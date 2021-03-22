package Exercicios;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double altura;
        System.out.println("Digite sua altura: ");
        altura = dadoEntrada.nextDouble();

        double pesoIdeal = (72.7*altura) - 58;

        System.out.println("Seu peso ideal é de aproximadamente " + pesoIdeal);
    }
}

/*
    Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 */