package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01_Queue_Fila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao;
		String nome;

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Cliente na Fila            ");
			System.out.println("            2 - Listar todos os Clientes             ");
			System.out.println("            3 - Retirar Cliente da Fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("O programa foi encerrado!");
				leia.close();
				// mesma coisa que clicar no stop para parar o programa
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Adicionar cliente");
				System.out.println("Digite o nome do cliente:");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente foi adicionado!");
				break;
			case 2:
				System.out.println("Consultar cliente na fila");
				//chama método foreach e manda executar método print
				fila.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Chamar cliente");
				//if para saber se tem alguém na fila
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					//pode usar remove ou poll
					System.out.println("Cliente " + fila.poll() + ", compareça ao Guichê 1");
				}				
				break;
			default:
				System.out.println("Opção inválida!");
			}

		}

	}

}
