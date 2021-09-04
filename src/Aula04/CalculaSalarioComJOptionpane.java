package Aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaSalarioComJOptionpane {
	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor();
		Vendedor vendedor2;
		String nome;
		double salario;
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");
		
		vendedor.setNome(JOptionPane.showInputDialog("Informe o nome do vendedor"));
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo"));
		vendedor.setSalarioFixo(salario);
		
		vendedor.setVenda(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de vendas")));
		
		JOptionPane.showMessageDialog(null, "Nome do vendedor: "+vendedor.getNome()+
		"\nSalário Fixo: "+vendedor.getSalarioFixo()+
		"\nSalário Final: "+vendedor.calculaSalarioFinal());
		
		vendedor2 = new Vendedor("Alysson",1000,30000);
		System.out.println("Nome do vendedor: "+vendedor2.getNome());
		System.out.println("Salário Fixo: "+vendedor2.getSalarioFixo());
		System.out.println("Salário Final: "+vendedor2.calculaSalarioFinal());
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema");
		System.out.println("Resposta: "+resposta);
		
	}
}
