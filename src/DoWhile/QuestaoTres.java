package DoWhile;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("Digite seu nome: ");
        nome=dadosEntrada.next();
        System.out.println("Digite sua idade: ");
        idade=dadosEntrada.nextInt();
        System.out.println("Digite seu salário: ");
        salario=dadosEntrada.nextDouble();
        System.out.println("Qual seu sexo? ");
        sexo=dadosEntrada.next();
        System.out.println("Qual seu estado civil? ");
        estadoCivil = dadosEntrada.next();



    }
}
