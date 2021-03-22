package AulasIniciais;

import java.util.Scanner;

public class EntradaTeclado {
    public static void main(String[] args) {
        Scanner dadoUm = new Scanner(System.in);
        double altura;
        System.out.println("Digite sua altura: ");
        altura = dadoUm.nextDouble();
        Scanner dadoDois = new Scanner(System.in);
        System.out.println(("Digite seu peso: "));
        double peso;
        peso = dadoDois.nextDouble();

        double imc = peso/(altura*2);


        System.out.println("Seu IMC é de " + imc);
    }
}
