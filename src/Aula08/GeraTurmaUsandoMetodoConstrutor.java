package Aula08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Aula07.Aluno;

public class GeraTurmaUsandoMetodoConstrutor {

	public static void main(String[] args) {

		Aluno aluno;
		int continuar=0,matricula;
		String nome,email;
		Scanner entrada = new Scanner(System.in);
		ArrayList<Aluno> turma = new ArrayList<Aluno>();
		
		do {
			entrada.nextLine();
			System.out.println("Informe o nome do aluno: ");
			nome = entrada.nextLine();
			System.out.println("Informe o e-mail do aluno: ");
			email = entrada.nextLine();
			System.out.println("Informe a matricula do aluno: ");
			matricula = entrada.nextInt();
			aluno = new Aluno(nome,email,matricula);
			turma.add(aluno);
			System.out.println("Deseja continuar cadastrando aluno? 1-Sim/0-Não");
			continuar = entrada.nextInt();
		} while(continuar==1);
		
		turma.forEach(a -> {
			System.out.println("Aluno: "+a.getNome()+" - "+a.getMatricula());
		});
		
		System.out.println("Primeiro aluno da turma: "+turma.get(0));
	}

}
