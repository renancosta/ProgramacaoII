package Aula3;

public class Pagamento {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("Alysson",1000,30000);
		//Imagine que aqui exista um método que faça o pagamento (transfere o dinheiro, debita, faz um pix)
		System.out.println("Pagamento Realizado com sucesso!"+vendedor.calculaSalarioFinal());

	}

}
