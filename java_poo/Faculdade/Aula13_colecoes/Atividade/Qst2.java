package java_poo.Faculdade.Aula13_colecoes.Atividade;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Qst2 {
    
    public static void main(String[] args) {
        List<Integer> listaNumeros = new LinkedList<Integer>();//com esse Array consigo adicionar ou excluir quantos elementos eu quiser 

        //adicionando:
        listaNumeros.add(10);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(9);
        listaNumeros.add(20);
        listaNumeros.add(34);
        listaNumeros.add(1);
        listaNumeros.add(5);

        //ordenando:
        Collections.sort(listaNumeros);// Sort: ordena o array
        System.out.println(listaNumeros);


    }
}
