package java_poo.Faculdade.aula7_Polimofismo.ToString;

public class Valor {
	int v;
	public Valor(int v) { this.v = v; }
	public String toString() { // sobrescrita do toString 
		return ""+v;
	}
	public static void main(String[] args) {
		Integer i = new Integer(100);
		System.out.println(i); // 100
		Valor v = new Valor(100);
		System.out.println(v); // 100
	}
}

