package Exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double valorHora;
        double horasTrabalhadas;
        System.out.println("Digite quanto vale sua hora trabalhada: ");
        valorHora = dadoEntrada.nextDouble();
        System.out.println("Digite quanto a quantidade de horas trabalhadas: ");
        horasTrabalhadas = dadoEntrada.nextDouble();

        double salario = valorHora*horasTrabalhadas;

        System.out.println("Seu salário será de " + salario);
    }
}


/*
    Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.
 */