package Lista.Numero.Dois;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        int ano;
        int meses;
        int dias;
        System.out.println("Digite sua idade em anos: ");
        ano = dadoEntrada.nextInt();
        System.out.println("Digite sua idade em meses: ");
        meses = dadoEntrada.nextInt();
        System.out.println("Digite sua idade em dias: ");
        dias = dadoEntrada.nextInt();

        int anosIdade = ano*365;
        int mesesIdade = meses*30;
        int idadeEmDias = anosIdade+mesesIdade+dias;

        System.out.println("Sua idade em dias é de " + idadeEmDias);
    }
}

/*
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */