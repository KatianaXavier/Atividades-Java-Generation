package atividades_java;

import java.util.Scanner;

public class Ex04_Diferenca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3,n4, diferenca;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextInt(); 
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença entre os números digitados é: " + diferenca);

		leia.close();
	}
}
