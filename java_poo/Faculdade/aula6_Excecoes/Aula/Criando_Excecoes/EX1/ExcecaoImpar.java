package java_poo.Faculdade.aula6_Excecoes.Aula.Criando_Excecoes.EX1;

public class ExcecaoImpar extends Exception {
	private int valor;
	public ExcecaoImpar() {}
	public ExcecaoImpar(String msg) {
		super(msg);
	}
	public ExcecaoImpar(int valor) {
		this.valor = valor;
	}
	public String toString() {
		return "O numero "+valor+" e impar!";
	}
}
