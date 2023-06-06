package estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTester {
	
	private static ArrayList<Product> listaProdutos;
	private static Scanner scanner;

	public static void main(String[] args) {
		int opcao;
		scanner = new Scanner(System.in);
		listaProdutos = new ArrayList<Product>();
		 
		do {
			opcao = menu();
			switch (opcao) {
				case 1:
					cadastrar();
					break;
				case 5:
					listar();
					break;
			}
			
		} while(opcao != 6);
		
	}
	
	public static int menu() {
		int opcao;
		
		System.out.println("\n**** Controle de Inventário ****");
		System.out.println("1. Cadastrar");
		System.out.println("2. Adicionar");
		System.out.println("3. Remover");
		System.out.println("4. Modificar");
		System.out.println("5. Listar");
		System.out.println("6. Encerrar Programa");
		
		System.out.print("Informe uma opção: ");
		
		try {		
			opcao = scanner.nextInt();
		} catch (Exception e) {
			System.err.println("Valor inválido!");
			opcao = 0;
		}
		clearCache();
		return opcao;
	}
	
	public static void clearCache() {
		if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	}
	
	public static void cadastrar() {

		Product produto;
		int idProduto;
		String nome;
		double preco;
		int quantidade;
		boolean estado;

		try {
			System.out.print("Informe o número do Produto: ");
			idProduto = scanner.nextInt();
			clearCache();

			System.out.print("Informe o nome do Produto: ");
			nome = scanner.next();
			clearCache();

			System.out.print("Informe a quantidade do Produto: ");
			quantidade = scanner.nextInt();
			clearCache();

			System.out.print("Informe o preço do Produto: ");
			preco = scanner.nextDouble();
			clearCache();

			System.out.print("Informe o status do Produto: ");
			estado = scanner.nextBoolean();
			clearCache();
			
		} catch (Exception e) {
			System.err.println("Erro nos valores digitados, tente novamente!");
			return;
		}
		
		produto = new Product(idProduto, nome);
		produto.setQuantidade(quantidade);
		produto.setPreco(preco);
		produto.setEstado(estado);
		
		listaProdutos.add(produto);
		
	}
	
	public static void listar() {
		System.out.println("\n Relação de produtos");
		for (Product produto : listaProdutos) {
			System.out.println(produto.toString() + "\n");
		}
		
	}

}
