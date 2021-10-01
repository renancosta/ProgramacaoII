package Aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeraTurmaUsandoSET {

	public static void main(String[] args) {

		Aluno aluno;
		int continuar=0;
		Scanner entrada = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		do {
			entrada.nextLine();
			aluno = new Aluno();
			System.out.println("Informe o nome do aluno: ");
			aluno.setNome(entrada.nextLine());
			System.out.println("Informe o e-mail do aluno: ");
			aluno.setEmail(entrada.nextLine());
			System.out.println("Informe a matricula do aluno: ");
			aluno.setMatricula(entrada.nextInt());
			
			alunos.add(aluno);
			System.out.println("Deseja continuar cadastrando aluno? 1-Sim/0-Não");
			continuar = entrada.nextInt();
		} while(continuar==1);
		
		
		alunos.forEach(alu -> {
			System.out.printf("Aluno: %s - %s\n",alu.getNome(),alu.getMatricula());
		});
		
		for(Aluno alu:alunos) {
			System.out.printf("Aluno: %s - %s\n",alu.getNome(),alu.getMatricula());
		}
		
		for(int i=0;i<alunos.size();i++) {
			System.out.printf("Aluno: %s - %s\n",alunos.get(i).getNome(),alunos.get(i).getMatricula());
		}
		
		System.out.println("Primeiro aluno da turma: "+alunos.get(0));
	}

}
