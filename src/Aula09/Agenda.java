package Aula09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	List<Contato> contatos = new ArrayList<Contato>();
	Scanner entrada = new Scanner(System.in);
	
	public void armazenaContato(Contato contato) {
		contatos.add(contato);
		System.out.println("Contato cadastrado com sucesso!");
		entrada.nextLine();
	}
	public void removeContato(String nome) {
		int idContato;
		idContato=buscaContato(nome);
		if(idContato==-1) {
			System.out.println("Contato inexistente!");
		}else {
			contatos.remove(idContato);
			System.out.println("Contato removido com sucesso!");
		}
		entrada.nextLine();
	}
	public int buscaContato(String nome) {
		//[0,1,2,3,4,5,6,7,8,9]
		int idContato=-1,i;
		for(i=0;i<contatos.size();i++) {
			if(nome.equals(contatos.get(i).getNome())) {
				idContato = i;
			}
		}
		return idContato;
	}
	public void imprimeAgenda() {
		for(Contato c:contatos) {
			System.out.println("Nome: "+c.getNome()+", Telefone: "+c.getTelefone()+", E-mail: "+c.getEmail());
		}
		entrada.nextLine();
	}
	public void imprimeContato(int index){
		if(index == -1) {
			System.out.println("Contato inexistente!");
		} else {
			System.out.println("Nome: "+contatos.get(index).getNome()+", Telefone: "+contatos.get(index).getTelefone()+", E-mail: "+contatos.get(index).getEmail());
		}
		entrada.nextLine();
	}

}
