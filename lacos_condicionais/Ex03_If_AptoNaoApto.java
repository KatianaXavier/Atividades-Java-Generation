package lacos_condicionais;

import java.util.Scanner;

public class Ex03_If_AptoNaoApto {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;		
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? Digite 'true' para sim, e 'false' para não");
		primeiraDoacao = leia.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está apta(o/e) para doar sangue!");
		} else if ((idade >= 60 && idade <= 69 ) && (primeiraDoacao == false)) {
			System.out.println(nome + " está apta (o/e) para doar sangue!"); 
		} else {
			System.out.println(nome + " não está apta (o/e) para doar sangue!"); 
		}
			
		leia.close();
	}
}
