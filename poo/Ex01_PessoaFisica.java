package poo;

public class Ex01_PessoaFisica extends Ex01_Cliente {
	
	private int idade;

	public Ex01_PessoaFisica(long id, String nome, String localizacao, String email, long telefone, int idade) {
		super(id, nome, localizacao, email, telefone);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("\nIdade do cliente PF: " + this.idade);
		
	}

}
