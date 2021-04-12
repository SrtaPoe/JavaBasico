package DoWhile;

import java.util.Scanner;

public class QuestaoVinteUm {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        int numeroUsuario;
        System.out.println("Digite um número para mostrar se ele é primo: ");
        numeroUsuario = dadoEntrada.nextInt();


        for(int i =1; i<=numeroUsuario;i++)
            if (numeroUsuario % 2 == 1 ) {
                System.out.println("Não é número primo!");
            } else {
                System.out.println("É número primo!");
            }

    }

}
