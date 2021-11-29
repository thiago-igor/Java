package java_poo.Faculdade.aula1_Escrever_Teclado;

import java.util.Scanner;

public class Escrever {
    public static void main(String[]args){

        // ler dado do teclado:
        Scanner sc = new Scanner(System.in);

        //imprimir na saida padrao:
        System.out.println("Qual seu nome?");

        // aguarda usuario fornrcer

        String nome = sc.nextLine(); // (nexLine): ler uma linha, ou seja, qualquer coisa lida transforma em uma string.   (nextInt) : ler um inteiro.    (nextDouble): ler um Double
        
        //imprimir na tela o texto fornecido
        System.out.println("seu nome e "+nome);

        //fechar a conexao com entrada padrao
        sc.close();
    }
}
