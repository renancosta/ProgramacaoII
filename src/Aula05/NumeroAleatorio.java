package Aula05;

public class NumeroAleatorio {
	private int numero;
	private int maxNumero;
	
	public NumeroAleatorio() {
		
	}
	
	public NumeroAleatorio(int maxNumero) {
		this.maxNumero = maxNumero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getMaxNumero() {
		return maxNumero;
	}

	public void setMaxNumero(int maxNumero) {
		this.maxNumero = maxNumero;
	}

	public int gerarNumeroAleatorio() {
		numero = (int)(Math.random()*maxNumero);
		return numero;
	}
	
	public String gerarJogoMegaSena(int qtdNumeros) {
		String jogo = "";
		if(qtdNumeros<6 || qtdNumeros >15) {
			return "Quantidade de números inválido para MegaSena- Informe de 6 a 15!";
		}
		for(int i=0;i<qtdNumeros;i++) {
			jogo += (int)(Math.random()*maxNumero)+" ";
		}
		return jogo;
	}
	public String gerarJogoMegaSena(int qtdNumeros,int qtdJogos) {
		String jogo = "";
		if(qtdNumeros<6 || qtdNumeros >15) {
			return "Quantidade de números inválido para MegaSena- Informe de 6 a 15!";
		}
		for(int i=0;i<qtdJogos;i++) {
			for(int j=0;j<qtdNumeros;j++) {
				jogo += (int)(Math.random()*maxNumero)+" ";
			}
			jogo+="\n";
		}
		return jogo;
	}
}
