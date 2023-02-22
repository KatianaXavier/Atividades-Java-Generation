package poo;

public class Ex06_TestaCurso {

	public static void main(String[] args) {

		Ex06_Curso c1 = new Ex06_Curso("Estácio", "Marketing", 1, 4, 300);
		
		Ex06_Curso c2 = new Ex06_Curso("Anhembi Morumbi", "História", 4, 8, 200);
				
		c1.visualizar();
		
		System.out.println("\n");
		
		c2.visualizar();
		
	}

}
