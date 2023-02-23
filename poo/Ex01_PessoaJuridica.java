package poo;

public class Ex01_PessoaJuridica extends Ex01_Cliente {
	
	private String nomeEmpresa;

	public Ex01_PessoaJuridica(long id, String nome, String localizacao, String email, long telefone,
			String nomeEmpresa) {
		super(id, nome, localizacao, email, telefone);
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("\nNome da empresa: " + this.nomeEmpresa);
	}

}
