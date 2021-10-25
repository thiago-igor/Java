package java_poo.aula3.construtores;

public class Pessoa2 {

    private static int totalDePessoas = 0; // esse "static" faz ser um atributo de classe 

    Pessoa2(){
        Pessoa2.totalDePessoas = Pessoa2.totalDePessoas + 1;
    }

    public int getTotalDePessoas(){
        return Pessoa2.totalDePessoas;
    }
    
}
