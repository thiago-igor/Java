package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.Inicio;

public class Throw_ {
	
	public static void main (String[] args){
		try{
			// lançamento de excecao!
			throw new Exception("Excecao teste");
		}catch(Exception e){
			// codigo de tratamento da exceçao
			System.out.println("Capturada" +e);
			e.printStackTrace();
		}
	}
}
