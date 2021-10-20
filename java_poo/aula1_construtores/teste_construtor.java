package java_poo.aula1_construtores;

public class teste_construtor {

    public static void main(String[]args){

        // uso do construtor com parametros
        Pessoa p = new Pessoa("Joao", "000.000.000.00");
        System.out.println(p.nome); // inprime: joao
        System.out.println(p.cpf); // imprime 000.000.000.00
    }

}
