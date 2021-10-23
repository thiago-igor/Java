package java_poo.aula3.visibilidade_e_encapsulamento.classe;

class Base {
	int x;
	public void imprime() {
		System.out.println();
	}
}

public class Execucao {
	public static void main(String[] args) {
		Base b = new Base();
		// Acesso a atributo atrav�s da inst�ncia da classe
		b.x = 10;
		// Acesso a m�todo atrav�s da inst�ncia da classe
		b.imprime();
	}
}

