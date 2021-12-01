package java_poo.Faculdade.aula6_Excecoes.Atividades.Atividade1.Qst5;

import java.util.Scanner;

public class Qst5_Cadastro {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        
        String nome = null, ddd = null, numero = null;
        boolean x = false;

        while( nome == null){
            System.out.println("Digite seu nome completo:");
            nome = sc.nextLine();
        }

        System.out.println("\tInforme Seu Numero:");

        while(x == false){
            try{
                System.out.println("DDD: ");
                ddd = sc.nextLine();
                if(ddd.length() == 2){
                    x = true;
                }
                break;
            }catch(Exception e){
                System.out.println("DDD invalito, digite com 2 digitos!");
            }

        }
        x = false;
        while(x==false){
            try{
                System.out.println("Numero: ");
                numero = sc.nextLine();

                if(numero.length() == 8 || numero.length() == 9){
                    x = true;
                }
                break;
            }catch(Exception e){
                System.out.println("Numero incorreto, e necessario 8 ou 9 digitos!");
            }
        }

        sc.close();

        System.out.println("\t\nNome Completo: "+nome);
        System.out.printf("Numero Completo: (%s)%s ",ddd,numero);


    }

    
}

// obs: professor fiz o codigo assim, mas percebo que nao esta execultando totalmente correto, queria saber se o senhor poderia corrigir para mim e me enviar comentado.