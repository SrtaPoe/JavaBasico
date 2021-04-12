package DoWhile;

import java.util.Scanner;

public class ExemploTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        int i = 1;
        int max = numero;

        while(i<=max) {
            System.out.println("Valor de i: " + i);
            i++;
        }
    }

}
