package poo;

public class Ex02_Vendedor extends Ex02_Funcionario {
	
	private float comissao;

	public Ex02_Vendedor(String nome, String email, String endereco, int telefone, long cpf, float comissao) {
		super(nome, email, endereco, telefone, cpf);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public void visualizar() {
		super.visualizar();

		System.out.println("\nPorcentagem da comissão: " + this.comissao + "%");

	}

}
