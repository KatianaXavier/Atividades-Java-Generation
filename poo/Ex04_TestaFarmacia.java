package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_TestaFarmacia {

	public static void main(String[] args) {
		// com método main

		Scanner leia = new Scanner(System.in);

		// collection
		ArrayList<Ex04_Farmacia> medicamentos = new ArrayList<Ex04_Farmacia>();

		// variáveis que receberão dados a serem digitados
		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;

		do {
			// entrada de dados
			System.out.println("\nId: ");
			id = leia.nextLong();

			System.out.println("\nNome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();

			System.out.println("\nNome Comercial: ");
			nomeComercial = leia.nextLine();

			System.out.println("\nFabricante: ");
			fabricante = leia.nextLine();

			System.out.println("\nFoto: ");
			foto = leia.nextLine();

			System.out.println("\nPreço: ");
			preco = leia.nextFloat();

			// gerando o objeto da classe Ex04_Farmacia com os parâmetros que serão entrados
			Ex04_Farmacia f1 = new Ex04_Farmacia(id, nome, nomeComercial, fabricante, foto, preco);

			// adiciona o objeto dentro da collection
			medicamentos.add(f1);

			System.out.println("\nDeseja continuar? ");
			leia.skip("\\R?");
			opcao = leia.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var medicamento : medicamentos)
			medicamento.visualizar();
		// Ex04_Farmacia f2 = new Ex04_Farmacia(2, "Paracetamol", "Tylenol", "Neo
		// Química", "foto2.jpg", 20.0f);

		// chamando método visualizar da classe Ex04_Farmacia
		// f1.visualizar();

		// f2.visualizar();

		leia.close();

	}

}
