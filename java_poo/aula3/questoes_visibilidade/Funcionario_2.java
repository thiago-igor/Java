package java_poo.aula3.questoes_visibilidade;

public class Funcionario_2 {

    public static void tirarFerias(String ferias){  // metodos, ou seja, funçoes 
        System.out.println("Voce ira tirar ferias!!");
    }

    public static void tirarFerias(int dias){
        String ferias = "null";
        tirarFerias(ferias); // funçao chamando outra funçao
        System.out.printf("Tempo determinado de: %d Dias \n",dias);
    }
    // nesse exemplo temos a sobrecarga,ou seja, 2 metodos com o mesmo nome, mas com funcionalidades diferentes
    // o compilador decide o melhor para usar 

    public static void main(String[]args){
        int x = 1; 
        String ferias = null;
        int dias = 30;

        Funcionario id = new Funcionario(); // instanciando um objeto de uma classe

        id.setIdentificador(x++); // uso da funçao "set()" para alterar um atributo privado de uma classe
        System.out.println("funcionario "+ id.getIdentificador()); //uso da funçao get para ler um atributo privado de uma classe

        Funcionario id2 = new Funcionario(); // instanciando um novo objeto de uma classe

        id2.setIdentificador(x++);
        System.out.println("funcionario "+ id2.getIdentificador());

        Funcionario id3 = new Funcionario();

        id3.setIdentificador(x++);
        System.out.println("funcionario "+ id3.getIdentificador());

        //Salario:

        System.out.println("---------------");

        id.setSalario(1100); // usa o objeto ja criado com outros atributos como o "salario" e o "set()" usado para modificar, nesse caso para 1100
        if(id.getSalario()>=1100){
            System.out.printf("funcionario %d ganha %.2f \n",id.getIdentificador(),id.getSalario());
        }
        else{
            System.out.println("Salario abusivo para o Funcionario "+id.getIdentificador());
        }

        id2.setSalario(1000);
        if(id2.getSalario()>=1100){
            System.out.printf("funcionario %d ganha %.2f \n",id2.getIdentificador(),id2.getSalario());
        }
        else{
            System.out.printf("Funcionario %d Salario incompativel \n",id2.getIdentificador());
        }

        id3.setSalario(5000);
        if(id3.getSalario()>=1100){
            System.out.printf("funcionario %d ganha %.2f \n",id3.getIdentificador(),id3.getSalario());
        }
        else{
            System.out.println("Salario abusivo para o Funcionario "+id3.getIdentificador());
        }

        System.out.println("------------");
        tirarFerias(ferias); // uso dos metodos,ou seja, funçoes escritas no começo do codigo para assim execultar a funçao
        tirarFerias(dias); // funçoes com o mesmo nome sao "sobrecargas" porem sempre com funçoes diferentes, e o compilador ver qual a melhor para ser usada
    }   
}
