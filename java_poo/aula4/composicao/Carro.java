package java_poo.aula4.composicao;

	public class Carro {
	
		private String nome; // a Composiçao usa classes dentro de uma classe. 
		private String fabricante; // vemos a classe String e Motor 
		private Motor motor;
	
		public Carro(String nome, String fabricante, Motor motor) {
			this.nome = nome;
			this.fabricante = fabricante;
			this.motor = motor;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public Motor getMotor() {
			return motor;
		}

		public void setMotor(Motor motor) {
			this.motor = motor;
		}
	
}
