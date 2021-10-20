package java_poo.aula1_construtores;

public class Pessoa {
    // Atributos
    String nome;
    String cpf;

    //construtor
    Pessoa(String nome, String cpf){
        this.nome = nome; // this se remete ao nome do objeto em atributos.
        this.cpf = cpf;

    }
}
