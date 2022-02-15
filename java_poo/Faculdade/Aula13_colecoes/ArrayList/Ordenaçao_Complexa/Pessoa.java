package java_poo.Faculdade.Aula13_colecoes.ArrayList.Ordenaçao_Complexa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa implements Comparable<Pessoa>{ //Comparable<Pessoa> : aqui estamos mostrando oque sera comparado para ocorrer a ordenação correta na classe "ListaPessoasComOrdenaçao"

	private String nome, cpf;
	private Date nascimento;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public int compareTo(Pessoa p) { //compareTo: mostrando o que comparar para assim ordenarmos o array
		if (nascimento.before(p.nascimento)) // retorna "-1" se a data for antes
			return -1;
		else if (nascimento.after(p.nascimento)) // retorna "-1" se a data for depois 
			return 1;
		else return 0; // retorna 0 se for igual
	}
	// restante do codigo

	public String toString() {
		return nome+", "+sdf.format(nascimento);// esse metodo "format" devolve uma String no padrão: "dd/MM/yyyy"
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

