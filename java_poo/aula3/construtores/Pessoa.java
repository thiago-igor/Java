package java_poo.aula3.construtores;

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
