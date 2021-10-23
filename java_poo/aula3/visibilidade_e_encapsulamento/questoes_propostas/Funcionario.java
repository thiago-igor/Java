package java_poo.aula3.visibilidade_e_encapsulamento.questoes_propostas;

public class Funcionario {
    private String nome;
    private int dataAdmissao;
    private double salario;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDataAdmissao(){
        return this.dataAdmissao;
    }
    public void setDataAdmissao(int dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
