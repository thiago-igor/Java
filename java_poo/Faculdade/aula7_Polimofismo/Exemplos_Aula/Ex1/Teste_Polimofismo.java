package java_poo.Faculdade.aula7_Polimofismo.Exemplos_Aula.Ex1;

public class Teste_Polimofismo {
    public static void main(String[] args) {
		Forma[] fs = new Forma[] {
			new Circulo(), new Quadrado(),
			new Triangulo(), new Forma()
		};
		metodoPolimorfico(fs);
	}
	public static void metodoPolimorfico(Forma[] fs) {
		for (Forma f: fs) {
			f.desenhar();
		}
	}
}
