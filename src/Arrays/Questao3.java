package Arrays;

public class Questao3 {
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
        conjuntoB[0] = conjuntoA[0]*conjuntoA[0];
        conjuntoB[1] = conjuntoA[1]*conjuntoA[1];
        conjuntoB[2] = conjuntoA[2]*conjuntoA[2];
        conjuntoB[3] = conjuntoA[3]*conjuntoA[3];
        conjuntoB[4] = conjuntoA[4]*conjuntoA[4];
        conjuntoB[5] = conjuntoA[5]*conjuntoA[5];
        conjuntoB[6] = conjuntoA[6]*conjuntoA[6];
        conjuntoB[7] = conjuntoA[7]*conjuntoA[7];
        conjuntoB[8] = conjuntoA[8]*conjuntoA[8];
        conjuntoB[9] = conjuntoA[9]*conjuntoA[9];
        conjuntoB[10] = conjuntoA[10]*conjuntoA[10];
        conjuntoB[11] = conjuntoA[11]*conjuntoA[11];
        conjuntoB[12] = conjuntoA[12]*conjuntoA[12];
        conjuntoB[13] = conjuntoA[13]*conjuntoA[13];
        conjuntoB[14] = conjuntoA[14]*conjuntoA[14];

        for (int i = 0; i<conjuntoB.length; i++){
            System.out.println("O valor do item nº " + (i+1) + " no conjunto B é de " + conjuntoB[i]);
        }
    }
}

/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].
 */