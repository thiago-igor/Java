package java_poo.Faculdade.aula5.sobreescrita.questoes;

public class Pessoa {

    private String nome;
	private String endereco;
	private int idade;
	private String cpf;
	private String sexo;
	private boolean andar;
    
    
    public Pessoa(String nome, String endereco, int idade, String cpf, String sexo, boolean andar) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.andar = andar;
    }

    public void imprimirValores(){
        
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
