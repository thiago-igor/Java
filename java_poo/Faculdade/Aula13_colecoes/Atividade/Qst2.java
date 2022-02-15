package java_poo.Faculdade.Aula13_colecoes.Atividade;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Qst2 {
    
    public static void main(String[] args) {
        List<Integer> listaNumeros = new LinkedList<Integer>();//com esse Array consigo adicionar ou excluir quantos elementos eu quiser 
        String resp;
        Scanner sc = new Scanner(System.in);

        //adicionando:
        do{
            System.out.println("digiteum numero:");
            resp = sc.nextLine();
            if(resp.equals("fim"))
                break;
            
            try {
               int numero = Integer.parseInt(resp);
                listaNumeros.add(numero);

            } catch (NumberFormatException e) {
                System.out.println("Digto nao permitido");
            }
        }while(true);

        //ordenando:
        Collections.sort(listaNumeros);// Sort: ordena o array
        System.out.println(listaNumeros);


    }
}
