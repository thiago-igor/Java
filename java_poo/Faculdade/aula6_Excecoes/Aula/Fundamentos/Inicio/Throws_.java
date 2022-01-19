package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.Inicio;

import java.util.Scanner;

public class Throws_ {
   
    public static void main(String[]args){

        System.out.println("Entre com um numero decimal: ");
        try {
            double num = lerNumero();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro!!!");
            e.printStackTrace(); // identifica as linhas do erro
        }

    }
    
    public static double lerNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }

    // obs: throws = e quando temos uma excessao em uma funçao, mas nao queremos tratar no momento, ou seja, com o throws vou esta declarando uma excessao e obrigando quem usar essa funçao a tratar o codigo com o try e catch 
}
