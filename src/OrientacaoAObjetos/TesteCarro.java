package OrientacaoAObjetos;

public class TesteCarro {
    public static void main(String[] args) {

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.ano = 1989;
        fusca.preco = 5200.00;

        System.out.println("O modelo do carro é " + fusca.modelo);
        System.out.println("A marca do carro é " + fusca.marca);
        System.out.println("O ano do carro é " + fusca.ano);
        System.out.println("O preçodo carro é " + fusca.preco);
    }
}
