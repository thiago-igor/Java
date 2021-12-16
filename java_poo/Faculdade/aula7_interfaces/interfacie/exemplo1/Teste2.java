package java_poo.Faculdade.aula7_interfaces.interfacie.exemplo1;

public class Teste2 {
	
	public static void main(String[] args) {
		
		Carrao c = new Carrao();
		Teste1.abrirPortas(c); 		// Upcast: VeiculoComPortas
		Teste1.abrirPortaMalas(c);	// Upcast: VeiculoComPortaMalas
		Teste1.abrirTetoSolar(c);	// Upcast: VeiculoComTetoSolar
		Teste1.andar(c);			// Sem upcast
		
	}
}
