package java_poo.Faculdade.aula7_Polimofismo.Atividade;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto[] p = new Produto[4];

        System.out.println("[1] => Cadastrar produto");
        System.out.println("[2] => Listar produtos");
        System.out.println("[3] => Cadastrar livro");
        System.out.println("[4] => Listar livros");
        System.out.println("[5] => Imprimir tudo");
        System.out.println("[6] => Sair");

        int numero;
       do{
            System.out.println("Digite o numero da operacao que deseja de [1] ate [6]: ");
            numero = sc.nextInt();
        } while( numero<1 || numero >6);
        

        System.out.println("numero : "+ numero);


    }
}
