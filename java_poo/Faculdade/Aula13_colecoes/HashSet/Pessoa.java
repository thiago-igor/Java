package java_poo.Faculdade.Aula13_colecoes.HashSet;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Pessoa implements Comparable<Pessoa>{
	private String nome, cpf;
	private Date nascimento;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public int compareTo(Pessoa p) {
		if (nascimento.before(p.nascimento))
			return -1;
		else if (nascimento.after(p.nascimento))
			return 1;
		else return 0;
	}
	// restante do codigo

	public String toString() {
		return nome+", "+sdf.format(nascimento);
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

