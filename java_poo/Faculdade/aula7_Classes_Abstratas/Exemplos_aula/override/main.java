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
    
    // nos usamos o @override a penas como uma forma de falar que a baixo temos um metodo sobrescrito

