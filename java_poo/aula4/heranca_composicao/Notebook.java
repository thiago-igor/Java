package java_poo.aula4.heranca_composicao;

class Computador {
	public Computador() {
		System.out.println("Construtor Computador() chamado!");
		ligar();
	}
	public void ligar() {}
}
public class Notebook extends Computador {
	private int codigo;
	public Notebook() { // como nao temos o parametro "super" na primeira linha, sera execultado primeiro os termos da superclasse
		System.out.println("Construtor Notebook() chamado!");
		codigo = 12345;
	}
	public void ligar() {
		System.out.println("Codigo: "+codigo); // metodo foi sobreescrito em notebook
	}
}

/*public class Notebook extends Computador {
	public Notebook() {
		System.out.println("Construtor Notebook() chamado!");
	}
}

class Computador {
	public Computador() {
		System.out.println("Construtor Computador() chamado!");
	}
}*/