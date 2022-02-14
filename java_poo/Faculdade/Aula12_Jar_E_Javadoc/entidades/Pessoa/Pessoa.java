package java_poo.Faculdade.Aula12_Jar_E_Javadoc.entidades.Pessoa; // definicao do pacote
/**
* Classe responsavel por definir a entidade Pessoa.
*/

public class Pessoa {
	
	private String nome;
	
	/**
	* Metodo que retorna o nome da pessoa.
	* @return	nome
	*/
	public String getNome() {return this.nome;}
	
	// restante da classe
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	// restante da implementacao da classe
}

