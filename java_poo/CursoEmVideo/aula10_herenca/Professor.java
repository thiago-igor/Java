package java_poo.CursoEmVideo.aula10_herenca;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //METODO SOBRESCRITO: (TEM O MESMO FORMATO DA CLASSE MAE, POREM FUNCIONALIDADE DIFERENTE)
    public void imprimirStatus(){
        System.out.println("-----------");
        System.out.println("Professor:");
        super.imprimirStatus();  // "SUPER" E USADO PARA EXECULTAR O METODO DA CLASSE MAE 
        System.out.println("Especialidade: "+especialidade);
        System.out.println("Salario: "+salario);
    }  

    public void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
}
