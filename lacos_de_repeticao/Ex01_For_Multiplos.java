package lacos_de_repeticao;

import java.util.Scanner;

public class Ex01_For_Multiplos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int intervalo1, intervalo2;

		System.out.println("Digite o primeiro intervalo: ");
		intervalo1 = leia.nextInt();

		System.out.println("Digite o segundo intervalo: ");
		intervalo2 = leia.nextInt();

		if (intervalo1 < intervalo2) {
			System.out.printf("\nNo intervalo entre %d e %d:\n", intervalo1, intervalo2);
			for (int contador = intervalo1; contador <= intervalo2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", contador);
				}
			}
		} else {
			System.out.println("Intervalo inválido!");
		}

		leia.close();
	}
}