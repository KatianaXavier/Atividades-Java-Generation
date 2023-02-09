package lacos_condicionais;

import java.util.Scanner;

public class Ex04_If_Animais {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);

		String caract1, caract2, caract3;
				
		System.out.println("Digite a primeira característica: ");
		leia.skip("\\R?");
		caract1 = leia.nextLine();
				
		System.out.println("Digite a segunda característica: ");
		leia.skip("\\R?");
		caract2 = leia.nextLine();
				
		System.out.println("Digite a terceira característica: ");
		leia.skip("\\R?");
		caract3 = leia.nextLine();
				
		if (caract1.equals("vertebrado")) {
			if (caract2.equals("ave")) {
				if (caract3.equals("carnivoro")) 
					System.out.println("É uma águia!");
				else 
					System.out.println("É uma pomba!");
			} else {
				if (caract3.equals("onivoro")) 
					System.out.println("É um homem!");
				else 
					System.out.println("É uma vaca!");	
			}
		
		} else { 
			if (caract2.equals("inseto")) {
				if (caract3.equals("hematofago")) 
					System.out.println("É uma pulga!");
				else 
					System.out.println("É uma lagarta!");
			} else {
				if (caract3.equals("hematofago")) 
					System.out.println("É uma sanguessuga!");
				else 
					System.out.println("É uma minhoca!");	
			}
		}
		
		leia.close();
		}
}