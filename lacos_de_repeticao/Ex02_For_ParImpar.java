package lacos_de_repeticao;

import java.util.Scanner;

public class Ex02_For_ParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero = 0, par = 0, impar = 0;
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("Digite o %dº número: \n", contador);
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.printf("Total de números pares: %d", par);
		System.out.printf("\nTotal de números ímpares: %d", impar);
		
		leia.close();

	}
}