package java_poo.Faculdade.aula4.exercicios;

public class Ex2_produto {
    private String nome;
    private int preco;

    public static void Endereco(String rua){
        System.out.println("Rua: indefinida");
    }

    public Ex2_produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

   
}
