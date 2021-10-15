package java_basico.exercico4;

public class ClassMath {

    public static void main(String[]args){
        int valor = 16;

        float res = (float) Math.sqrt(valor); // funçao Math que chama uma raiz quadrada
        System.out.printf("a raiz de %d e: %.2f\n",valor,res);

        // pow: expodencial Math.pow(5,2) 
        //PI: Math.PI = 3,14...
        // cbrt: raiz cubica Math.cbrt(27)

        // abs: valor sempre positivo Math.abs(-10) = 10
        // floor: arredonda para baixo Math.floor(3.9) = 3
        // ceil: arredonda para cima Math.ceil(4.2) = 5
        // round: arredonda aritimeticamente Math.round(5.6) = 6

        
    }
    
}
