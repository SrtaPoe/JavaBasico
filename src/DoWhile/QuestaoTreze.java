package DoWhile;

import java.util.Scanner;

public class QuestaoTreze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int base;
        int expoente;

        System.out.println("Digite o valor da base: ");
        base = dadosEntrada.nextInt();
        System.out.println("Digite o valor do exponte: ");
        expoente = dadosEntrada.nextInt();
        int resultado = 1;

        do{
            resultado = resultado*base;
            expoente--;
        }while(expoente>0);

        System.out.println("O resultado da potencialização é " + resultado);
    }
}

/*
    Faça um programa que peça dois números, base e expoente, calcule e
    mostre o primeiro número elevado ao segundo número. Não utilize a
    função de potência da linguagem.
 */