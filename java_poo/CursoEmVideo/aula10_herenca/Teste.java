package java_poo.CursoEmVideo.aula10_herenca;

public class Teste {
    
    public static void main(String[] args){

        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        a1.setNome("thiago");
        a1.setIdade(20);
        a1.setSexo("M");

        p1.setNome("Andre");
        p1.setIdade(44);
        p1.setSexo("M");
        p1.setEspecialidade("professor de matematica");
        p1.setSalario(12500);
        p1.receberAumento(500);

        System.out.println(a1.toString());
        System.out.println(p1.toString());


    }

}
