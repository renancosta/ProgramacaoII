package Aula03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaSalario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();
		Vendedor vendedor2;
		
		System.out.println("Informe o nome do vendedor");
		vendedor.nome = entrada.nextLine();
		System.out.println("Informe o salário fixo");
		vendedor.salarioFixo = entrada.nextDouble();
		System.out.println("Informe o total de vendas");
		vendedor.venda = entrada.nextDouble();
		
		System.out.println("Nome do vendedor: "+vendedor.nome);
		System.out.println("Salário Fixo: "+vendedor.salarioFixo);
		System.out.println("Salário Final: "+vendedor.calculaSalarioFinal());
		
		vendedor2 = new Vendedor("Alysson",1000,30000);
		System.out.println("Nome do vendedor: "+vendedor2.nome);
		System.out.println("Salário Fixo: "+vendedor2.salarioFixo);
		System.out.println("Salário Final: "+vendedor2.calculaSalarioFinal());
		
	}
}
