package AtividadePOO.aula25;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.saldo = 1200.50;
        conta.depositarDinheiro();
        conta.sacarDinheiro();


    }
}
