package java_poo.Faculdade.aula5_Sobrescrita_E_PassagemParametro.passagemDeParametro.porReferencia;

public class TestePassagemParametrosJava {
	
	public static void main(String[] args) {
		// declaraçao de variaveis
		int x = 5;
		Pessoa p = new Pessoa("JoAo");
		// utilizar variaveis nos metodos criados
		alterar(x);
		alterar(p);
		// imprimir valores das variaveis utilizadas
		System.out.println(x);
		System.out.println(p.nome);
	}
	
	public static void alterar(int a) { // aqui temos a copia da variavel postada no metodo 
		a = 2;
	}
	
	public static void alterar(Pessoa p1) { // aqui temos a copia da referencia, pois estamos nos referindo a um objeto, logo quando alteramos p1, infuencia diretamente no p, pois foi passada a referencia de p (obs: bem parecido com ponteiros na linguagem C)
		p1.nome = "Jose";
	}

}
