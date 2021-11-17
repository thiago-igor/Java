package java_poo.Faculdade.aula1_Escrever_Teclado;

import java.util.Scanner;

public class Escrever {
    public static void main(String[]args){

        // ler dado do teclado:
        Scanner sc = new Scanner(System.in);

        //imprimir na saida padrao:
        System.out.println("Qual seu nome?");

        // aguarda usuario fornrcer

        String nome = sc.nextLine();
        
        //imprimir na tela o texto fornecido
        System.out.println("seu nome e "+nome);

        //fechar a conexao com entrada padrao
        sc.close();
    }
}
