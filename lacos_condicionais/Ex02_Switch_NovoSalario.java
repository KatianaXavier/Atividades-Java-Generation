package lacos_condicionais;

import java.util.Scanner;

public class Ex02_Switch_NovoSalario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, cargo = "";
		int codigo;
		float salario;
		
		System.out.println("Nome do colaborador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Código do cargo: ");
		codigo = leia.nextInt();
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch (codigo) {
			case 1: 
				cargo = "Gerente";
				salario = salario * (float)1.1;
				imprimeResultado(nome, cargo, salario);
				break;
			case 2:
				cargo = "Vendedor";
				salario = salario * (float)1.07;
				imprimeResultado(nome, cargo, salario);
				break;
			case 3:
				cargo = "Supervisor";
				salario = salario * (float)1.09;
				imprimeResultado(nome, cargo, salario);
				break;
			case 4:
				cargo = "Motorista";
				salario = salario * (float)1.06;
				imprimeResultado(nome, cargo, salario);
				break;
			case 5:
				cargo = "Estoquista";
				salario = salario * (float)1.05;
				imprimeResultado(nome, cargo, salario);
				break;
			case 6:
				cargo = "Técnico de TI";
				salario = salario * (float)1.08;
				imprimeResultado(nome, cargo, salario);
				break;
			default:
				System.out.println("Código inválido!");
		}
	
		leia.close();
	}
	
	public static void imprimeResultado(String nome, String cargo, float salario) {
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf( "Novo salário: R$ %.2f", salario);
	}
}