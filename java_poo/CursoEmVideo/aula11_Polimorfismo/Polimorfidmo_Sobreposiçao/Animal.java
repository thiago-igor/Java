package java_poo.CursoEmVideo.aula11_Polimorfismo.Polimorfidmo_Sobreposiçao;

public abstract class Animal { // Como e uma classe abstrata, so as filhas podem desenvolver
    // Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;
    protected String nome;

    //Metodos de animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public void status(String nome, int peso,int idade, int membros){
        setNome(nome); // obs: nao era necessario o uso do set() e get() nessa classe. 
        setPeso(peso);
        setIdade(idade);
        setMembros(membros);
        System.out.println("nome = " +getNome() + "\npeso = "+getPeso()+ "\nIdade = "+ getIdade() + "\nMembros = " + getMembros()); 
    }


    // Gets e Sets
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
