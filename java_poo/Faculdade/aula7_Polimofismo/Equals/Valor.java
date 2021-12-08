package java_poo.Faculdade.aula7_Polimofismo.Equals;

public class Valor {
	int v;
	public Valor(int v) { this.v = v; }
	public boolean equals(Object o) { // usado para sobrescrever o metodo equals
		if (o instanceof Valor) {
			Valor val = (Valor)o;
			return val.v==v;
		} else return false;
	}
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2); // false
		System.out.println(i1.equals(i2)); // true
		Valor v1 = new Valor(100);
		Valor v2 = new Valor(100);
		System.out.println(v1==v2); // false
		System.out.println(v1.equals(v2)); // true
	}
}
