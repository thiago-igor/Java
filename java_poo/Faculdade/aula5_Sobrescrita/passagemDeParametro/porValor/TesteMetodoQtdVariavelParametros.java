package java_poo.Faculdade.aula5_Sobrescrita.passagemDeParametro.porValor;

public class TesteMetodoQtdVariavelParametros {
	
	public static void main(String[] args) {
		imprimir("Um", "Dois", "Tres", "Quatro"); // 4 parametros
		imprimir("Um", "Dois", "Tres"); // 3 parametros
		imprimir("Um"); // 1 parametro
		imprimir(); // 0 parametro
	}
	
	public static void imprimir(String...itens) {
		for (String item: itens)
			System.out.println(item);
	}

}
