package poo;

public class Ex02_Funcionario {
	
	private String nome;
	private String email;
	private String endereco;
	private int telefone;
	private long cpf;
	
	public Ex02_Funcionario(String nome, String email, String endereco, int telefone, long cpf) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("****************************");
		System.out.println("    Dados do funcionário    ");
		System.out.println("****************************");
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nE-mail: " + this.email);
		System.out.println("\nEndereço: " + this.endereco);
		System.out.println("\nTelefone: " + this.telefone);
		System.out.println("\nCPF: " + this.cpf);
	}	

}
