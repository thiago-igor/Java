package java_poo.Faculdade.Aula13_colecoes.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    public static void main(String[] args) {
        // passamos "List" no começo para contribuir com o baixo acoplamento do codigo
        List<String> listaPessoas = new ArrayList<String>(); 
        //com esse Array consigo adicionar ou excluir quantos elementos eu quiser 
        // utilizamos "String" para alertar que queremos umma lista de Strings

        // adicionando:
        listaPessoas.add("joao"); 
        listaPessoas.add("Maria");
    }
}
