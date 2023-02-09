package lacos_condicionais;

import java.util.Scanner;

public class Ex01_Switch_ValorTotal {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

		int codigo, quantidade;
		float valorTotal;
		
		System.out.println("Código do produto: ");
		codigo = leia.nextInt();
		
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch (codigo) {
			case 1: 
				System.out.println("Produto: Cachorro-Quente");
				valorTotal = quantidade * 10;
				System.out.printf( "Valor total: %.2f", valorTotal);
				break;
			case 2:
				System.out.println("Produto: X-Salada");
				valorTotal = quantidade * 15;
				System.out.printf( "Valor total: R$ %.2f", valorTotal);
				break;
			case 3:
				System.out.println("Produto: X-Bancon");
				valorTotal = quantidade * 18;
				System.out.printf( "Valor total: R$ %.2f", valorTotal);;
				break;
			case 4:
				System.out.println("Produto: Bauru");
				valorTotal = quantidade * 12;
				System.out.printf( "Valor total: R$ %.2f", valorTotal);
				break;
			case 5:
				System.out.println("Produto: Refrigerante");
				valorTotal = quantidade * 8;
				System.out.printf( "Valor total: R$ %.2f", valorTotal);
				break;
			case 6:
				System.out.println("Produto: Suco de laranja");
				valorTotal = quantidade * 13;
				System.out.printf( "Valor total: R$ %.2f", valorTotal);;
				break;
			default:
				System.out.println("Produto inválido!");
		}
		leia.close();
	}
}
