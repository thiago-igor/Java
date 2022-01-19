package java_poo.Faculdade.aula6_Excecoes.Aula.Criando_Excecoes.EX2;

import java.util.Scanner;

public class TesteNaoPositivoException {
	
	public static void main(String[] args) {
		boolean ok = false;
		Scanner sc = new Scanner(System.in);
		while (ok == false) {
			try {
				System.out.println("Informe um numero positivo:");
				int numero = sc.nextInt();
				if (numero<0) throw new NaoPositivoException();
				ok = true;
			} catch(NaoPositivoException e) {
				System.out.println("Tente novamente!");
			}
		}
		sc.close();
	}
}

