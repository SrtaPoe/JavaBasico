package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double valor;
        System.out.println("Digite um número: ");
        valor = dadosEntrada.nextInt();

        if(valor>0){
            System.out.println("O número " + valor + "é positivo");
        }else{
            System.out.println("O número " + valor + "é negativo");
        }
    }
}

/*
Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */