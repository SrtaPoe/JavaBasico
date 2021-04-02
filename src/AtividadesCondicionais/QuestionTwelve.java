package AtividadesCondicionais;

import java.util.Scanner;

public class QuestionTwelve {
    public static void main(String[] args) {
        Scanner dadosEntrda = new Scanner(System.in);
        double valorHora;
        double horasTrabalhadas;

        System.out.println("Quanto custa sua hora trabalhada? ");
        valorHora = dadosEntrda.nextDouble();
        System.out.println("Quantas horas você trabalhou neste mês? ");
        horasTrabalhadas = dadosEntrda.nextDouble();


        //cálculo prévio antes dos descontos
        double salarioBruto = valorHora*horasTrabalhadas;

        //FGTS
        double fgtsImposto = 0.11*salarioBruto;

        //INSS
        double inssImposto = 0.10*salarioBruto;

        //CÁLCULOS DE DESCONTOS
        if(salarioBruto<=900){
            double salarioLiquido = salarioBruto -inssImposto;
            System.out.println("Salário Bruto: " + "        :R$ " + salarioBruto);
            System.out.println("(-) INSS (10%) " + "        : R$ " + inssImposto);
            System.out.println("FGTS (11%) " +"             : R$ " + fgtsImposto);
            System.out.println("Salário Líquido " + "       :R$ " + salarioLiquido);
        }else if(salarioBruto>900 && salarioBruto<=1500){
            double impostoDeRenda = 0.05*salarioBruto;
            double salarioLiquido = salarioBruto -inssImposto-impostoDeRenda;
            System.out.println("Salário Bruto: "  + "      :R$ " + salarioBruto);
            System.out.println("(-) IR (5%) " + "          : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%) " + "       : R$ " + inssImposto);
            System.out.println("FGTS (11%) " +"            : R$ " + fgtsImposto);
            System.out.println("Salário Líquido " + "      :R$  " + salarioLiquido);
        }else if(salarioBruto>1500 && salarioBruto<=2500){
            double impostoDeRenda = 0.10*salarioBruto;
            double salarioLiquido = salarioBruto -inssImposto-impostoDeRenda;
            System.out.println("Salário Bruto" + "          :R$ " + salarioBruto);
            System.out.println("(-) IR (10%) " + "          : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%) " + "        : R$ " + inssImposto);
            System.out.println("FGTS (11%) " +"             : R$ " + fgtsImposto);
            System.out.println("Salário Líquido " + "       :R$ " + salarioLiquido);
        }else{
            double impostoDeRenda = 0.20*salarioBruto;
            double salarioLiquido = salarioBruto -inssImposto-impostoDeRenda;
            System.out.println("Salário Bruto: " + "        :R$ " + salarioBruto);
            System.out.println("(-) IR (20%) " + "          : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%) " + "        : R$ " + inssImposto);
            System.out.println("FGTS (11%) " +"             : R$ " + fgtsImposto);
            System.out.println("Salário Líquido " + "       :R$  " + salarioLiquido);
        }
    }
}

/*
    Faça um programa para o cálculo de uma folha de pagamento,
    sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
    FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
    a empresa que deposita). O Salário Líquido corresponde ao Salário
    Bruto menos os descontos. O programa deverá pedir ao usuário o
    valor da sua hora e a quantidade de horas trabalhadas no mês.
    o Desconto do IR:
    o Salário Bruto até 900 (inclusive) - isento
    o Salário Bruto até 1500 (inclusive) - desconto de 5%
    o Salário Bruto até 2500 (inclusive) - desconto de 10%
    o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
    as informações.
 */