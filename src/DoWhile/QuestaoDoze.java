package DoWhile;

import java.util.Scanner;

public class QuestaoDoze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroTabuada;
        System.out.println("Digite um número para mostrar sua tabuada de multiplicação: ");
        numeroTabuada = dadosEntrada.nextInt();
        System.out.println("TABUADADE DE " + numeroTabuada);
        for(int i= 1; i<=10; i++){
            System.out.println(numeroTabuada + " X " + i + " = " + i*numeroTabuada);
        }
    }
}

/*
    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
    qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
    numero ele deseja ver a tabuada.
 */