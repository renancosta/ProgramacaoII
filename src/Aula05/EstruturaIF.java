package Aula05;

import java.util.Scanner;

public class EstruturaIF {
	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe sua idade");
		idade = entrada.nextInt();
		if(idade>=0 && idade<1){
			System.out.println("Recem nascido");
		} else if (idade>=1 && idade<10){
			System.out.println("Criança");
		} else if (idade>=10 && idade<18){
			if(idade<12){
				System.out.println("Pré-Adolescente");
			}
			else{
				System.out.println("Adolescente");
			}
		} else if (idade>=18 && idade<65){
			System.out.println("Aduldo");
		} else if(idade>=65) {
			if(idade>135) {
				System.out.println("Tem certeza que deseja informar essa idade?");
			}
			System.out.println("Idoso");
		}
		else {
			System.out.println("Idade informada incorreta");
		}
		
	}
}
