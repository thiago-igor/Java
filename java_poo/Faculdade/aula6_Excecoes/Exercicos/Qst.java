package java_poo.Faculdade.aula6_Excecoes.Exercicos;

import java.util.Scanner;

public class Qst {

    public static void main (String[] args){

        // ler dado do teclado:
        Scanner sc = new Scanner(System.in);

        //imprimir na saida padrao:
        System.out.println("\tNOME COMPLETO:");

        //lendo dado:
        String nome = sc.nextLine();

        System.out.println("\tNUMERO DE TELEFONE:");

        System.out.println("Digite seu DD");
        // lendo o dd
        String dd = sc.nextLine();

        System.out.println("Digite seu Numero:");
        //lendo numero:
        String numero = sc.nextLine();

        
        //imprimir na tela o texto fornecido
        System.out.println("\nSeu Nome eh: "+nome);

        System.out.println("Seu Numero eh: "+dd +"-"+numero);

        //fechar a conexao com entrada padrao
        sc.close();


    }
    
}
