package java_poo.Faculdade.aula4_Heranca_E_Composicao.exercicios;

public class Ex1_pessoa {
    private String nome;
    private int idade;

     public Ex1_pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
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

}
