package Aula05;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Criar uma classe NumeroAleatorio que possui um método gerarNumero() 
 * que gera um número inteiro aleatório e um atributo chamado numero. 
 * A classe deve possuir um método construtor que recebe o número 
 * máximo que pode ser gerado (Ex: até 10, até 100, De até 1000, até 60). 
 * Criar uma classe que chama a classe NumeroAleatorio solicite ao usuário 
 * o número máximo que pode ser gerado e informar o número aleatório gerado.
 * Observação:
 * Deve possuir os métodos get e set e o método construtor	
 * @author renan
 *
 */
public class Inicial {
	
	public static void main(String[] args) {
		int maxNumero;
		NumeroAleatorio num = new NumeroAleatorio();
		
		//JOptionPane.showMessageDialog(null, "Gerador de número aleatório");
		//maxNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número máximo que pode ser gerado"));
		num.setMaxNumero(60);
		//JOptionPane.showMessageDialog(null, num.gerarNumeroAleatorio());
		//System.out.println(num.getNumero());
		
		System.out.println(num.gerarJogoMegaSena(15));
		System.out.println(num.gerarJogoMegaSena(6,5));
	}

}
