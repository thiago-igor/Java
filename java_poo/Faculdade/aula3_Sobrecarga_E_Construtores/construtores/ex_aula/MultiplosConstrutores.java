package java_poo.Faculdade.aula3_Sobrecarga_E_Construtores.construtores.ex_aula;

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
