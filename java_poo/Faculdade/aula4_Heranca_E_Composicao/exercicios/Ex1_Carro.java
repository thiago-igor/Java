package java_poo.Faculdade.aula4_Heranca_E_Composicao.exercicios;

public class Ex1_Carro {
    private String nome;
    private int ano;
    private Ex1_Locadora locadora; 

    public Ex1_Carro(String nome, int ano, Ex1_Locadora locadora){
        this.nome = nome;
        this.ano = ano;
        this.locadora = locadora;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno(){
        return ano;
    }

    public void setCnpj(int ano){
        this.ano = ano;
    }

    public Ex1_Locadora getEx1_Locadora() {
        return locadora;
    }

    public void setEx1_Locadora(Ex1_Locadora locadora) {
        this.locadora = locadora;
    }


}
