package OrientacaoAObjetos;

public class Carro {
    String marca;
    String modelo;
    int ano;
    double preco;
    double capCombustivel;
    double consCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombustivel + " km ");
    }

    double obterAutonomia(){
        System.out.println("Chamando o método obterAutonomia");
        return capCombustivel*consCombustivel;
    }
}
