package Arrays;

public class Questao2 {
    public static void main(String[] args) {
        int [] conjuntoA = new int[5];
        conjuntoA[0] = 2;
        conjuntoA[1] = 4;
        conjuntoA[2] = 8;
        conjuntoA[3] = 10;
        conjuntoA[4] = 12;

        for (int i = 0; i<conjuntoA.length; i++){
            System.out.println("O valor do item nº " + (i+1) + " no conjunto A é de " + conjuntoA[i]);
        }

        int [] conjuntoB = conjuntoA;
            conjuntoB[0] = 2*2;
            conjuntoB[1] = 4*2;
            conjuntoB[2] = 8*2;
            conjuntoB[3] = 10*2;
            conjuntoB[4] = 12*2;

        for (int i = 0; i<conjuntoB.length; i++){
            System.out.println("O valor do item nº " + (i+1) + " no conjunto B é de " + conjuntoB[i]);
        }
    }
}
/*
Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.
 */