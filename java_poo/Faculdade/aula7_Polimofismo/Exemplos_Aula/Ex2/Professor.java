package java_poo.Faculdade.aula7_Polimofismo.Exemplos_Aula.Ex2;

public class Professor extends Pessoa {

	public Professor(String nome) {
		super(nome);
	}
	
	public void corrigirProvas() {
		System.out.println("Corrigir provas");
	}
	
	public void ola() {
		System.out.println("Ola, professor!");
	}

}
