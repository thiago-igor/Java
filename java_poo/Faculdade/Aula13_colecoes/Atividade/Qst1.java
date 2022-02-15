package java_poo.Faculdade.Aula13_colecoes.Atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qst1 {
    public static void main(String[] args) {
        List<String> primeiraLista = new ArrayList<String>();
        List<String> listaigual = new ArrayList<String>();
        List<String> listadiferente = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("\t[Primeira lista de Nomes:]");
        do{
            System.out.println("Digite um nome: ");
            nome = sc.nextLine();
            if(nome.equals("fim")){
                break;
            }
            //adicionando:
            primeiraLista.add(nome);

        }while(true);


        System.out.println("\t[Segunda lista de Nomes:]");
        do{
            System.out.println("Digite um nome: ");
            nome = sc.nextLine();
            if(nome.equals("fim"))
                break;
            
            // indexOf é utilizado para encontrar um valor dentro de uma string ou array, caso o valor não seja encontrado, ele retorna -1
            if(primeiraLista.indexOf(nome)== -1) 
                listadiferente.add(nome);

            if(primeiraLista.indexOf(nome)!=-1)
                listaigual.add(nome);        
            
        }while(true);

        System.out.println("\nprimeira lista: "+ primeiraLista);// primeira lista

        System.out.println("Nomes Localizados nas 2 Listas: "+listaigual); //nomes que estao nas 2 listas ao mesmo tempo
        System.out.println("Nomes nao localizados nas 2 Listas: "+listadiferente);// nomes escritos na lista 2 que nao estao na lista 1


    }
}
