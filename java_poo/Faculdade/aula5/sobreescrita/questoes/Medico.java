package java_poo.Faculdade.aula5.sobreescrita.questoes;

public class Medico extends Pessoa {
    
    private String crm;
    private int salario;
    private String especializacao; 
    private boolean plantao;

    public Medico(String nome, String endereco, int idade, String cpf, String sexo, boolean andar, String crm, int salario, String especializacao, boolean plantao){
        super(nome, endereco, idade, cpf, sexo, andar );
        this.crm = crm;     
        this.salario = salario;
        this.especializacao = especializacao;   
        this.plantao = plantao;
    }

    public void imprimirValores(){
        System.out.println("---------------");
        System.out.println("Medico:");
        super.imprimirValores();
        System.out.println("CRM: "+crm);
        System.out.println("Salario: "+salario);
        System.out.println("Especializacao: " +especializacao);
        System.out.println("Horario de plantao? "+plantao);
    }



    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }



    public int getSalario() {
        return salario;
    }



    public void setSalario(int salario) {
        this.salario = salario;
    }



    public String getEspecializacao() {
        return especializacao;
    }



    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }



    public boolean isPlantao() {
        return plantao;
    }



    public void setPlantao(boolean plantao) {
        this.plantao = plantao;
    }

    

    
}
