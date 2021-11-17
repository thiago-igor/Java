package java_poo.Faculdade.aula3_Sobrecarga_E_Construtores.construtores.ex_aula;

public class Pessoa2 {

    private static int totalDePessoas = 0; // esse "static" faz ser um atributo de classe 

    Pessoa2(){
        Pessoa2.totalDePessoas = Pessoa2.totalDePessoas + 1;
    }

    public int getTotalDePessoas(){
        return Pessoa2.totalDePessoas;
    }
    
}
