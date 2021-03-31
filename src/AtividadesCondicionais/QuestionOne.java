package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        System.out.println("Digite o primeiro número: ");
        numeroUm = dadosEntrada.nextInt();
        System.out.println("Digite o primeiro número: ");
        numeroDois = dadosEntrada.nextInt();

        if(numeroUm>numeroDois){
            System.out.println("O primeiro número é maior!");
        }else{
            System.out.println("O segundo número é o maior!");
        }

    }
}

/*
Faça um Programa que peça dois números e imprima o maior deles.
 */