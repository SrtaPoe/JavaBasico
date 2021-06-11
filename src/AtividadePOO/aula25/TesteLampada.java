package AtividadePOO.aula25;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada azurro = new Lampada();
        azurro.nome = "Azurre";

        azurro.acesa();
        azurro.mudarEstado();
        azurro.desligada();
        azurro.mudarEstado();

    }
}
