package Arrays;

public class Questao4 {
    public static void main(String[] args) {
        int [] conjuntoA = new int[15];
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
        conjuntoA[10] = 13;
        conjuntoA[11] = 15;
        conjuntoA[12] = 17;
        conjuntoA[13] = 19;
        conjuntoA[14] = 21;

        for (int i = 0; i<conjuntoA.length; i++){
            System.out.println("O valor do item nº " + (i+1) + " no conjunto A é de " + conjuntoA[i]);
        }

        int [] conjuntoB = conjuntoA;
        conjuntoB[0] = (int) Math.sqrt(conjuntoA[0]);
        conjuntoB[1] = (int) Math.sqrt(conjuntoA[1]);
        conjuntoB[2] = (int) Math.sqrt(conjuntoA[2]);
        conjuntoB[3] = (int) Math.sqrt(conjuntoA[3]);
        conjuntoB[4] = (int) Math.sqrt(conjuntoA[4]);
        conjuntoB[5] = (int) Math.sqrt(conjuntoA[5]);
        conjuntoB[6] = (int) Math.sqrt(conjuntoA[6]);
        conjuntoB[7] = (int) Math.sqrt(conjuntoA[7]);
        conjuntoB[8] = (int) Math.sqrt(conjuntoA[8]);
        conjuntoB[9] = (int) Math.sqrt(conjuntoA[9]);
        conjuntoB[10] = (int) Math.sqrt(conjuntoA[10]);
        conjuntoB[11] = (int) Math.sqrt(conjuntoA[11]);
        conjuntoB[12] = (int) Math.sqrt(conjuntoA[12]);
        conjuntoB[13] = (int) Math.sqrt(conjuntoA[13]);
        conjuntoB[14] = (int) Math.sqrt(conjuntoA[14]);

        for (int i = 0; i<conjuntoB.length; i++){
            System.out.println("O valor do item nº " + (i+1) + " no conjunto B é de " + conjuntoB[i]);
        }

    }
}

/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).
 */