package java_poo.Faculdade.aula6_Excecoes.Aula.Criando_Excecoes.EX1;

public class TesteExcecaoImpar {
	public static void main(String[] args) {
		try {
			imprimeNumeroPar(2); // ok
			imprimeNumeroPar(3); // lança ExcecaoImpar
		} catch (ExcecaoImpar e) {
			System.out.println(e);
		}
	}
	public static void imprimeNumeroPar(int numero) 
			throws ExcecaoImpar {
		if (numero%2==0)
			System.out.println("Numero par: "+numero);
		else
			throw new ExcecaoImpar(numero);
	}
}
