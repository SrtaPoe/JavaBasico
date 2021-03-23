package Lista.Numero.Dois;

public class QuestaoDois {
    public static void main(String[] args) {
        int numeroSete = 7;
        int numeroOito = 8;
        int numeroNove = 9;
        int mediaAritmeticaPrimeirosNumeros = (numeroSete+numeroOito+numeroNove)/3;

        int numeroQuatro = 4;
        int numeroCinco = 5;
        int numeroSeis = 6;
        int mediaAritmeticaSecundariosNumeroas = (numeroQuatro+numeroCinco+numeroSeis)/3;

        int mediaDasMedias = (mediaAritmeticaPrimeirosNumeros+mediaAritmeticaSecundariosNumeroas)/2;
        int somaMedias = mediaAritmeticaPrimeirosNumeros+mediaAritmeticaSecundariosNumeroas;

        System.out.println("A média dos números 4,5 e 6 é de " + mediaAritmeticaSecundariosNumeroas);
        System.out.println(" A média dos números 7,8 e 9 é de " + mediaAritmeticaSecundariosNumeroas);
        System.out.println("A soma das médias é de " + somaMedias);
        System.out.println(" A média das médias é de " + mediaDasMedias);


    }
}

/*
    Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
    números 4, 5 e 6. A soma das duas médias. A média das médias.
 */