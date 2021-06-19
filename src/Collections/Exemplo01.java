package Collections;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as setes notas");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);
        notas.add(6.5);
        notas.add(7.9);
        notas.add(7.7);
        notas.add(10.0);

        System.out.println(notas);
        //toString também pode ser usado

        //posição de um objeto
        System.out.println(notas.indexOf(7.7));

        System.out.println("Adicionando elemento");
        notas.add(6, 6.8);
        System.out.println(notas);

        System.out.println("Substituindo elemento");
        notas.set(notas.indexOf(10.0), 6.8);
        System.out.println(notas);

        System.out.println("Checkar se um elemento está na lista");
        System.out.println(notas.contains(9.0));

    }
}
