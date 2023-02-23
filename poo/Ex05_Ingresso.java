package poo;

public class Ex05_Ingresso {

	private String evento;
	private String estabelecimento;
	private String lugar;
	private boolean meia;
	private float preco;

	public Ex05_Ingresso(String evento, String estabelecimento, String lugar, boolean meia, float preco) {
		this.evento = evento;
		this.estabelecimento = estabelecimento;
		this.lugar = lugar;
		this.meia = meia;
		this.preco = preco;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public boolean isMeia() {
		return meia;
	}

	public void setMeia(boolean meia) {
		this.meia = meia;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("************************");
		System.out.println("    Dados do ingresso   ");
		System.out.println("************************");
		System.out.println("\nNome do evento: " + this.evento);
		System.out.println("\nNome do estabelecimento: " + this.estabelecimento);
		System.out.println("\nLugar reservado: " + this.lugar);
		System.out.println("\nIngresso meia? " + this.meia);
		System.out.println("\nPreço: " + this.preco);
	}

}
