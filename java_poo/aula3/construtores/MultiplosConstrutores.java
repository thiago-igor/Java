package java_poo.aula3.construtores;

public class MultiplosConstrutores {
    
    String nome; String cpf; int idade;

    MultiplosConstrutores(String nome, String cpf){
        this.nome = nome; // this se remete ao nome do objeto em atributos.
        this.cpf = cpf;
    }

    MultiplosConstrutores(String nome, String cpf, int idade){
        this(nome,cpf); // reutiliza os parametros do construtor de cima.
        //OBS: essa diretiva tem que sempre ser a primeira do contrutor 
        this.idade = idade;
    }
    //construtores sobrecarregados

}
