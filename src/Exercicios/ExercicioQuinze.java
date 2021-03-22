package Exercicios;

import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double horaPaga;
        double horasTrabalhadas;

        System.out.println("Digite quanto vale sua hora trabalhada: ");
        horaPaga = dadoEntrada.nextDouble();
        System.out.println("Digite quantas horas trabalhou neste mês: ");
        horasTrabalhadas = dadoEntrada.nextDouble();

        double salarioInicial = horaPaga*horasTrabalhadas;
        double impostoDeRenda = (11.0/100)*salarioInicial;
        double inss =  (8.0/100)*salarioInicial;
        double sindicato = (5.0/100)*salarioInicial;
        double descontosTotais =  impostoDeRenda+inss+sindicato;
        double salarioLiquido = (salarioInicial - impostoDeRenda - inss - sindicato);
        System.out.println("Você pagou R$ " + inss + " de INSS.");
        System.out.println("Você pagou R$ " + sindicato + " ao sindicato.");
        System.out.println("Você pagou de descontos R$ " + descontosTotais);
        System.out.println("Seu salário liquído é de R$ " + salarioLiquido);
    }
}

/*
    Faça um Programa que pergunte quanto você ganha por hora e o
    número de horas trabalhadas no mês. Calcule e mostre o total do seu
    salário no referido mês, sabendo-se que são descontados 11% para o
    Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
    programa que nos dê:
    . salário bruto.
    a. quanto pagou ao INSS.
    b. quanto pagou ao sindicato.
    c. o salário líquido.
    d. calcule os descontos e o salário líquido, conforme a tabela
    abaixo:
    + Salário Bruto : R$ - IR (11%) : R$ - INSS
    (8%) : R$ - Sindicato ( 5%) : R$ = Salário
    Liquido : R$
    Obs.: Salário Bruto - Descontos = Salário Líquido.
 */