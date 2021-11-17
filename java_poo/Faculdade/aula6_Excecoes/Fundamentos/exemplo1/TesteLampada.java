package java_poo.Faculdade.aula6_Excecoes.Fundamentos.exemplo1;

public class TesteLampada {
	
	public static void main(String[] args) {

		try {
			Lampada l1 = new Lampada('l');
			System.out.println("Lampada l1: "+l1.getTipo());
			
			Lampada l2 = new Lampada('x');
			System.out.println("Lampada l2: "+l2.getTipo());
		} catch (TipoLampadaException e) {
			System.out.println("Use apenas 'i', 'f' ou 'l'.");
		}

	}

}
