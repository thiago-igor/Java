package java_poo.Faculdade.aula3_Sobrecarga_E_Construtores.construtores.ex_aula;

public class teste2 {
	
	public static void main(String[] args) {
		Pessoa2 p1 = new Pessoa2();
		System.out.println("Total: "+p1.getTotalDePessoas());
		// imprime --> Total: 1  
		Pessoa2 p2 = new Pessoa2();
		System.out.println("Total: "+p2.getTotalDePessoas());
		// imprime --> Total: 2	
	}
}