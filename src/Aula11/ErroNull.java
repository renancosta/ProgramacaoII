package Aula11;

public class ErroNull {
	public static void main(String args[]) { 
		String frase = null; 
		String novaFrase = null;
		
		try{
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException ne) {
			System.out.println("Frase nula, ser� utilizado o valor padr�o: frase n�o informada");
			frase = "frase n�o informada";
		} catch(Exception e) {
			System.out.println("Erro! Tente novamente.");
		}
		finally {
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: "+frase); 
		System.out.println("Frase nova: "+novaFrase); 
	} 
}
