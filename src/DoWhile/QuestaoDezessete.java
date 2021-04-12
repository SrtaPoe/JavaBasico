package DoWhile;

import java.util.Scanner;

public class QuestaoDezessete {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        int numeroUsuario;
        int fat=1;
        System.out.println("Digite um número para mostrar seu fatorial: ");
        numeroUsuario = dadoEntrada.nextInt();


        for(int i =2; i<=numeroUsuario;i++){
                    fat*=i;
        }
        System.out.println("o fatorial de " + numeroUsuario + " é " + fat);
    }
}
/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */