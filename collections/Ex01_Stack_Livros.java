package collections;

import java.util.Scanner;
import java.util.Stack;

public class Ex01_Stack_Livros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		int opcao;
		String livro;

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("1 - Adicionar livro à pilha");
			System.out.println("2 - Listar todos os livros da pilha");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("Digite a opção desejada:");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("O programa foi encerrado!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("*** Adicionar livro à pilha ***");
				System.out.println("\nDigite o nome do livro:");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.add(livro);
				System.out.println("Livro '" + livro + "' adicionado com sucesso!");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha de livros está vazia!");
				} else {
					System.out.println("*** Lista de todos os livros da pilha: ***\n");
					pilha.forEach(System.out::println);
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha de livros está vazia!");
				} else {
					pilha.pop();
					System.out.println("O último livro da pilha foi retirado!\n");
					System.out.println("*** Pilha de livros atualizada: ***\n");
					pilha.forEach(System.out::println);
				}
				break;
			default:
				System.out.println("Opção inválida!");
			}

		}

	}

}
