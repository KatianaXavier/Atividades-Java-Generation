package vetores;

import java.util.Scanner;

public class Ex01_Vetores_Posicao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int vetorInteiro[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int indice = 0; indice < vetorInteiro.length; indice++) {
			
			if(vetorInteiro[indice] == numero) {
				System.out.println("O número " + numero + " está localizado na posição: " + indice);
				return;
			} else if (indice == vetorInteiro.length-1) {
				System.out.println("O número " + numero + " não foi encontrado!");
			}
		
		leia.close();
		
		}

	}

}