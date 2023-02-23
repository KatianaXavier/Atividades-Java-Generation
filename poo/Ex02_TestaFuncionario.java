package poo;

public class Ex02_TestaFuncionario {

	public static void main(String[] args) {

		Ex02_Funcionario f1 = new Ex02_Funcionario("Lunna", "oi@lunna.com", "Rua Um, São Paulo", 12345678,
				11111111111l);

		Ex02_Funcionario f2 = new Ex02_Funcionario("Katiana", "oi@katiana.com", "Rua Dois, São Paulo", 87654321,
				22222222222l);

		f1.visualizar();

		System.out.println("\n");

		f2.visualizar();

		System.out.println("\n");

		Ex02_Gerente g1 = new Ex02_Gerente("Lunna", "oi@lunna.com", "Rua Um, São Paulo", 12345678, 11111111111l, 2);

		Ex02_Gerente g2 = new Ex02_Gerente("Lunna", "oi@lunna.com", "Rua Um, São Paulo", 12345678, 11111111111l, 3);

		g1.visualizar();

		System.out.println("\n");

		g2.visualizar();

		System.out.println("\n");

		Ex02_Vendedor v1 = new Ex02_Vendedor("Lunna", "oi@lunna.com", "Rua Um, São Paulo", 12345678, 11111111111l, 3);

		Ex02_Vendedor v2 = new Ex02_Vendedor("Lunna", "oi@lunna.com", "Rua Um, São Paulo", 12345678, 11111111111l, 6);

		v1.visualizar();

		System.out.println("\n");

		v2.visualizar();

		System.out.println("\n");

	}

}
