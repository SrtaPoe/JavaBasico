package Exercicios;

import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double metrosQudradosDeTinta;
        System.out.println("Digite o tamanho de metros quadrados a ser pintado: ");
        metrosQudradosDeTinta = dadoEntrada.nextDouble();


        double lataDeTinta = 80;
        double quantidadeDeLatas = metrosQudradosDeTinta/3;
        double preTotal = quantidadeDeLatas*lataDeTinta;

        System.out.println("A quantidade latas a serem usadas é de " + quantidadeDeLatas);
        System.out.println("O valor total a ser pago é de R$ " + preTotal);
    }
}

/*
    Faça um programa para uma loja de tintas. O programa deverá pedir o
    tamanho em metros quadrados da área a ser pintada. Considere que a
    cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
    tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
    usuário a quantidades de latas de tinta a serem compradas e o preço
    total.
     */