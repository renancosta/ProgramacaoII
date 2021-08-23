package Aula01;

public class MeuPrimeiroPrograma {

	public static void main(String[] args) {
		int contador;
		contador = 1;
		int contador2 = 1;
		contador += ++contador2;
		System.out.println(contador);

		boolean ehIgual;
		int a, b;
		a = 1;
		b = 2;
		ehIgual = a != b;
		System.out.println(ehIgual);
	}

}
