package poo;

public class Ex06_Curso {
	
	private String instituicao;
	private String curso;
	private String tipo;
	private String modalidade;
	private float mensalidade;
	
	public Ex06_Curso(String instituicao, String curso, String tipo, String modalidade, float mensalidade) {
		this.instituicao = instituicao;
		this.curso = curso;
		this.tipo = tipo;
		this.modalidade = modalidade;
		this.mensalidade = mensalidade;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String gettipo() {
		return tipo;
	}

	public void settipo(String tipo) {
		this.tipo = tipo;
	}

	public String getmodalidade() {
		return modalidade;
	}

	public void setmodalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public void visualizar() {
		System.out.println("***************************************************");
		System.out.println("                  Dados do curso                   ");
		System.out.println("***************************************************");
		System.out.println("\nNome da instituição: " + this.instituicao);
		System.out.println("\nNome do curso: " + this.curso);
		System.out.println("\nTipo de curso (livre, graduação, pós-graduação etc) : " + this.tipo);
		System.out.println("\nModalidade do curso (presencial ou EAD): " + this.modalidade);
		System.out.println("\nPreço da mensalidade: " + this.mensalidade);
	}
	
}
