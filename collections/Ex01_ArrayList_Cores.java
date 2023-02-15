package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01_ArrayList_Cores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		String cor;
		int opcao = 0;
		
		for(int contador = 0; contador < 5; contador++) {
			System.out.println("Digite a " + (contador + 1) + "ª cor");
			leia.skip("\\R?");
			cor = leia.nextLine();
			cores.add(cor);
		}

		do {
			System.out.println("1 - Listar todas as cores adicionadas");
			System.out.println("2 - Ordenar as cores");
			System.out.println("3 - Sair");
			System.out.println("Digite a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Listar todas as cores:");
				cores.forEach(System.out::println);
				//percorre toda a collection e usa o método println em cada item da collection
				break;
			case 2:
				Collections.sort(cores);
				System.out.println("Ordenar as cores:");
				cores.forEach(System.out::println);
			default:
				if (opcao != 3)
					System.out.println("Opção inválida!");
			// collection array list permite dados duplicados, mas pega o primeiro

			}

		} while (opcao != 3);

		leia.close();

	}

}
