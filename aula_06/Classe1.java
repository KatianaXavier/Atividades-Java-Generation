package aula_06;

public class Classe1 {
	
	public static void metodoPublico1(){
        System.out.println("Método Público - Classe 01");
    }

    static void metodoPadrao1(){
        System.out.println("Método Friendly/Padrao - Classe 01");
    }

    protected static void metodoProtegido1(){
        System.out.println("Método Protegido - Classe 01");
    }

	private static void metodoPrivado1(){
        System.out.println("Método Privado - Classe 01");
        //só funciona dentro da própria classe em que foi criado
    }


}
