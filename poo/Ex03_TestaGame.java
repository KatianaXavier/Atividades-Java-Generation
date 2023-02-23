package poo;

public class Ex03_TestaGame {

	public static void main(String[] args) {

		Ex03_Produto p1 = new Ex03_Produto("Playstation 5", "Sony", "preto", 500, 5000);
		
		Ex03_Produto p2 = new Ex03_Produto("Nintendo Switch", "Sony", "azul", 500, 3000);
		
		p1.visualizar();
		
		System.out.println("\n");
		
		p2.visualizar();
		
		System.out.println("\n");
		
		Ex03_Jogo j1 = new Ex03_Jogo("X- Box", "Sony", "branco", 500, 3000, "The Sims");
		
		Ex03_Jogo j2 = new Ex03_Jogo("Atari", "Sony", "cinza", 256, 3000, "Crash Bandcoot");
		
		j1.visualizar();
		
		System.out.println("\n");
		
		j2.visualizar();
		
		System.out.println("\n");
		
		Ex03_Console c1 = new Ex03_Console("Nintendo Switch", "Sony", "branco", 500, 3000, false);
		
		Ex03_Console c2 = new Ex03_Console("Nintendo Switch", "Sony", "vermelho", 500, 3000, true);
		
		c1.visualizar();
		
		System.out.println("\n");
		
		c2.visualizar();
		
		System.out.println("\n");

	}

}
