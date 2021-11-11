package java_poo.CursoEmVideo.aula10_herenca;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    //METODO SOBRESCRITO: (TEM O MESMO FORMATO DA CLASSE MAE, POREM FUNCIONALIDADE DIFERENTE)
    public void imprimirStatus(){
        System.out.println("-----------");
        System.out.println("Aluno:");
        super.imprimirStatus();  // "SUPER" E USADO PARA EXECULTAR O METODO DA CLASSE MAE 
        System.out.println("Matricula: "+matricula);
        System.out.println("Curso: "+curso);  

    }

    public void cancelarMatricula(){
        System.out.println("Matricula sera cancelada");
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    


    
}
