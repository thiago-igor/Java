package java_poo.Faculdade.aula3_Sobrecarga_E_Construtores.visibilidade_e_encapsulamento.questoes_visibilidade;

import java.util.Date;

public class Funcionario {

    private String nome;
    private Date dataAdmissao;
    private double salario;
    private int identificador;

    public int getIdentificador(){
        return this.identificador;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getDataAdmissao(){
        return this.dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
