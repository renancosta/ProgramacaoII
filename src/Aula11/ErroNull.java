package Aula11;

public class ErroNull {
	public static void main(String args[]) { 
		String frase = null; 
		String novaFrase = null;
		
		try{
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException ne) {
			System.out.println("Frase nula, será utilizado o valor padrão: frase não informada");
			frase = "frase não informada";
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
