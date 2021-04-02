package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionQuartoze {
    public static void main(String[] args) {
        Scanner dadosEntrda = new Scanner(System.in);
        double nota1;
        double nota2;
        System.out.println("Digite a primeira nota: ");
        nota1 = dadosEntrda.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = dadosEntrda.nextDouble();

        double media = (nota1+nota2)/2;

        if(media>=9){
            System.out.println("SUA MÉDIA É DE " + media);
            System.out.println("CONCEITO A" );
            System.out.println("APROVADO");
        }else if(media>=7.5 && media<9){
            System.out.println("SUA MÉDIA É DE " + media);
            System.out.println("CONCEITO B" );
            System.out.println("APROVADO");
        }else if(media>6 && media<7.5){
            System.out.println("SUA MÉDIA É DE " + media);
            System.out.println("CONCEITO C" );
            System.out.println("APROVADO");
        }else if(media>4 && media<=6){
            System.out.println("SUA MÉDIA É DE " + media);
            System.out.println("CONCEITO D" );
            System.out.println("REPROVADO");
        }else{
            System.out.println("SUA MÉDIA É DE " + media);
            System.out.println("CONCEITO E" );
            System.out.println("REPROVADO");
        }
    }

}

/*
Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento
Conceito
Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.

 */