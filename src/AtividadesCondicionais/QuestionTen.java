package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        String letra;
        System.out.println("Digit M - Matutino");
        System.out.println("Digit V - Vespertino");
        System.out.println("Digit N - Noturno");
        System.out.println("Digite uma das opções, por favor: ");
        letra = dadosEntrada.next();
        switch (letra){
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("VALOR INVÁLIDO!");
                break;
        }
    }
}
/*
    Faça um Programa que pergunte em que turno você estuda. Peça
    para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
    mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
    Inválido!", conforme o caso.
 */