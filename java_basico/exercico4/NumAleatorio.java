package java_basico.exercico4;

public class NumAleatorio {

    public static void main(String[]args){

        double ale = Math.random();
        int n = (int) (1+ale * (50-1));
        System.out.println("numero aleatorio = "+n);

    }
    
}
