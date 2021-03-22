package Exercicios;

import java.util.Scanner;

public class ExercicioDezessete {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double metrosQudradosDeTinta;
        System.out.println("Digite o tamanho de metros quadrados a ser pintado: ");
        metrosQudradosDeTinta = dadoEntrada.nextDouble();

        double galoesDeTinta = 25;
        double lataDeTinta = 80;
        double quantidadeDeLatas = metrosQudradosDeTinta/6;
        double quantidadeDeGaloes = metrosQudradosDeTinta/3.6;
        double preTotalLatas = quantidadeDeLatas*lataDeTinta;
        double preTotalGaloes = quantidadeDeGaloes*galoesDeTinta;

        System.out.println("A quantidade de latas a serem usadas é de " + quantidadeDeLatas);
        System.out.println("O valor total a ser pago de latas é de R$ " + preTotalLatas);
        System.out.println("A quantidade de galões a serem comprados é de " + quantidadeDeGaloes);
        System.out.println("O valor total a ser pago pelos galões é de R$ " + preTotalGaloes);

       /*
        misturar latas e galões, de forma que o preço seja o
        menor. Acrescente 10% de folga e sempre arredonde os
        valores para cima, isto é, considere latas cheias.
        */
        System.out.println();
    }

}

/*
    Faça um Programa para uma loja de tintas. O programa deverá pedir o
    tamanho em metros quadrados da área a ser pintada. Considere que a
    cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
    tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
    galões de 3,6 litros, que custam R$ 25,00.
    o Informe ao usuário as quantidades de tinta a serem compradas
    e os respectivos preços em 3 situações:
    o comprar apenas latas de 18 litros;
    o comprar apenas galões de 3,6 litros;
    o misturar latas e galões, de forma que o preço seja o
    menor. Acrescente 10% de folga e sempre arredonde os
    valores para cima, isto é, considere latas cheias.
 */