package java_poo.Faculdade.aula6_Excecoes.Atividades.Atividade1.Qst5;

import java.util.Scanner;

public class Qst5_Novo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        String nome = null;
        int numero;
        int ddd=0;

        System.out.println("---Iniciando Cadastro---");

        while(nome == null){
            System.out.print("Digite Seu Nome Completo:");
             nome = sc.nextLine();
        }

        System.out.println("Numero De Telefone:");

        boolean ok = false;
        while(ok == false){
            System.out.print("DDD: ");
            try{ // bloco monitorado para erros( ex: digitar uma palavra em vez do numero )
                ddd = Integer.parseInt(sc.nextLine()); // integer.parseInt() : transforma uma String em um numero.
                if(ddd>9 && ddd<100){
                    ok = true; 
                }
                else{
                    System.out.println("O DDD possui 2 Digitos!");
                }
            }catch(Exception e){// caso ocorra uma exeçao, sera chamado o "catch"
                System.out.println("Voce nao forneceu um numero!");
            }


        }

        while(true){
            System.out.print("Numero:");
            try {
                numero = Integer.parseInt(sc.nextLine());
                if(numero<10000000 || numero>100000000){
                    throw new Exception("numero invalido");
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro, Numero invalido. Tente Novamente!!!");
            }
        }


        System.out.println("---Cadastro Realizado Com Sucesso---");
        System.out.println("Nome Completo: "+nome);
        System.out.printf("Numero: (%s) %s",ddd,numero);

    }
}
