package matrizes;

import java.util.Scanner;

public class Ex01_Matrizes_Elementos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int dp = 0, ds = 0;
		
		System.out.println("Diagonal principal: ");

		for (int indice = 0; indice < matriz.length; indice++) {
			dp += matriz [indice][indice];
			System.out.print(matriz[indice][indice] + " ");
		}
		
		System.out.println("\nSoma dos elementos da diagonal principal: " + dp);
		
		System.out.println("Diagonal secundária: ");
		
		for (int indice = 0; indice < matriz.length; indice++) {
			ds += matriz[indice][matriz.length - 1 - indice];
			System.out.print(matriz[indice][matriz.length - 1 - indice] + " ");
		}
		
		System.out.println("\nSoma dos elementos da diagonal secundária: " + ds);
		
		leia.close();

	}

}
