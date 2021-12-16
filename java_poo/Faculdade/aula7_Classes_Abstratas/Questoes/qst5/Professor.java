package java_poo.Faculdade.aula7_Classes_Abstratas.Questoes.qst5;

public class Professor extends Pessoa {

    @Override
    public void aniversario() {
        System.out.println("parabens pelo seu aniversario professor!!!");
    }

    public void diciplina_Aula(String diciplina){
        System.out.println("diciplina que o professor da aula eh: "+ diciplina);
    }
    
}
