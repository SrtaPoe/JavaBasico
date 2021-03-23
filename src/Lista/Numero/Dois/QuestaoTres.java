package Lista.Numero.Dois;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double saldo;
        System.out.println("Digite seu saldo: ");
        saldo = dadoEntrada.nextDouble();

        double reajuste = (0.01*saldo);
        double saldoAtualizado = reajuste+saldo;

        System.out.println("Seu saldo com reajuste de 1% é de " +saldoAtualizado);
    }
}

/*
    Informar um saldo e imprimir o saldo com reajuste de 1%.
 */