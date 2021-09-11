package Aula06;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Faça um programa que receba o nome do aluno e as notas das suas 10 disciplinas 
 * (As notas deverão ser armazenadas em um vetor do tipo <Nota>- 
 * Classe com os atributos nomeDisciplina e pontuacao).
O sistema deverá imprimir o nome do aluno com todas as disciplinas 
informadas e suas respectivas notas, a média geral do aluno, sua menor 
nota e sua maior nota (Caso de empate usar a primeira informada).
 * @author renan
 *
 */
public class Pratica {

	public static void main(String[] args) {
		
		String nome,nomeDisciplina;
		int falta;
		float notaAtual;
		Nota[] nota = new Nota[3];
		float menorNota=10,maiorNota=0,mediaGeral=0;

		nome = JOptionPane.showInputDialog("Informe seu nome");
		
		for(int i=0;i<nota.length;i++) {
			nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina");
			notaAtual = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota obtida na disciplina: "));
			falta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas"));
			nota[i] = new Nota();
			nota[i].setNomeDisciplina(nomeDisciplina);
			nota[i].setNota(notaAtual);
			nota[i].setFaltas(falta);
			mediaGeral +=notaAtual;
			if(menorNota>notaAtual) {
				menorNota=notaAtual;
			}
			if(maiorNota<notaAtual) {
				maiorNota=notaAtual;
			}
		}
		
		System.out.println(nome);
		for(Nota i:nota) {
			System.out.println(" "+i.getNomeDisciplina()+" - "+i.getNota()+" - "+i.getFaltas());
		}
		System.out.println("Média geral: "+mediaGeral/nota.length);
		System.out.println("Menor nota: "+menorNota);
		System.out.println("Maior nota: "+maiorNota);
	}

}
