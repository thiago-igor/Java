package java_poo.Faculdade.aula6_Excecoes.Exercicos.Qst5;

import java.util.Scanner;

public class Pessoa_Teste {
    public static void main (String[]args){
        try{
            Pessoa p1 = new Pessoa(null, null, null);
                
            Scanner sc = new Scanner(System.in);

        
        System.out.println("\tNOME COMPLETO:"); //imprimir na saida padrao:
        p1.setNumero(sc.nextLine()); //lendo dado

        System.out.println("\t Digite o DDD: ");
        p1.setDdd(sc.nextLine());

        System.out.println("\t Digite o Numero: ");
        p1.setNumero(sc.nextLine());




                System.out.println("\nSeu Nome eh: "+p1.getNome());
                System.out.println("Seu Numero eh: "+p1.getDdd()+"-"+ p1.getNumero());
        }catch(Exception e){
            System.out.println(" ERRO:\n O nome nao pode esta em branco! \n O DDD precisa de 2 numeros! \n O numero precisa de 8 ou 9 numeros!");

        }
    
    }

}


