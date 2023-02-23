package poo;

public class Ex03_Console extends Ex03_Produto {

	private boolean tecnologia4k;

	public Ex03_Console(String nome, String fabricante, String cor, int capacidade, float preco, boolean tecnologia4k) {
		super(nome, fabricante, cor, capacidade, preco);
		this.tecnologia4k = tecnologia4k;
	}

	public boolean isTecnologia4k() {
		return tecnologia4k;
	}

	public void setTecnologia4k(boolean tecnologia4k) {
		this.tecnologia4k = tecnologia4k;
	}

	public void visualizar() {
		super.visualizar();

		System.out.println("\nPossui tecnologia 4k? " + this.tecnologia4k);
	}
	
}
