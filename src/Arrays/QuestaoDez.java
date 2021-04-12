package Arrays;

public class QuestaoDez {
    public static void main(String[] args) {
        int[] conjuntoA = new int[10];
        conjuntoA[0] = 3;
        conjuntoA[1] = 5;
        conjuntoA[2] = 7;
        conjuntoA[3] = 11;
        conjuntoA[4] = 13;
        conjuntoA[5] = 15;
        conjuntoA[6] = 17;
        conjuntoA[7] = 19;
        conjuntoA[8] = 21;
        conjuntoA[9] = 23;


        for (int i = 0; i < conjuntoA.length; i++) {
            System.out.println("O valor do item nº " + (i + 1) + " no conjunto A é de " + conjuntoA[i]);
        }

        int[] conjuntoB = new int[10];
        conjuntoB[0] = conjuntoA[0]%2;
        conjuntoB[1] = conjuntoA[1]%2;
        conjuntoB[2] = conjuntoA[2]%2;
        conjuntoB[3] = conjuntoA[3]%2;
        conjuntoB[4] = conjuntoA[4]%2;
        conjuntoB[5] = conjuntoA[5]%2;
        conjuntoB[6] = conjuntoA[6]%2;
        conjuntoB[7] = conjuntoA[7]%2;
        conjuntoB[8] = conjuntoA[8]%2;
        conjuntoB[9] = conjuntoA[9]%2;

        for (int i = 0; i < conjuntoB.length; i++) {
            System.out.println("O valor do item nº " + (i + 1) + " no conjunto B é de " + conjuntoB[i]);
        }

    }
}
/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.
 */