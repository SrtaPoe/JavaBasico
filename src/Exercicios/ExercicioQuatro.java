package Exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner dadoMedia = new Scanner(System.in);
        double notaUm;
        double notaDois;
        double notaTres;
        double notaQuatro;

        System.out.println("Digite a primeira nota: ");
        notaUm = dadoMedia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notaDois = dadoMedia.nextDouble();
        System.out.println("Digite a terceira  nota: ");
        notaTres = dadoMedia.nextDouble();
        System.out.println("Digite a quarta nota: ");
        notaQuatro = dadoMedia.nextDouble();

        double mediaBimestral = (notaUm+notaDois+notaTres+notaQuatro)/4;

        System.out.println("A média bimestral é " + mediaBimestral);
    }
}

/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */