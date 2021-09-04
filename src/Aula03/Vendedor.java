package Aula03;

public class Vendedor {
	public String nome;
	public double salarioFixo;
	public double venda;
	
	//metodo construtor vazio
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
	
	public double calculaSalarioFinal(){
		double salarioFinal;
		salarioFinal = salarioFixo+venda*0.15;
		//System.out.println("O salário é: "+salarioFinal);
		return salarioFinal;
	}
	
}
