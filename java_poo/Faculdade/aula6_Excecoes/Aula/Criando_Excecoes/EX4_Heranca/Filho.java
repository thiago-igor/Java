package java_poo.Faculdade.aula6_Excecoes.Aula.Criando_Excecoes.EX4_Heranca;

public class Filho extends Pai {
	
	public void metodo1() {} // ok
	//public void metodo2() throws Exception{}  // erro!
	
	// pois estamos sobrescrevendo um exception q ja tinha sido definido na super-classe 
	
}

class Pai {
	
	public void metodo1() throws Exception{}
	public void metodo2() throws ClassNotFoundException{}
	
}


