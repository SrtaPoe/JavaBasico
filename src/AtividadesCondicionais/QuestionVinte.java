package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionVinte {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double saque;
        System.out.println("Qual valor deseja sacar? R$ ");
        saque = dadosEntrada.nextDouble();

        double notaDeCem = saque/100;
        double notaDeCinquenta = saque/50;
        double notaDeDez = saque/10;
        double notaDeCinco = saque/5;
        double notaDeUm = saque;


        System.out.println(notaDeCem);
        System.out.println(notaDeCinquenta);
        System.out.println(notaDeDez);
        System.out.println(notaDeCinco);
        System.out.println(notaDeUm);


    }
}
