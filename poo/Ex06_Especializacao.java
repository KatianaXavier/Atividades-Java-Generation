package poo;

public class Ex06_Especializacao extends Ex06_Curso {
	
	private String area;

	public Ex06_Especializacao(String instituicao, String curso, String tipo, String modalidade, float mensalidade,
			String area) {
		super(instituicao, curso, tipo, modalidade, mensalidade);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void visualizar() {
		super.visualizar();

		System.out.println("\nÁrea de especialização: " + this.area);

	}

}
