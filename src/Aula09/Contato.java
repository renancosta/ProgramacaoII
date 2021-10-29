package Aula09;

public class Contato {
	String nome;
	int telefone;
	String email;
	int idade;
	
	public Contato() {
		
	}
	
	public Contato(String nome, int telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Contato(String nome, int telefone, String email,int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int meuMetodo(double x ) {

        if (x == 1 || x == 2) {

            return 1;

        }

        double raiz = Math.sqrt(x);

        for (int i = 2; i <= raiz; i++) {

            if (x % i == 0) {

                return 0;

            }

        }

        return 1;

    }
	
}
