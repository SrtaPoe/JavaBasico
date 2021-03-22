package Exercicios;

import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner dadoEntrada = new Scanner(System.in);
        double peso;
        double altura;
        String sexo;

        System.out.println("Digite sua altura: ");
        altura = dadoEntrada.nextDouble();
        System.out.println("Qual seu sexo? ");
        sexo = dadoEntrada.next();
        System.out.println("Digite seu peso: ");
        peso = dadoEntrada.nextDouble();

        double pesoIdealMasculino = (72*altura) - 58;
        double pesoIdealFeminino = (65.1*altura)-44.7;


        String genero = "masculino";
        if(sexo.equals(genero)){
            System.out.println(pesoIdealMasculino);
            System.out.println((peso == pesoIdealMasculino) ? "Parabéns está com peso ideal" : "Você está acima do peso");
        }else{
            System.out.println(pesoIdealFeminino);
            System.out.println((peso == pesoIdealFeminino) ? "Parabéns está com peso ideal" : "Você está acima do peso");
        }

    }

}

/*
Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
 */