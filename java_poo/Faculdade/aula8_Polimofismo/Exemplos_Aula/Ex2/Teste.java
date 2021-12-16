package java_poo.Faculdade.aula8_Polimofismo.Exemplos_Aula.Ex2;

public class Teste {
    public static void main(String[] args) {
		
		Professor p = new Professor("Igor");
		Pessoa p2 = new Professor("Igor");
		Aluno a1 = new Aluno("Joao");
		teste(p);
		teste(p2);
		teste(a1);
		
	}

    // Forma geral!!
    /*public static void teste(Pessoa p){
        p.ola();
    }*/
    
	// Forma mais geral possivel, pegando um object!!
	public static void teste(Object p) {
		if (p instanceof Pessoa) {
			Pessoa p2 = (Pessoa)p;
			p2.ola();
		}
			
	}
 
}
