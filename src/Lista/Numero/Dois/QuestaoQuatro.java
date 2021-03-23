package Lista.Numero.Dois;

import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double ipi;
        String codigoDaPecaUm;
        double valorUnitarioPecaUm;
        double quantidadePecaUm;
        String codigoDaPecaDois;
        double quantidadePecaDois;

        System.out.println("Digite a porcentagem do IPI: ");
        ipi = dadoEntrada.nextDouble();

        //INFORMAÇÕES PEÇA N°01
        System.out.println("Digite o código da peça: ");
        codigoDaPecaUm = dadoEntrada.next();
        System.out.println("Digite o valor unitário da pela n°1: ");
        valorUnitarioPecaUm = dadoEntrada.nextDouble();
        System.out.println("Digite a quantidade de peças n°1: ");
        quantidadePecaUm = dadoEntrada.nextDouble();

        //INFORMAÇÕES PEÇA N°02
        System.out.println("Digite o código da peça n°02: ");
        codigoDaPecaDois = dadoEntrada.next();
        System.out.println("Digite o valor unitário da peça n°2: ");
        double valorUnitarioPecaDois = dadoEntrada.nextDouble();
        System.out.println("Digite a quantidade de peças n°2: ");
        quantidadePecaDois = dadoEntrada.nextDouble();

        double valorTotalPecaUm = valorUnitarioPecaUm*quantidadePecaUm;
        double valorTotalPecaDois =valorUnitarioPecaDois*quantidadePecaDois;
        double valorIpi = ipi/100+1;

        double valorTotalSerPago = (valorTotalPecaUm+valorTotalPecaDois)*valorIpi;

        System.out.println("O valor total a ser pago é de " + valorTotalSerPago);
    }
}

/*
    Escrever um algoritmo que lê:
    - a porcentagem do IPI a ser acrescido no valor das peças
    - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
    - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */