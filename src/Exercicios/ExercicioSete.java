package Exercicios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double area;
        System.out.println("Digite o valor da medida:  ");
        area = dadoEntrada.nextDouble();

        double areaQuadradoDobro = (area*area)*2;

        System.out.println("O dobro da área do quadrado é " + areaQuadradoDobro);
    }
}

/*
Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
 */