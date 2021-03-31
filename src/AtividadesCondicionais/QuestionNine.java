package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double numeroUm;
        double numeroDois;
        double numeroTres;

        System.out.println("Digite o primeiro número: ");
        numeroUm = dadosEntrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        numeroDois = dadosEntrada.nextDouble();
        System.out.println("Digite o terceiro número:");
        numeroTres = dadosEntrada.nextDouble();

       if(numeroUm>numeroDois && numeroUm>numeroTres && numeroDois>numeroTres){
           System.out.println(numeroUm);
           System.out.println(numeroDois);
           System.out.println(numeroTres);
       }else if(numeroDois>numeroUm && numeroDois>numeroTres && numeroUm>numeroTres){
           System.out.println(numeroDois);
           System.out.println(numeroUm);
           System.out.println(numeroTres);
       }else if(numeroDois>numeroUm && numeroDois>numeroTres && numeroTres>numeroUm){
           System.out.println(numeroDois);
           System.out.println(numeroTres);
           System.out.println(numeroUm);
       } else if(numeroTres>numeroUm && numeroTres>numeroDois && numeroUm>numeroDois){
           System.out.println(numeroTres);
           System.out.println(numeroUm);
           System.out.println(numeroDois);
       }else{
           System.out.println(numeroTres);
           System.out.println(numeroDois);
           System.out.println(numeroUm);
       }
    }
}
/*
    Faça um Programa que leia três números e mostre-os em ordem
    crescente.
 */