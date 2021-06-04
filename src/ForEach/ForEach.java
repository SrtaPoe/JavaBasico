package ForEach;

public class ForEach {
    public static void main(String[] args) {
        double[] notas = new double[4];
            notas[0] = 10.0;
            notas[1]= 9.5;
            notas[2]= 8.9;
            notas[3] = 9.5;


        for (double nota : notas) {
            System.out.println(nota);
        }
    }

}
