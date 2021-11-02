package java_poo.Faculdade.aula3.sobrecarga;

public class SobrecargaPorOrdemDeArgumentos {
	
	public void imprime(String nome, int num) {
		System.out.println("Numero: "+num);
		System.out.println("Nome: " +nome);
	}
	
	public void imprime(int num, String nome) {
		System.out.println("Numero: "+num);
		System.out.println("Nome: " +nome);
	}

}

//obs: para funcionar a sobrecarga, e preciso variar o tipo como e mostrado a cima "string" e "int" 
//se for int a int b, estara reeado pois so temos o tipo int