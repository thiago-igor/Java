package java_poo.Faculdade.aula4.exercicios;

class Pessoa{
    private String nome;

    public Pessoa(){
        this.nome = "joao";
        System.out.println("pessoa()");
    }
}
class PessoaFisica{
    private int cpf;

    public PessoaFisica(){
        super();
        System.out.println("pessoaFisica() com CPF: "+cpf);
        show();
    }
    public void show(){
        System.out.println("show PessoaFisica");
    }
}

public class ClientePF extends PessoaFisica{
    private int codCliente;

    public ClientePF(int codCliente){
        super();
        System.out.println("ClientePF("+codCliente+")");
        this.codCliente = codCliente;
        super.show();
    }


    public void show(){
        System.out.println("Show ClientePF");

    }

    public static void main(String[] args){
        new ClientePF(10);
    }

}

