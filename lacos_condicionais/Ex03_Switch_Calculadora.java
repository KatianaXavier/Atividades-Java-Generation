package lacos_condicionais;

import java.util.Scanner;

public class Ex03_Switch_Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		float n1, n2, resultado = 0;
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Código da operação: ");
		codigo = leia.nextInt();
		
		switch (codigo) {
			case 1: 
				resultado = n1 + n2;
				System.out.println("Resultado: " + resultado);
				break;
			case 2:
				resultado = n1 - n2;
				System.out.println("Resultado: " + resultado);
				break;
			case 3:
				resultado = n1 * n2;
				System.out.println("Resultado: " + resultado);
				break;
			case 4:
				resultado = n1 / n2;
				System.out.println("Resultado: " + resultado);
				break;
			default:
				System.out.println("Operação inválida!");
		}

		leia.close();
	}
}
