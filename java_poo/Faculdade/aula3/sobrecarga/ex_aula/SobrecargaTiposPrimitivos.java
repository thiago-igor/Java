package java_poo.Faculdade.aula3.sobrecarga.ex_aula;

public class SobrecargaTiposPrimitivos {
	
	public static void imprime(int i) {
		System.out.println("Inteiro: "+i);
	}
	
	public static void imprime(byte b) {
		System.out.println("Byte: "+b);
	}
	
	public static void main(String[] args) {
		imprime(2); // imprime -> Inteiro: 2
		byte b = 2;
		imprime(b); // imprime -> Byte: 2
	}
}
