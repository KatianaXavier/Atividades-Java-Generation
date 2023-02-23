package poo;

public class Ex05_MeiaEntrada extends Ex05_Ingresso {
	
	private String tipoMeia;

	public Ex05_MeiaEntrada(String evento, String estabelecimento, String lugar, boolean meia, float preco,
			String tipoMeia) {
		super(evento, estabelecimento, lugar, meia, preco);
		this.tipoMeia = tipoMeia;
	}

	public String getTipoMeia() {
		return tipoMeia;
	}

	public void setTipoMeia(String tipoMeia) {
		this.tipoMeia = tipoMeia;
	}
	
	public void visualizar() {
		super.visualizar();

		System.out.println("\nQual o tipo de meia-entrada? (idoso, estudante, professor): " + this.tipoMeia);

	}
	
	

}
