package Verificacao;

public class Funcionario {
	public String nome;
	public String cpf;
	public String cargo;
	public String carreira;
	
	public double calcularSalario() {		
		if(cargo.equals("desenvolvedor")) {
			if(carreira.equals("fullstack1")) {
				return 2.000;
			} else if(carreira.equals("fullstack2")) {
				return 3.000;
			} else if(carreira.equals("fullstack3")) {
				return 4.000;
			}
		} else if(cargo.equals("gerente")) {
			return 6.000;
		}
		
		System.out.println("Cargo não encontrado");
		return -1;

	}
}
