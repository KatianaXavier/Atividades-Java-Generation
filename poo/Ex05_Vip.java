package poo;

public class Ex05_Vip extends Ex05_Ingresso {
	
	private boolean convidade;

	public Ex05_Vip(String evento, String estabelecimento, String lugar, boolean meia, float preco, boolean convidade) {
		super(evento, estabelecimento, lugar, meia, preco);
		this.convidade = convidade;
	}

	public boolean isConvidade() {
		return convidade;
	}

	public void setConvidade(boolean convidade) {
		this.convidade = convidade;
	}

	public void visualizar() {
		super.visualizar();

		System.out.println("\nConvidade dos anfitriões? " + this.convidade);

	}
	

}
