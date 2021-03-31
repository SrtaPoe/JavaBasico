package VariaveisCondicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroDiaDaSemana;
        System.out.println("Digite um número: ");
        numeroDiaDaSemana = dadosEntrada.nextInt();

        switch (numeroDiaDaSemana){
            case 1:
                System.out.println("DOMINGO...DIA DE PRAIA!");
                break;
            case 2:
                System.out.println("SEGUNDA-FEIRA NÃOOOO!");
                break;
            case 3:
                System.out.println("TERÇA-FEIRA!");
                break;
            case 4:
                System.out.println("QUARTA-FEIRA!");
                break;
            case 5:
                System.out.println("QUINTA-FEIRA!");
                break;
            case 6:
                System.out.println("SEXTA-FEIRA!");
                break;
            case 7:
                System.out.println("SABÁDO!");
                break;
            default:
                System.out.println("Digite um dia da semana válido!");
                System.out.println("Digite novamente um número entre 1 a 7: ");
                numeroDiaDaSemana =dadosEntrada.nextInt();
        }
    }
}
