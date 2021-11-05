// fatorial:

package java_poo.Faculdade.aula2.questoes_propostas;

import java.util.Scanner;

public class Qst3_2 {
    
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("FATORIAL:");
        System.out.print("Valor de x: ");
        int x = teclado.nextInt();
        int res = 1;
        do{
            if(x ==0){
                x = 1;
                continue;
            }
            res *= x;
            System.out.print(" x "+x);
            x--;
        }while(x>=1);

        System.out.print(" => "+res);
    }
}
