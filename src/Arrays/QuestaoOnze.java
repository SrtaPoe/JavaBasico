package Arrays;

public class QuestaoOnze {
    public static void main(String[] args) {
        int [] conjuntoA = new int[10];
        conjuntoA[0] = 2;
        conjuntoA[1] = 5;
        conjuntoA[2] = 8;
        conjuntoA[3] = 10;
        conjuntoA[4] = 15;
        conjuntoA[5] = 18;
        conjuntoA[6] = 23;
        conjuntoA[7] = 28;
        conjuntoA[8] = 36;
        conjuntoA[9] = 45;

        int impar = 0;
        int par = 0;
        for(int i = conjuntoA.length - 1; i >= 0; i--){
            if(conjuntoA[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("A quantidade de números pares é " + par);
        System.out.println("A quantidade de números impares é " + impar);
    }
}

/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.
 */