package java_poo.Faculdade.Aula12_Jar_E_Javadoc.main;

import java_poo.Faculdade.Aula12_Jar_E_Javadoc.entidades.Pessoa.Pessoa;
import java_poo.Faculdade.Aula12_Jar_E_Javadoc.entidades.Advogado.Advogado;

public class main {
    public static void main(String[] args) {
		// Com o uso do import
		Advogado a = new Advogado("Joao","000-CE");
		Pessoa p = new Pessoa("Maria");
		System.out.println("Programa Main.java executado!");
	}
}

/*public class Main {
	
	public static void main(String[] args) {
		// Com o uso do import
		Advogado a = new Advogado("Joao","000-CE");
		// Com a indicacao direta do pacote
		pacotes.br.com.poo.entidades.Pessoa p = 
				new pacotes.br.com.poo.entidades.Pessoa("Maria");
	}
}*/

