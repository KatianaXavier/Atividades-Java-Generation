package atividades_java;

import java.util.Scanner;

public class Ex01_Fluxograma {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();

		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salário é:  R$" + novoSalario);

		leia.close();
	}
}
