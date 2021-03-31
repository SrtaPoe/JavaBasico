package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroUm;
        int numeroDOis;
        int numeroTres;
        System.out.println("Digite o primeiro número: ");
        numeroUm = dadosEntrada.nextInt();
        System.out.println("Digite o segunndo número: ");
        numeroDOis = dadosEntrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        numeroTres = dadosEntrada.nextInt();

        if(numeroUm>numeroDOis && numeroUm>numeroTres){
            System.out.println("O primeiro é o maior dos três");
        }else if (numeroDOis>numeroUm && numeroDOis>numeroTres){
            System.out.println("O segundo número é o maior dos três");
        }else{
            System.out.println("O terceiro número é maior dos três");
        }
    }
}

/*
Faça um Programa que leia três números e mostre o maior deles.
 */