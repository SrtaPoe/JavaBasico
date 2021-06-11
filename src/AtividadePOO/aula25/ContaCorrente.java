package AtividadePOO.aula25;

import java.util.Scanner;

public class ContaCorrente {
    String numero;
    String agencia;
    double saldo;
    double limite;
    boolean especial;



    void sacarDinheiro(){
        Scanner dadosEntrada = new Scanner(System.in);
        double saque;
        System.out.println("Digite o valor que deseja sacar: ");
        saque = dadosEntrada.nextDouble();

        if(saldo>=saque){
            System.out.println("Aguarde que as cédulas estão sendo contadas");
            System.out.println("Seu saldo é de R$ " + (saldo-saque));
        }else if (saldo>=0){
            System.out.println("Você está usando seu chefe especial");
        }else{
            System.out.println("Você não possui saldo suficiente");
        }
    }

    void depositarDinheiro(){
        Scanner dadosEntrada = new Scanner(System.in);
        double deposito;
        System.out.println("Digite o valor que deseja depositar: ");
        deposito = dadosEntrada.nextDouble();

         double saldoAtualizado = saldo + deposito;

        System.out.println("Seu saldo atual é de R$ " + saldoAtualizado);
    }


    void verificarChequeEspecial(){

    }

}
