package Aula3;

public class Pagamento {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("Alysson",1000,30000);
		//Imagine que aqui exista um m�todo que fa�a o pagamento (transfere o dinheiro, debita, faz um pix)
		System.out.println("Pagamento Realizado com sucesso!"+vendedor.calculaSalarioFinal());

	}

}
