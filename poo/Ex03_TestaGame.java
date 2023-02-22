package poo;

public class Ex03_TestaGame {

	public static void main(String[] args) {

		Ex03_Produto p1 = new Ex03_Produto("Playstation 5", "Sony", "preto", 500, 5000);
		
		Ex03_Produto p2 = new Ex03_Produto("Nintendo Switch", "Sony", "branco", 500, 3000);
		
		p1.visualizar();
		
		System.out.println("\n");
		
		p2.visualizar();

	}

}
