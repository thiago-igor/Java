package java_basico.exercicio6;

import java.util.Scanner;

public class IfElse {
    
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("digite nota1: ");
        float n1 = teclado.nextFloat();
        System.out.print("digite o numero2: ");
        float n2 = teclado.nextFloat();
        float media = (n1+n2)/2;
        System.out.println("media: "+media);

        if(media>=7){
            System.out.println("parabens, voce passou!!!");
        }

        else if (media>3 && media<7){
            System.out.println("voce esta de recuperacao");
        }

        else{
            System.out.println("voce esta reprovado(a)");
        }
    


    }
}
