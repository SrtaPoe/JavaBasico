package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        String letraConsultada;
        System.out.println("Digite uma letra: ");
        letraConsultada = dadosEntrada.nextLine();

        if(letraConsultada.length()>1){
            System.out.println("NÃO É UMA LETRA!");
        }else{
        switch (letraConsultada) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("É uma vogal!");
                break;
            default:
                System.out.println("É uma consoante!");
        }

        }
    }
}
/*
Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.
 */