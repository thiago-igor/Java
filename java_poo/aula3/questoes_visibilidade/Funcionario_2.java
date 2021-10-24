package java_poo.aula3.questoes_visibilidade;

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

        //Salario:

        System.out.println("---------------");

        id.setSalario(1100);
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
    }   
}
