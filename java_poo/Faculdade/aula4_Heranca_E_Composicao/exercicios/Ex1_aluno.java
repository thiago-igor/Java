package java_poo.Faculdade.aula4_Heranca_E_Composicao.exercicios;

public class Ex1_aluno extends Ex1_pessoa {
    private String matricula;
    private int semestre;


    public Ex1_aluno(String nome, int idade, String matricula, int semestre){
        super(nome,idade);
        this.matricula = matricula;
        this.semestre = semestre;        
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public int getSemestre() {
        return semestre;
    }


    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String toString(){
        return "Aluno:"+getNome()+ "\nIdade:"+getIdade()+"\nMatricula: "+getMatricula()+"\nsemestre: "+getSemestre();
    }
}
