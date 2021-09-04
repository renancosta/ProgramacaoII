package Aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaSalario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();
		Vendedor vendedor2;
		double salario;
		
		System.out.println("Informe o nome do vendedor");
		vendedor.setNome(entrada.nextLine());
		
		System.out.println("Informe o salário fixo");
		salario = entrada.nextDouble();
		vendedor.setSalarioFixo(salario);
		
		System.out.println("Informe o total de vendas");
		vendedor.setVenda(entrada.nextDouble());
		
		System.out.println("Nome do vendedor: "+vendedor.getNome());
		System.out.println("Salário Fixo: "+vendedor.getSalarioFixo());
		System.out.println("Salário Final: "+vendedor.calculaSalarioFinal());
		
		vendedor2 = new Vendedor("Alysson",1000,30000);
		System.out.println("Nome do vendedor: "+vendedor2.getNome());
		System.out.println("Salário Fixo: "+vendedor2.getSalarioFixo());
		System.out.println("Salário Final: "+vendedor2.calculaSalarioFinal());
		
	}
}
