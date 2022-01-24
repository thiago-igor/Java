package java_poo.Codigos_Uteis.For_Simplificado;

public class For_simples {
    public static void main(String[] args) {
		Forma[] fs = new Forma[] {
			new Circulo(), new Quadrado(),
			new Triangulo(), new Forma()
		};
		metodoPolimorfico(fs);
	}
	public static void metodoPolimorfico(Forma[] fs) { // usado quando queremos percorrer todo o vetor!
		for (Forma f: fs) {
			f.desenhar();
		}
	}
}
