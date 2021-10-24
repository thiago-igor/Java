/*
a)	se x é par, y = x / 2
b)	se x é impar, y = 3 * x + 1
c)	imprime y

O programa deve então armazenar o valor de y em x e continuar até que y tenha o valor final de 1. Por exemplo, para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.
 */

package java_poo.aula2.questoes_propostas;

import java.util.Scanner;

public class qst1 {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        int x,y;
        System.out.print("Digite um numero:");
        x = teclado.nextInt();
        do{
            y = (x%2==0)?x/2:x*3+1;
            x = y;

            System.out.printf(" > "+y);
        }while(y!=1);
    }
    
}

    

