package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.exemplo1;

public class Lampada {
	
	// 'i' -> incandescente
	// 'f' -> fluorescente
	// 'l' -> led
	private char tipo;
	public Lampada(char tipo) throws Exception{
		if(tipo=='i' || tipo=='f' || tipo=='l'){
			this.tipo = tipo;
		}
		else
			throw new Exception("Tipo invalido. Use 'i', 'f' ou 'l' ");
	}
	public char getTipo(){
		return tipo;
	}
}

/*public class Lampada {
	
	// 'i' -> incandescente
	// 'f' -> fluorescente
	// 'l' -> led
	private char tipo;
	public Lampada(char tipo) throws IllegalArgumentException {
		if (tipo=='i' || tipo=='f' || tipo=='l')
			this.tipo = tipo;
		else
			throw new IllegalArgumentException(
					"Tipo inv�lido. Use 'i', 'f' ou 'l'.");
	}
	public char getTipo() { return tipo; }
}*/
