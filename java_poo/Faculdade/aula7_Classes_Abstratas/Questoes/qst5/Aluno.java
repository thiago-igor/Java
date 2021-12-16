package java_poo.Faculdade.aula7_Classes_Abstratas.Questoes.qst5;

public class Aluno extends Pessoa {

    @Override
    public void aniversario() {
        System.out.println("feliz aniversario!!");
    }

    public void nota(int nota){
        System.out.println("sua nota eh: "+nota);
    }
    
}
