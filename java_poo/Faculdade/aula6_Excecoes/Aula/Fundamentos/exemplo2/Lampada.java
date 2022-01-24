package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.exemplo2;

public class Lampada {
	
	// 'i' -> incandescente
	// 'f' -> fluorescente
	// 'l' -> led
	private char tipo;
	public Lampada(char tipo) throws IllegalArgumentException {
		if (tipo=='i' || tipo=='f' || tipo=='l')
			this.tipo = tipo;
		else
			throw new IllegalArgumentException(
					"Tipo invilido. Use 'i', 'f' ou 'l'.");
	}
	public char getTipo() { return tipo; }
}

