package AtividadePOO.aula25;

public class Lampada {
    String nome;
    boolean ligada;

    void acesa(){
        ligada = true;
    }

    void desligada(){
        ligada = false;
    }

    void ligarLampada (){
       acesa();
            System.out.println("A lÂMPADA ESTÁ LIGADA!");

    }

    void desligarLampada(){
        desligada();
            System.out.println("A LÂMPADA ESTA DESLIGADA");

    }

    void mudarEstado(){
        if(ligada){
            desligada();
            System.out.println("Desligada");
        }else{
            acesa();
            System.out.println("Ligada");
        }
    }
}

/*
escreva uma classe para representar uma lampada.Desenvolva métodos para ligar
e desligar a lampada
 */