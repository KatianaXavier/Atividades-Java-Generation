package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex01_Set_MostraElementos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero = 0;

		Set<Integer> numeros = new HashSet<Integer>();
		
		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite o " + (contador + 1) + "º número");
			numero = leia.nextInt();
			numeros.add(numero);
		}

		System.out.println("Listando dados do Set:");
		numeros.forEach(System.out::println);
		
		System.out.println("Listando dados do Set com Iterator:");
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		leia.close();

	}

}
