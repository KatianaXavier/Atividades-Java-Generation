package poo;

public class Ex05_TestaIngresso {

	public static void main(String[] args) {
		
		Ex05_Ingresso i1 = new Ex05_Ingresso("Avatar 2", "Cinemark", "L13", true, 15);
		
		Ex05_Ingresso i2 = new Ex05_Ingresso("Quebra Nozes", "Teatro Bradesco", "K28", false, 50);
				
		i1.visualizar();
		
		System.out.println("\n");
		
		i2.visualizar();
		
		System.out.println("\n");
		
		Ex05_Vip v1 = new Ex05_Vip("Wicked", "Broadway", "A5", false, 150, true);
		
		Ex05_Vip v2 = new Ex05_Vip("Quebra Nozes", "Teatro Bradesco", "B6", false, 50, true);
		
		v1.visualizar();
		
		System.out.println("\n");
		
		v2.visualizar();
		
		System.out.println("\n");
		
		Ex05_MeiaEntrada m1 = new Ex05_MeiaEntrada("Capitã Marvel", "Cinemark", "C15", true, 10, "Idoso");
		
		Ex05_MeiaEntrada m2 = new Ex05_MeiaEntrada("Beyoncé", "Allianz Parque", "K28", true, 100, "Professor");
		
		m1.visualizar();
		
		System.out.println("\n");
		
		m2.visualizar();
		
		System.out.println("\n");

	}

}
