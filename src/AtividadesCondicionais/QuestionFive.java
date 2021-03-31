package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double notaUm;
        double notaDois;
        System.out.println("Digite a primeira nota parcial: ");
        notaUm = dadosEntrada.nextDouble();
        System.out.println("Digite a segunda nota parcial: ");
        notaDois = dadosEntrada.nextDouble();

        double mediaParcial = (notaUm+notaDois)/2;

        if(mediaParcial>=7 && mediaParcial<10){
            System.out.println("APROVADO!");
        }else if(mediaParcial==10){
            System.out.println("APROVADO COM DISTINÇÃO");
        }else{
            System.out.println("REPROVADO!");
        }
    }
}

/*
    Faça um programa para a leitura de duas notas parciais de um aluno.
    O programa deve calcular a média alcançada por aluno e apresentar:
    o A mensagem "Aprovado", se a média alcançada for maior ou
    igual a sete;
    o A mensagem "Reprovado", se a média for menor do que sete;
    o A mensagem "Aprovado com Distinção", se a média for igual a
    dez.
 */