package Aula06;

public class VetorMatriz {

	public static void main(String[] args) {
		//Declaração
		int[] vetor = {1,2,3,4,5};
		int []vetor2;
		int vetor3[] = new int[5];
		
		int[][] matriz = { {0, 0, 0}, {1, 1, 1}, {2, 2, 2} };
		int [][]matriz2;
		int matriz3[][] = new int[5][5];
		
		for(int i:vetor) {
			System.out.println(vetor[i-1]);
		}		
		 
		for(int i=0; i<matriz.length; i++){
		   for(int j=0; j<matriz[i].length; j++){
		      System.out.print(matriz[i][j]);
		   }
		}

	}

}
