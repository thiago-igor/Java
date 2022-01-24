package java_poo.Faculdade.aula7_Classes_Abstratas.Exemplos_aula.Formas_Geometricas;

public class Retangulo extends Poligono {

	// como a classe "Retangulo" é concreta, tem que execultar todos os metodos acima na hierarquia de herança

	public Retangulo(int lados) {
		super(4);
	}
	public void pintar(int cor) {
		System.out.println("Retangulo.pintar("+cor+")");
	}
	public void desenhar() {
		System.out.println("Retangulo.desenhar");
	}
	public void aumentar(int valor) {
		System.out.println("Retangulo.aumentar("+valor+")");
	}
}

