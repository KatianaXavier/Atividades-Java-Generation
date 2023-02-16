package calculadora_com_metodo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Calculos calc = new Calculos();
		
		int opcao;
		double numero1, numero2;
		
		//menu
		
		while(true) {
			
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			
			System.out.println("Digite o número da operação desejada:");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				leia.close();
				//finaliza o programa
				System.out.println("Calculadora encerrada!");
				System.exit(0);
			}

			System.out.println("Digite o 1º número");
			numero1 = leia.nextDouble();
			
			System.out.println("Digite o 2º número");
			numero2 = leia.nextDouble();
			
			//case lambda, outra forma de escrever o switch case. para mais de uma instrução dentro do case, abra e feche o escopo depois da seta.
			switch(opcao) {
			case 1 -> System.out.println("Resultado da Soma: " + calc.soma(numero1, numero2));
			case 2 -> System.out.println("Resultado da Subtração: " + calc.subtracao(numero1, numero2));
			case 3 -> System.out.println("Resultado da Multiplicação: " + calc.multiplicacao(numero1, numero2));
			case 4 -> System.out.println("Resultado da Divisão: " + calc.divisao(numero1, numero2));
			default -> System.out.println("Opção inválida");
			}
		
		}

	}

}
