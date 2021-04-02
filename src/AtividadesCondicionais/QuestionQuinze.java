package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionQuinze {
    public static void main(String[] args) {
        Scanner dadosEntrda = new Scanner(System.in);
        double ladoA;
        double ladoB;
        double ladoC;

        System.out.println("Digite o valor do lado nº1: ");
        ladoA = dadosEntrda.nextDouble();
        System.out.println("Digite o valor do lado nº2: ");
        ladoB = dadosEntrda.nextDouble();
        System.out.println("Digite o valor do lado nº3: ");
        ladoC = dadosEntrda.nextDouble();

        //VERIFICAR SE É UM TRIÂNGULO
        if(ladoA+ladoB>ladoC && ladoA+ladoC>ladoB && ladoB+ladoC>ladoA){
            System.out.println("É UM TRIÂNGULO!");
            if(ladoA==ladoB && ladoA==ladoC){
                System.out.println("É UM TRIÂNGULO EQUILÁTERO!");
        }else if(ladoA==ladoB || ladoB==ladoC || ladoA==ladoC){
            System.out.println("É UM TRIÂNGULO ISÓSCELES!");
        }else{
            System.out.println("É UM TRIÂNGULO ESCALENO");
        }
        }else{
            System.out.println("NÃO É UM TRIÂNGULO!");
        }
    }

}

/*
    Faça um Programa que peça os 3 lados de um triângulo. O programa
    deverá informar se os valores podem ser um triângulo. Indique, caso
    os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
    escaleno.
     Dicas:
        o Três lados formam um triângulo quando a soma de quaisquer
        dois lados for maior que o terceiro;
        o Triângulo Equilátero: três lados iguais;
        o Triângulo Isósceles: quaisquer dois lados iguais;
        o Triângulo Escaleno: três lados diferentes;
 */