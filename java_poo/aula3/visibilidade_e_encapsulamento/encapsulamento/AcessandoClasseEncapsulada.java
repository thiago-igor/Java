package java_poo.aula3.visibilidade_e_encapsulamento.encapsulamento;

public class AcessandoClasseEncapsulada {
	
	public static void main(String[] args) {
		int x = 1;
		ClasseEncapsulada ce = new ClasseEncapsulada();
		// Modificando valor do atributo "b"
		ce.setA(x++);
		// Lendo valor do atributo "a"
		System.out.println(ce.getA());

		ClasseEncapsulada ce2 = new ClasseEncapsulada();
		// Modificando valor do atributo "b"
		ce2.setA(x++);
		// Lendo valor do atributo "a"
		System.out.println(+ce2.getA());
	}
}
