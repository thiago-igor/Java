package java_poo.aula4.composicao;
public class TesteComposicao {

	public static void main(String[] args) {
		// Criacao dos objetos
		Motor m = new Motor(4, 1.0, 80);
		Carro c = new Carro("Onix", "Chevrolet", m);
		// Acesso as informacoes atraves da composicao de objetos
		System.out.println("Potencia do "+c.getNome()+":");
		System.out.println(c.getMotor().getPotenciaEmCv()+"cv");
		// Resultado da impressao:
		// Potencia do Onix:
		// 80cv
	}
}
