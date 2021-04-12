package DoWhile;

import java.util.Scanner;

public class QuestaoQuatorze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroUm = 0;

        for(int pergunta = 0; pergunta<10; pergunta++){
            System.out.println("Digite um número: ");
            numeroUm = dadosEntrada.nextInt();
        }
        for(int i = 1; i<numeroUm; i++){
            System.out.println(i);
        }
        int par = 0;
        int impar = 0;
           for(int i =0; i<numeroUm; i++){
               if(i%2==0){
                   par++;
               }else{
                   impar++;
               }
           }
        System.out.println("A quantidade de números pares é de: " + par );
        System.out.println("A quantidade de números impares é de: " + impar );
    }

}

/*
Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
 */