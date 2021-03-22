package Exercicios;

import java.util.Scanner;

public class ExericioDois {
    public static void main(String[] args) {
        Scanner dadoUm = new Scanner(System.in);
        double numeroDado;
        System.out.println("Digite um número: ");
        numeroDado = dadoUm.nextDouble();

        System.out.println("O número que você digitou foi " + numeroDado);
    }
}

/*
Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].
 */