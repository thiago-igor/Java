package java_poo.Faculdade.aula8_Polimofismo.Exemplos_Aula.Ex2;

public class Aluno extends Pessoa {

	public Aluno(String nome) {
		super(nome);
	}
	
	public void ola() {
		System.out.println("Ola, aluno!");
	}
	
	public void fazerMatricula() {
		System.out.println("Fazer matricula");
	}

}
