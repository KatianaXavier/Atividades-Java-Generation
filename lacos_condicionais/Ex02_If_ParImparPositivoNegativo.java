package lacos_condicionais;

import java.util.Scanner;

public class Ex02_If_ParImparPositivoNegativo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();

		if ((n % 2 == 0) && (n >= 0)) {
			System.out.println("O número " + n + " é par e positivo!");
		} else if ((n % 2 == 0) && (n < 0)) {
			System.out.println("O número " + n + " é par e negativo!");
		} else if ((n % 2 != 0) && (n >= 0)) {
			System.out.println("O número " + n + " é ímpar e positivo!"); 
		} else {
			System.out.println("O número " + n + " é ímpar e negativo!"); 
		}
			
		leia.close();
	}
}