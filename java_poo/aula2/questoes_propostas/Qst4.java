package java_poo.aula2.questoes_propostas;

import java.util.Scanner;

public class Qst4 {

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sequencia Fibonacci");
        System.out.print("digite ate que termo da sequencia deseja: ");
        int x = teclado.nextInt();

        int n1 = 0; // primeiro termo 
        int n2 = 1; // segundo termo
        int res = 1; // res inicia com 1 para contar essa primeira interaçao n1 + n2 que ocorre fora do laço
        int c;

        System.out.printf("%d + %d + ",n1,n2); // primeira operaçao

        for(int i=0;i<x-2;i++){ // temos (x-2) pois os 2 primeiros termos sao tericamente somados fora do laço 
            res += n1+n2; // guarda a resposta final
            c = n2; // c guarda o valor de n2
            n2 = n1 + n2; // n2 faz papel do prox recebendo  ele e o n1
            n1 = c; // n1 faz papel de anterior, recebemdo c que gradou valor de n2
            System.out.printf("%d + ",n2); // formato da soma 
        }
        System.out.println(" = "+res); // resposta final
    
        

    }
    
}
