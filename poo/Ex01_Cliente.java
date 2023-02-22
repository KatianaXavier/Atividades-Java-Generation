package poo;

public class Ex01_Cliente {
	
	private long id;
	String nome;
	String localizacao;
	String email;
	long telefone;
	
	public Ex01_Cliente(long id, String nome, String localizacao, String email, long telefone) {
		this.id = id;
		this.nome = nome;
		this.localizacao = localizacao;
		this.email = email;
		this.telefone = telefone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {
		System.out.println("************************");
		System.out.println("    Dados do cliente    ");
		System.out.println("************************");
		System.out.println("\nID: " + this.id);
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nLocalização: " + this.localizacao);
		System.out.println("\nE-mail: " + this.email);
		System.out.println("\nTelefone: " + this.telefone);
	}

}
