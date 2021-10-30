package Aula11;

public class TratamentoComThrows {

	private static void aumentarLetras() throws NullPointerException
	{
	    String frase = null;
	    String novaFrase = null;
	    novaFrase = frase.toUpperCase();
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
	}
	
	public static void main(String[] args) {
		try {
			aumentarLetras();
		} catch (Exception e) {
			System.out.println("Frase não informada, é necessário preencher uma frase");
		}
	}

}
