package java_poo.Faculdade.aula7_interfaces.default_method;

public interface ExemploDefaultMethods {
	default void metodo() {
		System.out.println("Implementacao default");
	}
}

class Exemplo1 implements ExemploDefaultMethods {} // podemos sobrescrever ou nao o default

class Exemplo2 implements ExemploDefaultMethods {
	@Override
	public void metodo() {
		System.out.println("Implementacao modificada");
	}
}

