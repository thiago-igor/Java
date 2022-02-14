package java_poo.Faculdade.Aula12_Jar_E_Javadoc.entidades.Advogado;

import java_poo.Faculdade.Aula12_Jar_E_Javadoc.entidades.Pessoa.Pessoa;

public class Advogado extends Pessoa {
	
	private String oab;
	
	public Advogado(String nome, String oab) {
		super(nome);
		this.oab = oab;
	}
	
	// restante da implementa��o da classe	
}
