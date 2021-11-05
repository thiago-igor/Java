package java_poo.Faculdade.aula5.sobreescrita.questoes;

public class Paciente extends Pessoa {

    private String doenca;
    private String medicacao;
    private boolean dor;
    private boolean alta;
    
    public Paciente(String nome, String endereco, int idade, String cpf, String sexo, boolean andar, String doenca, String medicacao, boolean alta){
        super(nome, endereco, idade, cpf, sexo, andar); // "SUPER" CHAMA OS ATRIBUTOS DO CONSTRUTOR DA CLASSE MAE "PESSOA"
        this.doenca = doenca; 
        this.medicacao = medicacao;
        this.alta = alta;
    }

    // AQUI ESTA OCORRENDO A SOBRESCRITA DO METODO 
    public void imprimirValores(){
        System.out.println("---------------");
        System.out.println("Paciente:");
        super.imprimirValores();  // COM O "SUPER" ESTAMOS CHAMANDO O METODO DA CLASSE MAE, QUE NESSE CASO SERIA "PESSOA"
        System.out.println("Doenca: "+doenca);
        System.out.println("Medicacao: "+medicacao);
        System.out.println("Pode sentir dor: "+dor);
        System.out.println("Pode ter alta: "+alta);
        System.out.println("---------------");
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public boolean isDor() {
        return dor;
    }

    public void setDor(boolean dor) {
        this.dor = dor;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }


    

}
