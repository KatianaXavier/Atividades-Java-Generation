package poo;

public class Ex06_Curso {
	
	private String instituicao;
	private String curso;
	private int semestreAtual;
	private int semestres;
	private float mensalidade;
	
	public Ex06_Curso(String instituicao, String curso, int semestreAtual, int semestres, float mensalidade) {
		this.instituicao = instituicao;
		this.curso = curso;
		this.semestreAtual = semestreAtual;
		this.semestres = semestres;
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

	public int getSemestreAtual() {
		return semestreAtual;
	}

	public void setSemestreAtual(int semestreAtual) {
		this.semestreAtual = semestreAtual;
	}

	public int getSemestres() {
		return semestres;
	}

	public void setSemestres(int semestres) {
		this.semestres = semestres;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public void visualizar() {
		System.out.println("************************");
		System.out.println("  Dados do curso  ");
		System.out.println("************************");
		System.out.println("\nNome da instituição: " + this.instituicao);
		System.out.println("\nNome do curso: " + this.curso);
		System.out.println("\nSemestre atual: " + this.semestreAtual + "º");
		System.out.println("\nSemestres totais do curso: " + this.semestres);
		System.out.println("\nPreço da mensalidade: " + this.mensalidade);
	}
	
}
