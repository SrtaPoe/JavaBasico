package DoWhile;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double nota;
        boolean notaValida;

        do {
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = dadosEntrada.nextDouble();
                notaValida=true;
            if(nota>=0 && nota <=10){
                System.out.println("Você digitou: " + nota);
            }else {
                notaValida=false;
                System.out.println("Nota Inválida! Digite novamente!");
            }
        }while(!notaValida);

    }
}
