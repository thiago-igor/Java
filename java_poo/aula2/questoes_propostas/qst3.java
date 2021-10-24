package java_poo.aula2.questoes_propostas;

import java.util.Scanner;

public class qst3 {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        int x,y;
        System.out.print("Digite um numero:");
        x = teclado.nextInt();

        y = (x%2==0)?x/2:x*3+1;

        System.out.printf("numero x = %d e y = %d",x,y);
    }
    
}
