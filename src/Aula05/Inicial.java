package Aula05;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Criar uma classe NumeroAleatorio que possui um m�todo gerarNumero() 
 * que gera um n�mero inteiro aleat�rio e um atributo chamado numero. 
 * A classe deve possuir um m�todo construtor que recebe o n�mero 
 * m�ximo que pode ser gerado (Ex: at� 10, at� 100, De at� 1000, at� 60). 
 * Criar uma classe que chama a classe NumeroAleatorio solicite ao usu�rio 
 * o n�mero m�ximo que pode ser gerado e informar o n�mero aleat�rio gerado.
 * Observa��o:
 * Deve possuir os m�todos get e set e o m�todo construtor	
 * @author renan
 *
 */
public class Inicial {
	
	public static void main(String[] args) {
		int maxNumero;
		NumeroAleatorio num = new NumeroAleatorio();
		
		//JOptionPane.showMessageDialog(null, "Gerador de n�mero aleat�rio");
		//maxNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero m�ximo que pode ser gerado"));
		num.setMaxNumero(60);
		//JOptionPane.showMessageDialog(null, num.gerarNumeroAleatorio());
		//System.out.println(num.getNumero());
		
		System.out.println(num.gerarJogoMegaSena(15));
		System.out.println(num.gerarJogoMegaSena(6,5));
	}

}
