package java_poo.CursoEmVideo.aula10_herenca;

public abstract class  Pessoa {

    // ATRIBUTOS CLASSE PRINCIPAL:
    private String nome;
    private int idade;
    private String sexo;

    
    //CONSTRUTOR CLASSE PRINCIPAL:
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    // METODOS:

    public void imprimirStatus(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }

    public void fazerAniversario(){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }

   

    

    
    
}
