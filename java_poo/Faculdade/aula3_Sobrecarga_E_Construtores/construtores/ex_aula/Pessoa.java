package java_poo.Faculdade.aula3_Sobrecarga_E_Construtores.construtores.ex_aula;

public class Pessoa {
    // Atributos
    String nome;
    String cpf;

    //construtor
    // possue o mesmo nome da classe
    Pessoa(String nome, String cpf){
        this.nome = nome; // this se remete ao nome do objeto em atributos.
        this.cpf = cpf;

    }
}
