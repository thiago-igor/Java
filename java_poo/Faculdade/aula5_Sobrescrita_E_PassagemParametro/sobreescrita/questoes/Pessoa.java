package java_poo.Faculdade.aula5_Sobrescrita_E_PassagemParametro.sobreescrita.questoes;

public class Pessoa {
    // ATRIBUTOS CLASSE MAE
    private String nome;
	private String endereco;
	private int idade;
	private String cpf;
	private String sexo;
	private boolean andar;
    
    // CONSTRUTOR CLASSE MAE
    public Pessoa(String nome, String endereco, int idade, String cpf, String sexo, boolean andar) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.andar = andar;
    }

    // ESCRITA DO METODO NA CLASSE MAE 
    public void imprimirValores(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereco: "+endereco);
        System.out.println("Idade: "+idade);
        System.out.println("CPF: "+cpf);
        System.out.println("sexo: "+sexo);
        System.out.println("andar: "+andar);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereco;
    }
    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public boolean isAndar() {
        return andar;
    }
    public void setAndar(boolean andar) {
        this.andar = andar;
    }

    
}
