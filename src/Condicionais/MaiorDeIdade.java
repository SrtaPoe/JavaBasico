package Condicionais;

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = dadosEntrada.nextInt();

        if (idade>=18){
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }
    }
}
