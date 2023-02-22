package poo;

public class Ex05_TestaIngresso {

	public static void main(String[] args) {
		
		Ex05_Ingresso i1 = new Ex05_Ingresso("Avatar 2", "Cinemark", "L13", true, 15);
		
		Ex05_Ingresso i2 = new Ex05_Ingresso("Quebra Nozes", "Teatro Bradesco", "K28", false, 50);
				
		i1.visualizar();
		
		System.out.println("\n");
		
		i2.visualizar();

	}

}
