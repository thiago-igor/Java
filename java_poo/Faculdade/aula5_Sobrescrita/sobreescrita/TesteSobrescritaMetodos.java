package java_poo.Faculdade.aula5_Sobrescrita.sobreescrita;

public class TesteSobrescritaMetodos {
	
	public static void main(String[] args) {
		
		SuperclasseMetodos sup = new SuperclasseMetodos();
		sup.imprimir(); // Imprime: Superclasse: imprimir
		
		SubclasseMetodos sub = new SubclasseMetodos();
		sub.imprimir(); // Imprime: Subclasse: imprimir
		
	}

}
