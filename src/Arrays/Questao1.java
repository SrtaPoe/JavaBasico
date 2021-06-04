package Arrays;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        int[] vetorUm = new int[5];
        int[] vetorDois = new int[vetorUm.length];

        for (int i =0; i<vetorUm.length; i++){
            System.out.println("Entre com o valor da posição: " + i);
            vetorUm[i] = dadosEntrada.nextInt();

            vetorDois[i] = vetorUm[i];
        }

        System.out.println("Vetor Um = ");
        for (int i = 0; i<vetorUm.length; i++){
            System.out.println(vetorUm[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor Dois = ");
        for (int i = 0; i<vetorDois.length; i++){
            System.out.println(vetorDois[i] + " ");
        }
        System.out.println();

    }
//        int [] conjuntoA = new int[5];
//        conjuntoA[0] = 9;
//        conjuntoA[1] = 18;
//        conjuntoA[2] = 27;
//        conjuntoA[3] = 36;
//        conjuntoA[4] = 45;
//
//        for (int i = 0; i<conjuntoA.length; i++){
//            System.out.println("O valor do item nº " + (i+1) + " no conjunto A é de " + conjuntoA[i]);
//        }
//
//        int [] conjuntoB = conjuntoA;
//        for (int i = 0; i<conjuntoB.length; i++){
//            System.out.println("O valor do item nº " + (i+1) + " no conjunto B é de " + conjuntoB[i]);
//        }
//
//    }



}

/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
 */