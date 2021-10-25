package java_poo.aula4.heranca;

public class TesteHeranca {
	
	public static void main(String[] args) {
		Livro l = new Livro("Java: como programar", 309.99, 
				"Deitel & Deitel", 968);
		System.out.println(l);
		// Imprime (sobrescrito em Livro):
		// Livro: Java: como programar, 309.99, Deitel & Deitel,
		// 968 paginas
	}
}

/*public class TesteHeranca {
	
	public static void main(String[] args) {
		Livro l = new Livro("Java: como programar", 309.99, 
				"Deitel & Deitel", 968);
		System.out.println("e barato? "+l.ehBarato()); // true
		System.out.println("e pequeno? "+l.ehPequeno()); // false
	}

}*/
