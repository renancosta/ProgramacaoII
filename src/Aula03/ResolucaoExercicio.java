package Aula03;

import java.util.Scanner;

/*Escreva um programa em java que leia o nome do vendedor, 
 * o seu salário inicial (fixo) e o valor das vendas efetuadas no mês (total).
 *  Sabendo que o  vendedor ganha 15% de comissão em suas vendas,
 *   mostrar no sistema o seu nome, o salário inicial e salário final (fixo+comissão).
 */

public class ResolucaoExercicio {

	public static void main(String[] args) {
		String nome;
		double salarioFixo, salarioFinal;
		double vendas,comissao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do vendedor:");
		nome = entrada.nextLine();
		System.out.println("Informe o salário fixo do vendedor: ");
		salarioFixo = entrada.nextDouble();
		System.out.println("Informe o total de vendas do vendedor: ");
		vendas = entrada.nextDouble();
		
		//Cálculo do Salario
		comissao = vendas*0.15;//Usar somente uma das formas de calcular
		comissao = vendas*15/100;
		salarioFinal = salarioFixo + comissao;
		salarioFinal = salarioFixo + vendas*0.15;//Usar somente uma das formas de calcular
		
		//Resultado
		System.out.println("Nome do vendedor: "+nome);
		System.out.println("Salário Fixo: "+salarioFixo);
		System.out.println("Salário Final: "+salarioFinal);
		
	}

}
