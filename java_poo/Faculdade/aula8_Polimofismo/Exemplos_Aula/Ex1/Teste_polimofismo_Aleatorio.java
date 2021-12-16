package java_poo.Faculdade.aula8_Polimofismo.Exemplos_Aula.Ex1;

public class Teste_polimofismo_Aleatorio {
    public static void main(String[] args) {
		Forma[] fs = new Forma[4];
		for (int i=0; i<4; i++) {
			int sorteio = (int)(Math.random()*4); // gerando mumero aleatorio de 0 a 3 
			switch (sorteio) {
				case 0: fs[i] = new Forma(); break;
				case 1: fs[i] = new Circulo(); break;
				case 2: fs[i] = new Quadrado(); break;
				case 3: fs[i] = new Triangulo(); break;
			}
		}
		metodoPolimorfico(fs);
	}
	public static void metodoPolimorfico(Forma[] fs) {
		for (Forma f: fs) {
			f.desenhar();
		}
	}
}
