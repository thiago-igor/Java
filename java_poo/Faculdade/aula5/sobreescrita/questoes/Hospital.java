package java_poo.Faculdade.aula5.sobreescrita.questoes;

public class Hospital {
    private String nome;
    private String endereco;
    
    
    

    public Hospital(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // AQUI ESTA OCORRENDO A SOBRESCRITA DO METODO 
    public void imprimirValores(){
        System.out.println("Hospital "+nome);
        System.out.println("Endereco: "+endereco);
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    
}
