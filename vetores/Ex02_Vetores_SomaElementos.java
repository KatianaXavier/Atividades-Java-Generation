package vetores;

import java.util.Scanner;

public class Ex02_Vetores_SomaElementos {

	public static void main(String[] args) {

		int vetorInteiros[] = new int[10];
		float soma = 0, media = 0;
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			vetorInteiros[indice] = leia.nextInt();

			soma += vetorInteiros[indice];
		}

		System.out.println("Elementos nos índices ímpares: ");
		
		//índice iniciado na posição 1 e somado mais 2 a cada volta para olhar somente as posições ímpares
		for (int indice = 1; indice < 10; indice+=2) {
			System.out.print(vetorInteiros[indice] + " ");			
		}

		System.out.println("\nElementos pares: ");

		for (int indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] % 2 == 0) {
				System.out.print(vetorInteiros[indice] + " ");
			}
		}
		
		media = soma / vetorInteiros.length;
		
		System.out.printf("\nSoma: %.0f", soma);
		System.out.printf("\nMédia: %.2f", media);
		
		leia.close();

	}

}
