package java_poo.Faculdade.aula7_Classes_Abstratas.Exemplos_aula.Formas_Geometricas;

public abstract class Forma {
	public abstract void desenhar();
	public abstract void aumentar(int valor);
}

abstract class Poligono extends Forma {
	private int lados;
	public Poligono(int lados) {
		this.lados = lados;
	}
	public int getLados() { return lados; }
	public abstract void pintar(int cor);
}

