package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionVinteEUm {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        String respostaPerguntaUm;
        String respostaPerguntaDois;
        String respostaPerguntaTres;
        String respostaPerguntaQuatro;
        String respostaPerguntaCinco;

        System.out.println("Telefonou para a vítima? ");
        respostaPerguntaUm = dadosEntrada.next();
        System.out.println("Esteve no local do crime? ");
        respostaPerguntaDois = dadosEntrada.next();
        System.out.println("Mora perto da vítima? ");
        respostaPerguntaTres = dadosEntrada.next();
        System.out.println("Devia para a vítima? ");
        respostaPerguntaQuatro = dadosEntrada.next();
        System.out.println("Já trabalhou com a vítima? ");
        respostaPerguntaCinco = dadosEntrada.next();

        int count = 0;
        if(respostaPerguntaUm.equalsIgnoreCase("S")){
            count++;
        }if(respostaPerguntaDois.equalsIgnoreCase("S")){
            count++;
        }if(respostaPerguntaTres.equalsIgnoreCase("S")){
            count++;
        }if(respostaPerguntaQuatro.equalsIgnoreCase("S")){
            count++;
        }if(respostaPerguntaCinco.equalsIgnoreCase("S")){
            count++;
        }
            if(count==2){
                System.out.println("Suspeito");
            }else if(count==3 || count==4){
            System.out.println("Cúmplice");
             }else if(count==5){
                System.out.println("CULPADO!");
            }else{
                System.out.println("INOCENTE!");
            }
    }
}
