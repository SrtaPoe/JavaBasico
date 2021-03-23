package Lista.Numero.Dois;

import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double salarioMinimo;
        double salarioUsuario;

        System.out.println("Digite o valor de seu salário: ");
        salarioUsuario = dadoEntrada.nextDouble();
        System.out.println(" Digite o valor do salário minímo no Brasil: ");
        salarioMinimo = dadoEntrada.nextDouble();

        double quantidadeDeSalariosMinimos = salarioUsuario/salarioMinimo;

        System.out.println("A quantidade de salários minímos no seu salário é de " + quantidadeDeSalariosMinimos);
    }
}
/*
    Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
    calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
    OBS: A questão pedia para levar o valor de R$ 788, porém optei por pedir ao usuário informar
    o valor do salário minímo, pois o mesmo é atualizado a cada 12 meses.
 */