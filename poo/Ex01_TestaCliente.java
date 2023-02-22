package poo;

public class Ex01_TestaCliente {

	public static void main(String[] args) {

		Ex01_Cliente c1 = new Ex01_Cliente(1, "Lunna", "São Paulo", "oi@lunna.com", 12345678);
			
		Ex01_Cliente c2 = new Ex01_Cliente(2, "Katiana", "São Paulo", "oi@katiana.com", 87654321);
		

		c1.visualizar();

		System.out.println("\n");

		c2.visualizar();

	}

}
