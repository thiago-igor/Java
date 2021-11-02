package java_poo.Faculdade.aula4.composicao;
public class Motor {
	
	private int qtdCilindros;
	private double cilindradaEmLitros;
	private int potenciaEmCv;
	
	public Motor(int qtdCilindros, double cilindradaEmLitros,
			int potenciaEmCv) {
		this.qtdCilindros = qtdCilindros;
		this.cilindradaEmLitros = cilindradaEmLitros;
		this.potenciaEmCv = potenciaEmCv;
	}

	public int getQtdCilindros() {
		return qtdCilindros;
	}

	public void setQtdCilindros(int qtdCilindros) {
		this.qtdCilindros = qtdCilindros;
	}

	public double getCilindradaEmLitros() {
		return cilindradaEmLitros;
	}

	public void setCilindradaEmLitros(double cilindradaEmLitros) {
		this.cilindradaEmLitros = cilindradaEmLitros;
	}

	public int getPotenciaEmCv() {
		return potenciaEmCv;
	}

	public void setPotenciaEmCv(int potenciaEmCv) {
		this.potenciaEmCv = potenciaEmCv;
	}
	
}
