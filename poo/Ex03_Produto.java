package poo;

public class Ex03_Produto {
	
	private String nome;
	private String fabricante;
	private String cor;
	private int capacidade;
	private float preco;
	
	public Ex03_Produto(String nome, String fabricante, String cor, int capacidade, float preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.cor = cor;
		this.capacidade = capacidade;
		this.preco = preco;
	}

	public String getProduto() {
		return nome;
	}

	public void setProduto(String produto) {
		this.nome = produto;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		System.out.println("************************");
		System.out.println("  Dados do produto  ");
		System.out.println("************************");
		System.out.println("\nNome do produto: " + this.nome);
		System.out.println("\nFabricante: " + this.fabricante);
		System.out.println("\nCor: " + this.cor);
		System.out.println("\nCapacidade em GB: " + this.capacidade);
		System.out.println("\nPreço: " + this.preco);
	}

}
