package java_basico.exercicio3;

import java.util.Scanner; // importado para ler do teclado algo

public class Primitivos{

    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in); // implementado para ler do teclado
        System.out.print("digite o nome do aluno: "); // escrevendo msgm
        String nome = teclado.nextLine(); //lendo do teclado o nome
        System.out.print("digite a nota do aluno: ");
        float nota = teclado.nextFloat(); // lendo do teclado a nota
        System.out.println("A nota e: " +nota); // numero float
        System.out.printf("A nota do %s e: %.2f \n",nome,nota); //acessa o nome e o numero float com 2 casas decimais 
        System.out.format("A nota do %s e: %.2f \n",nome,nota);// o msm da de cima, so muda de printf para format
    }

}