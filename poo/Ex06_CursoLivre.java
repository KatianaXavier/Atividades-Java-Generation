package poo;

public class Ex06_CursoLivre extends Ex06_Curso {

	private int duracao;

	public Ex06_CursoLivre(String instituicao, String curso, String tipo, String modalidade, float mensalidade,
			int duracao) {
		super(instituicao, curso, tipo, modalidade, mensalidade);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void visualizar() {
		super.visualizar();

		System.out.println("\nDuração do curso (em meses): " + this.duracao);

	}

}
