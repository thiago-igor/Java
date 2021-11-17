package java_poo.Faculdade.aula5_Sobrescrita.passagemDeParametro.porValor;

public class PassagemPorValor {
	
	public static void main(String[] args) {
		int numero = 5; // definiçao de valor fora do metodo
		int resultado = quadrado(numero);
		System.out.println("Numero: "+numero); // Imprime: 5
		System.out.println("Resultado: "+resultado); // Imprime: 4
	}
	
	public static int quadrado(int numero) {
		numero = 2; // alteraçao de valor dentro do metodo
		return numero*numero;
	}

	// podemos observar que ele altera a variavel do metodo, mas nao a global, pois ah uma copia da global para o metodo, se tornando assim, duas variaveis diferentes.
}
