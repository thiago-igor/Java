package java_poo.Codigos_Uteis.Transf_String_Em_Inteiro;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = Integer.parseInt(sc.nextLine()); 

        System.out.println("numero = "+numero);
    }

    //Integer.parseInt() : transforma uma string em um numero, mas so funciona se a String tiver formato de numero, exemplo: "22" , "10" , "7".

}
