package Matrizes;

import java.util.Random;

public class QuestaoUm {
    public static void main(String[] args) {

        int[][] gerandoAleartorios = new int[4][4];

        Random dadosRandom = new Random();

        for (int i = 0; i < gerandoAleartorios.length; i++) {
            for (int j = 0; j < gerandoAleartorios[i].length; j++) {
                gerandoAleartorios[i][j] = dadosRandom.nextInt(100);
            }
        }
        int maiorNumero = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < gerandoAleartorios.length; i++) {
            for (int j = 0; j < gerandoAleartorios[i].length; j++) {
                if (gerandoAleartorios[i][j] > maiorNumero) {
                    maiorNumero = gerandoAleartorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }

            System.out.println();
            System.out.println("Maior número é " + maiorNumero);
            System.out.println("Linha desse número é " + linha);
            System.out.println("Coluna desse número é " + coluna);
        }
    }
}