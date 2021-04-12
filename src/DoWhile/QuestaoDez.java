package DoWhile;

import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        System.out.println("Digite o primeiro número: ");
        numeroUm = dadosEntrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numeroDois = dadosEntrada.nextInt();

        for(int i = numeroUm; i<=numeroDois; i++){
            System.out.println(i);
        }
        int i = numeroUm;
        int soma = numeroUm;
        while(i<numeroDois){
            i++;
            soma+=i;
        }
        System.out.println("A soma do intervalo é: " + soma);
    }
}

/*
Altere o programa anterior para mostrar no final a soma dos números.
 */