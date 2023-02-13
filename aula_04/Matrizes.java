package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int matrizInteiros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		float[][] matriz = new float[2][2];

		// Lê as linhas
		for (int indiceI = 0; indiceI < matrizInteiros.length; indiceI++) {

			// Lê as colunas
			for (int indiceJ = 0; indiceJ < matrizInteiros.length; indiceJ++) {
				System.out.println(matrizInteiros[indiceI][indiceJ]);
			}
		}

		for (int indiceI = 0; indiceI < matrizInteiros.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matrizInteiros.length; indiceJ++) {
				System.out.println("Digite um valor real: ");
				matriz[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for(float[] vetor : matriz ) {
			for(var elemento : vetor) {
				System.out.println(elemento);
			}
		}

		leia.close();

	}

}