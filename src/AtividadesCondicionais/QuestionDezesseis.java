package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionDezesseis {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int valorA;
        int valorB;
        int valorC;

        System.out.println("Digite valor de A: ");
        valorA = dadosEntrada.nextInt();
        System.out.println("Digite valor de B: ");
        valorB = dadosEntrada.nextInt();
        System.out.println("Digite valor de C: ");
        valorC = dadosEntrada.nextInt();

        if (valorA == 0) {
            System.out.println("NÃO É UMA EQUAÇÃO DE SEGUNDO GRAU");
        } else {
            System.out.println("Digite valor de B: ");
            valorB = dadosEntrada.nextInt();
            System.out.println("Digite valor de C: ");
            valorC = dadosEntrada.nextInt();
        }


        //RESOLVENDO A EQUACAO DE SEGUNDO GRAU
        //VALOR DE DELTA
            int delta = (int) (Math.pow(valorB,2) - (4*valorA*valorC));

        //VALORES DE X
        int valorXPositivo = (int) (-valorB + Math.sqrt(delta) / (2*valorA));
        int valorXNegativo = (int) (-valorB - Math.sqrt(delta) / (2*valorA));

        if(delta<0){
            System.out.println("A EQUAÇÃO NÃO POSSUI RAÍZES REAIS");
        }else if(delta==0){
            System.out.println("A EQUAÇÃO POSSUI SOMENTE UMA RAIZ REAL");
            System.out.println(valorXPositivo);
        }else{
            System.out.println("A EQUAÇÃO POSSUI DUAS RAÍZES REAIS");
            System.out.println(valorXPositivo);
            System.out.println(valorXNegativo);
        }
    }
}
