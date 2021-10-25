package java_poo.aula4.heranca;

public class Livro extends Produto { // o "extends" faz o papel de erança, ou seja, a sub classe livro ta tendo a herança dos atributos da superClasse "produto"

	private String autor;
	private int qtdPaginas;

	public Livro(String nome, double preco,
			String autor, int qtdPaginas) {
		super(nome, preco); // chamando o construtor da superClasse
		this.autor = autor;
		this.qtdPaginas = qtdPaginas;
	}
	
	public boolean ehPequeno() {
		return (qtdPaginas < 200);
	}

	public boolean ehBarato(){  // redefinindo o metodo da superclasse na subclasse
		return (getPreco()<100);
	}
	
	public void imprimir() {
		super.imprimir(); // Imprime: nome, preco
		System.out.println(", "+autor+", "+qtdPaginas);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	
	public String toString() {
		return "Livro: "+getNome()+", "+getPreco()+", "+
				getAutor()+", "+getQtdPaginas()+" paginas";
	}
	
}
