package lacos_de_repeticao;

import java.util.Scanner;

public class Ex02_DoWhile_MultiplosDeTres {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int entrada = 0;
		float media = 0, multiplo = 0, soma = 0;

		do {
			System.out.println("Digite um número: ");
			entrada = leia.nextInt();

			if (entrada % 3 == 0 && entrada != 0) {
				multiplo++;
				soma += entrada;
			}

		} while (entrada != 0);

		media = soma / multiplo;

		System.out.println("A soma dos números múltiplos de 3 é: " + media);

		leia.close();

	}

}