package Aula13.model;

public class Vendedor {
	private int cod_vendedor;
	private String nome;
	private float salario;
	private char faixa_comissao;
	
	public Vendedor() {
		
	}
	
	public Vendedor(int cod_vendedor, String nome, float salario, char faixa_comissao) {
		super();
		this.cod_vendedor = cod_vendedor;
		this.nome = nome;
		this.salario = salario;
		this.faixa_comissao = faixa_comissao;
	}



	public int getCod_vendedor() {
		return cod_vendedor;
	}
	public void setCod_vendedor(int cod_vendedor) {
		this.cod_vendedor = cod_vendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public char getFaixa_comissao() {
		return faixa_comissao;
	}
	public void setFaixa_comissao(char faixa_comissao) {
		this.faixa_comissao = faixa_comissao;
	}
	
	@Override
	public String toString() {
		return nome+" - "+salario;
	}
	
}
