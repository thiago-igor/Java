package java_poo.Faculdade.aula7_Classes_Abstratas.Exemplos_aula.override;

abstract class Pai {
	public void metodoConcreto() {};
	public abstract void metodoAbstrato();
}
public class main extends Pai {
	@Override
	public void metodoAbstrato() {}
	// nenhum aviso/erro quando o @Override nao e utilizado
	public void metodoConcreto2() {}
}

	// Avisa se o nome do metodo a ser sobrescrito esta escrito de forma correta como na superclasse
    
    // nos usamos o @override  como uma forma de falar que a baixo temos um metodo sobrescrito como forma de facilitar a leitura do codigo 

