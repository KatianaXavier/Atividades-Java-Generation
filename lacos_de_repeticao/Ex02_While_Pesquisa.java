package lacos_de_repeticao;

import java.util.Scanner;

public class Ex02_While_Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, genero, categoria, backend = 0, frontend = 0, mobile = 0, full = 0;
		String continua = "s";
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o gênero: ");
			genero = leia.nextInt();
			
			System.out.println("Digite a categoria: ");
			categoria = leia.nextInt();
			
			if (categoria == 1)
				backend ++;
			
			if (categoria == 2 && genero == 2)
				frontend ++;
			
			if (categoria == 3 && genero == 1 && idade > 40)
				mobile ++;
			
			if (categoria == 4 && genero == 2 && idade < 30)
				full ++;
			
			System.out.println("Deseja continuar? (S/N)");
			leia.skip("\\R?");
			continua = leia.nextLine();
		
		}
		
		leia.close();
		
		System.out.println("\nTotal de pessoas desenvolvedoras backend: " + backend);
		System.out.println("\nTotal de mulheres desenvolvedoras backend: " + frontend);
		System.out.println("\nTotal de homens desenvolvedores mobile maiores de 40 anos: " + mobile);
		System.out.println("\nTotal de mulheres desenvolvedoras fullstack menores de 30 anos: " + full);
	
	}
}