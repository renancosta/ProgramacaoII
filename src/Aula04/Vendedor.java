package Aula04;

public class Vendedor {
	//ATRIBUTOS
	private String nome;
	private double salarioFixo;
	private double venda;
	
	//MÉTODO CONSTRUTOR
	public Vendedor() {
		
	}
	
	public Vendedor(String nome) {
		this.nome = nome;
	}
	
	public Vendedor(String nome, double salarioFixo) {
		this.nome = nome;
		this.salarioFixo = salarioFixo;
	}
	
	public Vendedor(String nome, double salarioFixo, double venda) {
		this.nome = nome;
		this.salarioFixo = salarioFixo;
		this.venda = venda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	//MÉTODOS DA CLASSE
	public double calculaSalarioFinal(){
		double salarioFinal;
		salarioFinal = salarioFixo+venda*0.15;
		//System.out.println("O salário é: "+salarioFinal);
		return salarioFinal;
	}
	
}
