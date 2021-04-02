package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionEigth {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double precoProdutoUm;
        double precoProdutoDois;
        double precoProdutoTres;

        System.out.println("Digite o preço do primeiro produto: ");
        precoProdutoUm = dadosEntrada.nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        precoProdutoDois = dadosEntrada.nextDouble();
        System.out.println("Digite o preço do terceiro produto: ");
        precoProdutoTres = dadosEntrada.nextDouble();

        if(precoProdutoUm<precoProdutoDois && precoProdutoUm<precoProdutoTres){
            System.out.println("O produto nº01 é o mais barato e pode ser comprado!");
        }else if(precoProdutoDois<precoProdutoUm && precoProdutoDois<precoProdutoTres){
            System.out.println("O produto nº02 é o mais barato e pode ser comprado!");
        }else{
            System.out.println("O produto nº03 é o mais barato e pode ser comprado!");
        }
    }
}


/*
    Faça um programa que pergunte o preço de três produtos e informe
    qual produto você
 */