package java_basico.exercicio6;

import java.util.Scanner;

public class Switch {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        System.out.print("digite um numero de um a 3: ");
        int num = teclado.nextInt();

        switch(num){
            case 1:
                System.out.println("numero 1!!");
                break;
            case 2:
                System.out.println("numreo 2!!!");
                break;
            case 3:
                System.out.println("numero 3!!!");
                break;
            default:
                System.out.println("opcao invalida!!!");
                break;
        }
        
    }
}
