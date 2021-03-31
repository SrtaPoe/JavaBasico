package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        String letra;
        System.out.println("Digite uma letra: ");
        letra = dadosEntrada.next();

        if(letra.equals("F")){
            System.out.println("Feminino");
        }else if (letra.equals("M")){
            System.out.println("Masculino");
        }else{
            System.out.println("Sexo Inválido");
        }
    }
}
/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */