package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionEleven {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double salarioColaborador;
        //double reajusteSalarial;

        System.out.println("Digite o salário do colaborador: ");
        salarioColaborador = dadosEntrada.nextDouble();


        if(salarioColaborador<=280){
            System.out.println("Seu salário sem aumento é de R$ " + salarioColaborador);
            double salarioComAumento = (salarioColaborador *0.20)+salarioColaborador;
            System.out.println("O seu salário com 20% de aumento é de R$ " + salarioComAumento);
        }else if(salarioColaborador>280 && salarioColaborador<700){
            System.out.println("Seu salário sem aumento é de R$ " + salarioColaborador);
            double salarioComAumento = (salarioColaborador*0.15)+salarioColaborador;
            System.out.println("O seu salário com 15% de aumento é de R$ " + salarioComAumento);
        }else if(salarioColaborador>700 && salarioColaborador<1500){
            System.out.println("Seu salário sem aumento é de R$ " + salarioColaborador);
            double salarioComAumento = (salarioColaborador*0.10)+salarioColaborador;
            System.out.println("O seu salário com 10% de aumento é de R$ " + salarioComAumento);
        }else{
            System.out.println("Seu salário sem aumento é de R$ " + salarioColaborador);
            double salarioComAumento = (salarioColaborador*0.05)+salarioColaborador;
            System.out.println("O seu salário com 5% de aumento é de R$ " + salarioComAumento);
        }

    }
}
/*
    As Organizações Tabajara resolveram dar um aumento de salário aos
    seus colaboradores e lhe contraram para desenvolver o programa que
    calculará os reajustes.
    o Faça um programa que recebe o salário de um colaborador e o
    reajuste segundo o seguinte critério, baseado no salário atual:
    o salários até R$ 280,00 (incluindo) : aumento de 20%
    o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    o salários de R$ 1500,00 em diante : aumento de 5% Após o
    aumento ser realizado, informe na tela:
    o o salário antes do reajuste;
    o o percentual de aumento aplicado;
    o o valor do aumento;
    o o novo salário, após o aumento.
 */