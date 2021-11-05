package java_poo.Faculdade.aula5.sobreescrita;

public class SubclasseMetodos extends SuperclasseMetodos {

	public void imprimir() {
		super.imprimir(); // nao pode ser private (na superclasse)
		System.out.println("Subclasse: imprimir");
	}
}

class SuperclasseMetodos {
	
	public void imprimir() {
		System.out.println("Superclasse: imprimir");
	}
}

/*public class SubclasseMetodos extends SuperclasseMetodos {

	public void imprimir() {
		super.imprimir(); // n�o pode ser private (na superclasse)
		System.out.println("Subclasse: imprimir");
	}
}

class SuperclasseMetodos {
	
	public void imprimir() {
		System.out.println("Superclasse: imprimir");
	}
}*/

/*class SuperclasseMetodos {
	
	public void imprimir() {
		System.out.println("Superclasse: imprimir");
	}
	
}*/
