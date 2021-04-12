package DoWhile;

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numero, maior = 0, menor = 0;

        for(int i =0; i<5; i++){
            System.out.println("Digite um número: ");
            numero = dadosEntrada.nextInt();

            if(i==0){
                maior = numero;
                menor = numero;
            }

            if(numero>maior){
                maior = numero;
            }
            if(numero<menor){
                menor = numero;
            }
        }
        System.out.println("Maior número: " + maior + " Menor número: " + menor);
    }
}
/*
Faça um programa que leia 5 números e informe o maior número.
 */