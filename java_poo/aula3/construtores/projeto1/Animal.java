package java_poo.aula3.construtores.projeto1;

import java.util.Date;

public class Animal {
    //ATRIBUTOS
    private String especie;
    private char sexo; // "m" Para maco e "f" para femia
    private String nome;
    private Date dataDeNascimento;

    public Animal(){ // CONSTRUTOR 1

    }

    public Animal(String especie, char sexo){  // CONSTRUTOR 2
        this.especie = especie;
        this.sexo = sexo;
    }

    public Animal(String especie, char sexo, String nome,Date dataDeNascimento){ // CONSTRUTOR 3
        this(especie, sexo); // esta utilizando os parametos que ja recebeu a cima
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;

    }
    
    public String gatNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getDataDeNascimento(){
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

}
