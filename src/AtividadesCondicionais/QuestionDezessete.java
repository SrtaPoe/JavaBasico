package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionDezessete {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int ano;
        System.out.println("Digit um ano para avaliar se é bissexto: ");
        ano = dadosEntrada.nextInt();

        if(ano%4==0 && ano%100 !=0){
            System.out.println("O AO É BISSEXTO");
        }else if(ano%400 ==0){
            System.out.println("O ANO É BISSEXTO");
        } else{
            System.out.println("O ANO NÃO É BISSEXTO");
        }
    }
}
/*
    Faça um Programa que peça um número correspondente a um
    determinado ano e em seguida informe se este ano é ou não bissexto.
 */