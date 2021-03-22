package Exercicios;

import java.util.Scanner;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double tamanhoArquivo;
        double velocidadeInternet;
        System.out.println("Digite o tamanho do arquivo: ");
        tamanhoArquivo = dadoEntrada.nextDouble();
        System.out.println("Digite a velocidade do link de Internet: ");
        velocidadeInternet = dadoEntrada.nextDouble();

        double tempoDownloadArquivo = (tamanhoArquivo/velocidadeInternet)*60;

        System.out.println("O tempo aproximado de download é de " + tempoDownloadArquivo);
    }

}

/*
    Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 */