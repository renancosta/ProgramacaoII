package Aula3;

import java.util.Scanner;

public class Exercicio {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String nomeVendedor;
		double salarioFixo; // Salario Fixo do vendedor
		double vendas; // vendas efetuadas pelo vendedor
		double comissao; // comissão de 15% sobre as vendas
		double salarioFinal; // salario final ( fixo + comissao )
		System.out.print(" Digite o nome do vendedor:");
		nomeVendedor = input.nextLine();
		System.out.print("Digite o salário fixo do vendedor:");
		salarioFixo = input.nextDouble();
		System.out.print("Digite o total de vendas efetuadas pelo vendedor:");
		vendas = input.nextDouble();
		comissao = (vendas * 15) / 100;
		salarioFinal = comissao + salarioFixo;
		System.out.println("Nome do Vendedor:" + nomeVendedor);
		System.out.println("Salario Fixo:" + salarioFixo + "reais");
		System.out.println("Salario Final:" + salarioFinal + "reais");
	}
}
