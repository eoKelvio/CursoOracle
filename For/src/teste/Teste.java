package teste;

import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		// Primeiro teste
		/*int[] agui = {10,20,30,40,50};
		for(int n : agui) {
			System.out.println(n);
		}
		
		
		for(int i = agui.length - 1;i >= 0; i--) {
			System.out.println(agui[i]);
		}*/
		
		
		// Segundo teste
		
		/*int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i!=matriz.length;i++ ) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.println(matriz[i][j]);
			}
		}*/
		
		// Terceiro teste
		
		/*int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<matriz.length;i++) {
			System.out.println(matriz[i][i]);
		}*/
		
		
		//Quarto teste
		
		/*int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<matriz.length;i++) {
			System.out.println(matriz[i][matriz.length-i-1]);
			}*/
		
		//Quinto teste
		
		/*int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<matriz[0].length;i++) {
			for(int j=matriz.length-1;j>=0;j--) {
					System.out.println(matriz[j][i]);
			}
		}*/
		
		//Exercícios Extras:
		//Ex 1
		
		
		/*int[][] agui = new int[3][3];
		int maior = agui[0][0];
		
		for (int i=0;i<agui.length;i++) {
			for(int j=0;j<agui[i].length;j++) {
				int numero = r.nextInt(100)+1;
				agui[i][j] = numero;
				
				if (agui[i][j] > maior) {
                    maior = agui[i][j];
                }
				
			}
			
		}
		System.out.println(maior);*/
		
		//Ex 2
		
		
		int [][] matriz = new int [3][3];
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = r.nextInt(100);
			}
		}
		
		int maior = matriz[0][0];
		System.out.println("Matriz Original:");
		for(int [] vetor: matriz) {
			int soma = 0;
			for(int n : vetor) {
				System.out.print(n + ", ");
				if(n>maior)
					maior=n;
				soma+=n;
			}
			System.out.println("\tSoma = " + soma);
		}
		
		System.out.print("\nMaior numero da matriz:");
		System.out.print(maior);
		
		System.out.print("\n\nDiagonal principal: ");
		int soma=0;
		for(int i=0;i<matriz.length;i++) {
			System.out.print(matriz[i][i]+", ");
			soma+=matriz[i][i];
		}
		System.out.println("\nMedia da diagonal principal = "+ (double)soma/matriz.length);
		
		System.out.print("\nDiagonal secundaria: ");
		soma=0;
		for(int i=0;i<matriz.length;i++) {
			System.out.print(matriz[i][(matriz[0].length-1)-i]+", ");
			soma+=matriz[i][(matriz[0].length-1)-i];
		}
		System.out.println("\nMedia da diagonal secundaria = "+ (double)soma/matriz.length);
		
		
		System.out.println("\nGiro de 90°");
		for(int col=0;col<matriz[0].length;col++){
			for(int lin=matriz.length-1;lin>=0;lin--) {
				System.out.print(matriz[lin][col]+ ", ");
			}
			System.out.println(" ");
		}
		
	}

}
