package java_basico.exercico4;

public class Operadores {

    public static void main(String[] args){
        int n1 = 2;
        int n2 = 4;
        float media = (n1 + n2)/2;

        System.out.println("A media e => "+ media);

        int numero = 5;
        int valor = 5 + ++numero; // adiciona 1 no numero e dps soma 5 + numero
        System.out.println("valor => "+valor);

        int numero2 = 5;
        int valor2 = 5 + numero2++; // ele primeiro soma 5+ numero e so dps adiciona 1 no numero
        System.out.println("valor2 => "+valor2);

    }
    
}
