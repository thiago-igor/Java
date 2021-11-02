package java_poo.Faculdade.aula4.heranca;

public class Produto {
	
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) { //Criaçao da superClasse
		this.nome = nome;
		this.preco = preco;
	}
	
	public boolean ehBarato() {
		return (preco < 1000);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimir() {
		System.out.print(nome+", "+preco);
	}
	
}
