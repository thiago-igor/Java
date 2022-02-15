package java_poo.Faculdade.Aula13_colecoes.ArrayList.Ordenaçao_Complexa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoasComOrdenacao2 {

	public static void main(String[] args) throws ParseException {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>(); // criando uma lista do objeto "Pessoas"
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //SimpleDateFormat: fazemos o padrao de data de nascimento
		Pessoa p1 = new Pessoa("Maria",sdf.parse("10/06/2006"));// essa String "10/06/2006" passa para o "parse" que devolve um "Date"
		Pessoa p2 = new Pessoa("Joao",sdf.parse("15/09/2000"));
		listaPessoas.add(p1); listaPessoas.add(p2); 

		System.out.println(listaPessoas); // fazemos o ToString na classe "Pessoa" para assim imprimir

		Collections.sort(listaPessoas); // ordenar pelo nascimento 
		System.out.println(listaPessoas);
	}
}
