package java_poo.Faculdade.aula6_Excecoes.Fundamentos;

public class TesteException {
	
	public static void main(String[] args) {
		try {
			// lançamento de excecao:
			throw new Exception("Exceçaoo teste");
		} catch(Exception e) {
			// codigo de tratamento da exceçao:
			System.out.println("Capturada: "+e);
			e.printStackTrace();
		}
	}
}
