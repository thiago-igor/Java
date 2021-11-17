package java_poo.Faculdade.aula5_Sobrescrita.sobreescrita;

public class SubclasseAtributos extends SuperclasseAtributos {
    public String x; // sobrescrita de atributo
	
	public void imprimir() {
		this.x = "String qualquer"; // ou apenas: x
		super.x = 3.14;
		System.out.println(x); // Imprime: String qualquer
		System.out.println(super.x); // Imprime: 3.14
	}

}

class SuperclasseAtributos {
	public double x;
}

    

