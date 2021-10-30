package Aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;
		
		try {
			System.out.println("Informe sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Sua idade é "+idade);
		} catch (InputMismatchException i) {
			System.out.println("Valor digitado inválido!");
		} catch (Exception e) {
			System.out.println("Erro, tente novamente!");
		} finally {
			System.out.println("Não foi possível exibir sua idade");
		}

	}

}
