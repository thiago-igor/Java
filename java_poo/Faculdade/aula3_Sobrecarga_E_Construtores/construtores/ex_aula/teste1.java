package java_poo.Faculdade.aula3_Sobrecarga_E_Construtores.construtores.ex_aula;

public class teste1 {

    public static void main(String[]args){

        // uso do construtor com parametros
        Pessoa p = new Pessoa("Joao", "000.000.000.00");
        System.out.println(p.nome); // inprime: joao
        System.out.println(p.cpf); // imprime 000.000.000.00
    }

}
