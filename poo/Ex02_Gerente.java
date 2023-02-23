package poo;

public class Ex02_Gerente extends Ex02_Funcionario {
	
	private int equipes;

	public Ex02_Gerente(String nome, String email, String endereco, int telefone, long cpf, int equipes) {
		super(nome, email, endereco, telefone, cpf);
		this.equipes = equipes;
	}

	public int getEquipes() {
		return equipes;
	}

	public void setEquipes(int equipes) {
		this.equipes = equipes;
	}
	
	public void visualizar() {
		super.visualizar();

		System.out.println("\nQuantidade de equipes gerenciadas: " + this.equipes);

	}

}
