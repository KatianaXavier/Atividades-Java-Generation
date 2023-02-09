package lacos_condicionais;

import java.util.Scanner;

public class Ex04_Switch_OperacoesBancarias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		float saldo = 1000, saque, deposito;
		
		System.out.println("Digite o código da operação: ");
		codigo = leia.nextInt();
		
		switch (codigo) {
			case 1: 
				System.out.println("Operação - Saldo");
				System.out.println("Saldo: R$ " + saldo);
				break;
			case 2:
				System.out.println("Operação - Saque");
				System.out.println("Valor do saque: ");
				saque = leia.nextFloat();
					if (saque > saldo) {
						System.out.println("Saldo insuficiente!");
					} else {
						System.out.printf("Novo saldo: R$ %.2f", saldo - saque);
					}
				break;
			case 3:
				System.out.println("Operação - Depósito");
				System.out.println("Valor do depósito: ");
				deposito = leia.nextFloat();
				System.out.printf("Novo saldo: R$ %.2f", saldo + deposito);
				break;
			default:
				System.out.println("Operação inválida!");
		}
		leia.close();
	}
}