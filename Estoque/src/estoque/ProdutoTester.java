package estoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int maxSize = -1;
		int tempIdProduto;
		String tempNome;
		double tempPreco;
		int tempQuantidade;
		
		do{
			try {
				System.out.println("Insira o número de produtos que gostaria de adicionar:");
				System.out.println("insira 0 (zero) se não quiser adicionar produtos");
				maxSize = in.nextInt();
				
				if(maxSize < 0)
					throw new Exception();
			}catch(InputMismatchException e) {
				in.nextLine();
				System.err.println("Tipo incorreto de dados inseridos.");
			}catch(Exception e) {
				in.nextLine();
				System.err.println("O numero de produtos não pode ser menor que zero.");
			}
		
			
		}while(maxSize<0);
		
		if(maxSize == 0);
			System.out.println("Não há produtos!");
		else {
		Produto [] produtos = new Produto [maxSize];
		
		//Criando e definindo atributos para 6 objetos
		for(int i = 0; i<maxSize; i++) {

			System.out.println("\n*Estoque do livro " + (i+1) );
			System.out.println("Digite o Id do livro " + (i+1) + " :" );
			tempIdProduto = in.nextInt();
			in.nextLine();
			System.out.println("Digite o nome do livro " + (i+1) + " :" );
			tempNome = in.nextLine();
			System.out.println("Digite o preço do livro " + (i+1) + " :" );
			tempPreco = in.nextDouble();
			System.out.println("Digite a quantidade de livros "+ (i+1) + " :" );
			tempQuantidade = in.nextInt();
			
			produtos[i] = new Produto (tempIdProduto, tempNome, tempPreco, tempQuantidade);
			System.out.println(" ");
		}
		
		//Trabalhando com o objeto 6
		produtos[5].setAtivo(false);
		
		//Exibindo os 6 objetos
		System.out.println("%Estoque:\n");
		for(int i=0; i<=produtos.length-1; i++) {
			System.out.println(produtos[i]);
			}
		}
	}
}
    