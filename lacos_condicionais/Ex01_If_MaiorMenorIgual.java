package lacos_condicionais;

import java.util.Scanner;

public class Ex01_If_MaiorMenorIgual {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();

		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		if (a + b > c) {
			System.out.println("A soma de A + B é maior do que C");
		} else if (a + b < c) {
			System.out.println("A soma de A + B é menor do que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}
			
		leia.close();
	}
}
