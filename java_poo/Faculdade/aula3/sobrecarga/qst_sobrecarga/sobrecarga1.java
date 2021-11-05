package java_poo.Faculdade.aula3.sobrecarga.qst_sobrecarga;

public class sobrecarga1 {
    
    public static void imprimir(String nome, String cpf){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
    }

    public static void imprimir(int idade){
        System.out.println("Idade: "+idade);

    }

    // nesse exemplo temos a sobrecarga,ou seja, 2 metodos com o mesmo nome, mas com funcionalidades diferentes
    // o compilador decide o melhor para usar 


    public static void main(String[]args){
        int id = 21;
        String nom = "Thiago";
        String cpf = "715.153.593-12";

        imprimir(nom,cpf); // chamando os metodos, ou seja, funçoes
        imprimir(id);
    }

}
