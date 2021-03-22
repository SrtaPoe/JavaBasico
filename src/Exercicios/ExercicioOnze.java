package Exercicios;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        double numeroTres;

        System.out.println("Digite o primeiro número: ");
        numeroUm = dadoEntrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numeroDois = dadoEntrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        numeroTres = dadoEntrada.nextDouble();

        int produtoDobro = (numeroUm*2)*numeroDois/2;
        System.out.println("O produto é: " + produtoDobro);

        int somaTriplo = (int) ((numeroUm*3)+numeroTres);
        System.out.println(" A soma é: " + somaTriplo);

        int cuboTerceiro = (int) Math.pow(numeroTres,3);
        System.out.println("O cubo do terceiro número é: " + cuboTerceiro);
    }
}

/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */