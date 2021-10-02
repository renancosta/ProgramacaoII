package Aula09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao;
		String nome, email;
		int telefone;
		
		do {
			System.out.println("###Agenda de Contatos###");
			System.out.println("1- Adicionar um contato");
			System.out.println("2- Remover um contato");
			System.out.println("3- Busca contato por nome");
			System.out.println("4- Exibir contatos da agenda");
			System.out.println("5- Sair");
			System.out.println("Informe uma opção: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					entrada.nextLine();
					System.out.println("Informe o nome do contato: ");
					nome = entrada.nextLine();
					System.out.println("Informe o telefone do contato: ");
					telefone = entrada.nextInt();
					System.out.println("Informe o e-mail do contato");
					entrada.nextLine();
					email = entrada.nextLine();
					Contato contato = new Contato(nome, telefone, email);
					agenda.armazenaContato(contato);
					break;
				case 2:
					entrada.nextLine();
					System.out.println("Informe o nome do contato: ");
					nome = entrada.nextLine();
					agenda.removeContato(nome);
					break;
				case 3:
					entrada.nextLine();
					System.out.println("Informe o nome do contato: ");
					nome = entrada.nextLine();
					agenda.imprimeContato(agenda.buscaContato(nome));
					break;
				case 4:
					agenda.imprimeAgenda();
					break;
				case 5:
					System.out.println("Saindo do sistema...");
					System.exit(0);
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}while(true);
		
	}

}
