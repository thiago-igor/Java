package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.Inicio;

import java.util.Scanner;

public class TesteLeituraNumero {
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		while(ok==false){
			System.out.println("Informe um numero:");
			try{ // bloco monitorado para erros( ex: digitar uma palavra em vez do numero )
				int numero = Integer.parseInt(sc.nextLine());
				System.out.println("Numero informado:" + numero);
				ok = true;
			}catch(Exception e){// caso ocorra uma exeçao, sera chamado o "catch"
				System.out.println("Voce nao forneceu um numero!");
			}
		}
		sc.close();
	}
}
