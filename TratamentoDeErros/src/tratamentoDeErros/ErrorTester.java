package tratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorTester {

	public static void main(String[] args) {
		String []senhas = {"p@ssword", "sEnh@", "1234", "admin", "paralelepipedo", "321", "010203"};
		
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Informe a posição do vetor que deseja expor: ");
				i = sc.nextInt();
				if(i>=4 && i<=6) {
					throw new Exception("BANIDU");
				}
				
				else if(i<0) {
					throw new Exception("ACABOU");
				}
				System.out.println(senhas[i]);
			}
			catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Entrada invalida, tente novamente.");
				//ArrayIndexOutOfBoundsException
				//InputMismatchException
			}
			catch(ArrayIndexOutOfBoundsException e) {
				sc.nextLine();
				System.out.println("Senha inexistente, tente novamente.");
				//ArrayIndexOutOfBoundsException
				//InputMismatchException
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}while(i>=0);
		
	}

}
