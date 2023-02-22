package poo;

public class Ex02_TestaFuncionario {

	public static void main(String[] args) {
		
		Ex02_Funcionario f1 = new Ex02_Funcionario("Lunna", "oi@lunna.com", "Rua Um, São Paulo", 12345678, 11111111111l);
		
		Ex02_Funcionario f2 = new Ex02_Funcionario("Katiana", "oi@katiana.com", "Rua Dois, São Paulo", 87654321, 22222222222l);
		
		f1.visualizar();

		System.out.println("\n");

		f2.visualizar();

	}

}
