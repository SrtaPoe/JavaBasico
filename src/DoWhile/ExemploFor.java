package DoWhile;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numero;
        System.out.println("Número, por favor: ");
        numero = dadosEntrada.nextInt();


        for(int i =0; i<=numero;i++){
            System.out.println(i);
        }
        for(int i=50; i>0; i--){
            System.out.println(i);
        }
        for(int i = 0, j=10; i<j; i++, j--){
            System.out.println("O valor de i=" + i);
            System.out.println("O valor de j=" + j);
        }
    }
}
