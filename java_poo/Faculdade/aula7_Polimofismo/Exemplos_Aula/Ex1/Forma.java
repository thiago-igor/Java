package java_poo.Faculdade.aula7_Polimofismo.Exemplos_Aula.Ex1;

class Forma {
	public void desenhar() {
		System.out.println("Forma");
	}
	public void aumentar(int n) {
		System.out.println("Forma.aumentar");
	}
}
class Linha extends Forma {
	// Foi feita sobrecarga e nao sobrescrita
	public void aumentar(double n) {
		System.out.println("Forma.aumentar");
	}
}
class Circulo extends Forma {
	public void desenhar() {
		System.out.println("Circulo");
	}
}
class Triangulo extends Forma {
	public void desenhar() {
		System.out.println("Triangulo");
	}
}
class Quadrado extends Forma {
	public void desenhar() {
		System.out.println("Quadrado");
	}
}
class Retangulo extends Forma {
	public void desenhar() {
		System.out.println("Retangulo");
	}
}
