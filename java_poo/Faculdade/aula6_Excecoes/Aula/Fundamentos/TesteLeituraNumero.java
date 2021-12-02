package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos;

import java.util.Scanner;

public class TesteLeituraNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		while (ok==false) {
			System.out.println("Informe um numero:");
			try { // codigo suspeito de erro
				int numero = Integer.parseInt(sc.nextLine());
				System.out.println("Numero informado: "+numero);
				ok = true; // caso tenha um erro essa linha e pulada e vai para o catch
				
			} catch(Exception e) { // eceçao caso exista um erro
				System.out.println("Voce nao forneceu um numero!");
			}
		}
		sc.close();
	}
}
