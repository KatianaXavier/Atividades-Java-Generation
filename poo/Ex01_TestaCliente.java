package poo;

public class Ex01_TestaCliente {

	public static void main(String[] args) {

		Ex01_Cliente c1 = new Ex01_Cliente(1, "Lunna", "São Paulo", "oi@lunna.com", 12345678);

		Ex01_Cliente c2 = new Ex01_Cliente(2, "Katiana", "São Paulo", "oi@katiana.com", 87654321);

		c1.visualizar();

		System.out.println("\n");

		c2.visualizar();

		System.out.println("\n");

		Ex01_PessoaFisica pf1 = new Ex01_PessoaFisica(1, "Lunna", "São Paulo", "oi@lunna.com", 12345678, 15);

		Ex01_PessoaFisica pf2 = new Ex01_PessoaFisica(1, "Lunna", "São Paulo", "oi@lunna.com", 12345678, 20);

		pf1.visualizar();

		System.out.println("\n");

		pf2.visualizar();

		System.out.println("\n");

		Ex01_PessoaJuridica pj1 = new Ex01_PessoaJuridica(1, "Lunna", "São Paulo", "oi@lunna.com", 12345678, "Maria Construções LTDA");

		Ex01_PessoaJuridica pj2 = new Ex01_PessoaJuridica(1, "Lunna", "São Paulo", "oi@lunna.com", 12345678, "Locações de Filmes Nostalgia LTDA");
		
		pj1.visualizar();

		System.out.println("\n");

		pj2.visualizar();

		System.out.println("\n");

	}

}
