package java_poo.Faculdade.aula5_Sobrescrita.sobreescrita.questoes;

public class Medico extends Pessoa {
    
    private String crm;
    private int salario;
    private String especializacao; 
    private boolean plantao;

    public Medico(String nome, String endereco, int idade, String cpf, String sexo, boolean andar, String crm, int salario, String especializacao, boolean plantao){
        super(nome, endereco, idade, cpf, sexo, andar ); // "SUPER" CHAMA OS ATRIBUTOS DO CONSTRUTOR DA CLASSE MAE "PESSOA"
        this.crm = crm;     
        this.salario = salario;
        this.especializacao = especializacao;   
        this.plantao = plantao;
    }
    // AQUI ESTA OCORRENDO A SOBRESCRITA DO METODO 
    public void imprimirValores(){
        System.out.println("---------------");
        System.out.println("Medico:");
        super.imprimirValores();  // COM O "SUPER" ESTAMOS CHAMANDO O METODO DA CLASSE MAE, QUE NESSE CASO SERIA "PESSOA"
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
