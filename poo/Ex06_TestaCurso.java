package poo;

public class Ex06_TestaCurso {

	public static void main(String[] args) {

		Ex06_Curso c1 = new Ex06_Curso("Estácio", "Marketing", "Graduação", "EAD", 400);
		
		Ex06_Curso c2 = new Ex06_Curso("Anhembi Morumbi", "História", "Graduação", "Presencial", 200);
				
		c1.visualizar();
		
		System.out.println("\n");
		
		c2.visualizar();
		
		System.out.println("\n");
		
		Ex06_CursoLivre cl1 = new Ex06_CursoLivre("Generation Brasil", "Java FullStack", "Livre", "EAD", 200, 3);
		
		Ex06_CursoLivre cl2 = new Ex06_CursoLivre("Alura", "Formação Front-End", "Livre", "EAD", 100, 1);
		
		cl1.visualizar();
		
		System.out.println("\n");
		
		cl2.visualizar();
		
		Ex06_Especializacao e1 = new Ex06_Especializacao("Descomplica", "Tributação Municipal", "Doutorado", "EAD", 200, "Direito");
		
		Ex06_Especializacao e2 = new Ex06_Especializacao("FIAP", "Scrum Master", "Pós-Graduação", "EAD", 500, "Scrum");
		
		System.out.println("\n");
		
		e1.visualizar();
		
		System.out.println("\n");
		
		e2.visualizar();
		
	}

}
