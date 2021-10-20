package java_poo.aula1_construtores;

public class MultiplosConstrutores {
    
    String nome; String cpf; int idade;

    MultiplosConstrutores(String nome, String cpf){
        this.nome = nome; // this se remete ao nome do objeto em atributos.
        this.cpf = cpf;
    }

    MultiplosConstrutores(String nome, String cpf, int idade){
        this(nome,cpf); // reutiliza o nome e o cpf e esse comando tem que vir sempre na primeira linha do construtor
        this.idade = idade;
    }

}
