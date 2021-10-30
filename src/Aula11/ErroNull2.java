package Aula11;

public class ErroNull2 {
	public static void main(String args[]) {
		String frase = "frase teste";
		String novaFrase = null;

		if(frase == null) {
			System.out.println("Frase não informada");
		} else if(frase.isBlank()) {
			System.out.println("Frase em branco!");
		}
		else {
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}
}
