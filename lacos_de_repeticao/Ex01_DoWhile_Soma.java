package lacos_de_repeticao;

import java.util.Scanner;

public class Ex01_DoWhile_Soma {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int soma = 0, numero = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + soma);

		leia.close();
	}
}
