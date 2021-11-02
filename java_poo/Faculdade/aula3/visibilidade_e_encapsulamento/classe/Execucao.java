package java_poo.Faculdade.aula3.visibilidade_e_encapsulamento.classe;

class Base {
	int x;
	public void imprime() {
		System.out.println();
	}
}

public class Execucao {
	public static void main(String[] args) {
		Base b = new Base();
		// Acesso a atributo atraves da instancia da classe
		b.x = 10;
		// Acesso a metodo atraves da instancia da classe
		b.imprime();
	}
}

