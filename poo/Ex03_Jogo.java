package poo;

public class Ex03_Jogo extends Ex03_Produto {
	
	private String nomeJogo;

	public Ex03_Jogo(String nome, String fabricante, String cor, int capacidade, float preco, String nomeJogo) {
		super(nome, fabricante, cor, capacidade, preco);
		this.nomeJogo = nomeJogo;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	
	public void visualizar() {
		super.visualizar();

		System.out.println("\nNome do jogo: " + this.nomeJogo);

	}

}
