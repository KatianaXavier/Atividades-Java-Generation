package aula_06;

import static aula_06_pacote2.Classe2.*;

public class TestaMetodos {

	public static void main(String[] args) {
		// chamando os métodos criados dentro da classe "TestaMetodos"
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		
		//chamando métodos que estão em outra classe
		Classe1.metodoPublico1();
		Classe1.metodoPadrao1();
		Classe1.metodoProtegido1();
		//Classe1.metodoPrivado1();
		
		metodoPublicoPacote1();
		/*metodoFriendlyPacote1();
		metodoProtegidoPacote1();
		metodoPrivadoPacote1();*/
		
		
		System.out.println(soma(2, 4));
	}

	// void: não vai retornar nada
	public static void metodoPublic() {
		System.out.println("Eu sou um método público!");
	}

	//declarando método como inteiro, que obrigatoriamente retorna um número
	// inteiro
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static void metodoPadrao() {
		System.out.println("Eu sou um método friendly/padrão/default!");
	}

	public static void metodoProtegido() {
			System.out.println("Eu sou um método protegido/protected!");
	}

	public static void metodoPrivado() {
				System.out.println("Eu sou um método privado/private!");
	}
			

}
