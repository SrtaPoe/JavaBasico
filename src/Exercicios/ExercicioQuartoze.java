package Exercicios;

import java.util.Scanner;

public class ExercicioQuartoze {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double pesoPeixes;
        System.out.println("Digite a pesagem de peixes do dia: ");
        pesoPeixes = dadoEntrada.nextDouble();

        double pesoSaoPaulo = 50;

        double pesoExcedido = 0;
        double multaPorPesoExcedido = ((pesoPeixes - pesoSaoPaulo))*4;
        if(pesoPeixes>pesoSaoPaulo){
            pesoExcedido++;
            System.out.println("A multa a ser paga é de R$" + multaPorPesoExcedido);
        }else{
            pesoExcedido = 0;
            System.out.println("Você excedeu " + pesoExcedido);
            System.out.println("Você não tem multa a ser paga");
        }

    }
}

/*
    João Papo-de-Pescador, homem de bem, comprou um
    microcomputador para controlar o rendimento diário de seu trabalho.
    Toda vez que ele traz um peso de peixes maior que o estabelecido
    pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
    pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
    você faça um programa que leia a variável peso (peso de peixes) e
    verifique se há excesso. Se houver, gravar na variável excesso e na
    variável multa o valor da multa que João deverá pagar. Caso contrário
    mostrar tais variáveis com o conteúdo ZERO.
 */