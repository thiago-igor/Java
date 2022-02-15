package java_poo.Faculdade.Aula13_colecoes.ArrayList.Ordenacao_simples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoas_Ordenacao {
    public static void main(String[] args) {
        List<String> listaPessoas = new ArrayList<String>();  //com esse Array consigo adicionar ou excluir quantos elementos eu quiser 

        //adicionando
        listaPessoas.add("joao");
        listaPessoas.add("Maria");
        System.out.println(listaPessoas);

        //ordenando
        Collections.sort(listaPessoas); // esse metodo "sort" ordenou o vetor de forma crescente
        System.out.println(listaPessoas);
    }
}
