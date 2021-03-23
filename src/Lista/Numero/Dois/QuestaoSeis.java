package Lista.Numero.Dois;

import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        int numeroInteiro;

        System.out.println("Digite um número: ");
        numeroInteiro = dadoEntrada.nextInt();

        int numeroAntecessor = numeroInteiro-1;
        int numeroSucessor = numeroInteiro+1;

        System.out.println("O número antecessor de " + numeroInteiro + " é o " + numeroAntecessor);
        System.out.println("O número sucessor de " + numeroInteiro + " é o " + numeroSucessor);
    }
}

/*
    Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
    antecessor e seu sucessor.
 */