package Arrays;

import java.util.Scanner;

public class QuestaoDoze {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        int[] conjuntoA = new int[10];

        for(int i =0;i<conjuntoA.length; i++){
            System.out.println("Entre com o valor da posição: " + i);
            conjuntoA[i] = dadosEntrada.nextInt();

        }


    }
}
