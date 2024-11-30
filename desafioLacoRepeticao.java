package application;

import java.util.Scanner;

public class desafioLacoRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salario = scanner.nextDouble();

        double percentualAumento = 0;
        double aumento = 0;
        double salarioNovo = 0;
        double aumentoReal = 0;
        double inflacao = 3.8 / 100;

        double[] limitesSalarios = {280, 700, 1499};
        double[] percentuais = {0.20, 0.15, 0.10, 0.05};

        for (int i = 0; i < limitesSalarios.length; i++) {
            if (salario <= limitesSalarios[i]) {
                percentualAumento = percentuais[i];
                break;
            }
        }

        if (salario > limitesSalarios[limitesSalarios.length - 1]) {
            percentualAumento = percentuais[percentuais.length - 1];
        }

        aumento = salario * percentualAumento;
        salarioNovo = salario + aumento;
        aumentoReal = aumento - (aumento * inflacao);

        System.out.println("\n--- Resultado do Reajuste ---");
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário, após o aumento: R$ " + salarioNovo);
        System.out.println("Valor do aumento real (descontando inflação): R$ " + aumentoReal);
    }
}
