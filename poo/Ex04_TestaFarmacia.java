package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_TestaFarmacia {

	public static void main(String[] args) {
		// com método main

		Scanner leia = new Scanner(System.in);

		// collection
		ArrayList<Ex04_Farmacia> farmacia = new ArrayList<Ex04_Farmacia>();

		// variáveis que receberão dados a serem digitados
		long id;
		String nome, nomeComercial, fabricante, foto, opcao, principioAtivo, fragancia;
		float preco;
		int tipo;

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

			System.out.println("\nTipo: ");
			tipo = leia.nextInt();

			switch (tipo) {
			case 1 -> {
				System.out.println("\nPrincípio ativo: ");
				leia.skip("\\R?");
				principioAtivo = leia.nextLine();

				Ex04_Medicamento m1 = new Ex04_Medicamento(id, nome, nomeComercial, fabricante, foto, preco, tipo,
						principioAtivo);

				farmacia.add(m1);
			}
			case 2 -> {
				System.out.println("\nFragância: ");
				leia.skip("\\R?");
				fragancia = leia.nextLine();

				Ex04_Perfumaria p1 = new Ex04_Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragancia);

				// adiciona o objeto dentro da collection
				farmacia.add(p1);
			}
			}

			System.out.println("\nDeseja continuar? ");
			leia.skip("\\R?");
			opcao = leia.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var produto : farmacia) {
			produto.reajuste(0.10f);
			produto.visualizar();
		}

		leia.close();

	}

}
