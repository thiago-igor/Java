package java_poo.aula3.visibilidade_e_encapsulamento.questoes_propostas;

public class Funcionario_2 {
    public static void main(String[]args){
        int x = 1; 

        Funcionario id = new Funcionario();

        id.setIdentificador(x++);
        System.out.println("funcionario "+ id.getIdentificador());

        Funcionario id2 = new Funcionario();

        id2.setIdentificador(x++);
        System.out.println("funcionario "+ id2.getIdentificador());

        Funcionario id3 = new Funcionario();

        id3.setIdentificador(x++);
        System.out.println("funcionario "+ id3.getIdentificador());

    }

    
}
