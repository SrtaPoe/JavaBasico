package Arrays;

public class QuestaoSeis {
    public static void main(String[] args) {
        int[] conjuntoA = new int[10];
        conjuntoA[0] = 2;
        conjuntoA[1] = 4;
        conjuntoA[2] = 8;
        conjuntoA[3] = 10;
        conjuntoA[4] = 12;
        conjuntoA[5] = 3;
        conjuntoA[6] = 5;
        conjuntoA[7] = 17;
        conjuntoA[8] = 9;
        conjuntoA[9] = 11;


        for (int i = 0; i < conjuntoA.length; i++) {
            System.out.println("O valor do item nº " + (i + 1) + " no conjunto A é de " + conjuntoA[i]);
        }

        int[] conjuntoB = new int[10];
        conjuntoB[0] = 5;
        conjuntoB[1] = 10;
        conjuntoB[2] = 15;
        conjuntoB[3] = 20;
        conjuntoB[4] = 21;
        conjuntoB[5] = 25;
        conjuntoB[6] = 30;
        conjuntoB[7] = 35;
        conjuntoB[8] = 40;
        conjuntoB[9] = 45;

        for (int i = 0; i < conjuntoB.length; i++) {
            System.out.println("O valor do item nº " + (i + 1) + " no conjunto B é de " + conjuntoB[i] * i);
        }

        int[] conjuntoC = new int[10];
        conjuntoC[0] = conjuntoA[0] + conjuntoB[0];
        conjuntoC[1] = conjuntoA[1] + conjuntoB[1];
        conjuntoC[2] = conjuntoA[2] + conjuntoB[2];
        conjuntoC[3] = conjuntoA[3] + conjuntoB[3];
        conjuntoC[4] = conjuntoA[4] + conjuntoB[4];
        conjuntoC[5] = conjuntoA[5] + conjuntoB[5];
        conjuntoC[6] = conjuntoA[6] + conjuntoB[6];
        conjuntoC[7] = conjuntoA[7] + conjuntoB[7];
        conjuntoC[8] = conjuntoA[8] + conjuntoB[8];
        conjuntoC[9] = conjuntoA[9] + conjuntoB[9];


        for (int i = 0; i < conjuntoC.length; i++) {
            System.out.println("O valor do item nº " + (i + 1) + " no conjunto C é de " + conjuntoC[i]);

        }
    }
}

/*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a soma dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] + B[i]
 */