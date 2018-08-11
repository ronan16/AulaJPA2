package aplicacao;

import dominio.Usuario;

public class Programa {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(1, "Ronan", "123");
		Usuario u2 = new Usuario(2, "Anacleto", "123");
		Usuario u3 = new Usuario(3, "Lopes", "123");
		
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		
		
		System.out.println("NOVA LINHA");
		
	}

}
