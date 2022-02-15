package java_poo.Faculdade.Aula13_colecoes.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TreeMap;

public class MapaPessoas {
	public static void main(String[] args) throws ParseException {
		Map<String,Pessoa> mapaPessoas = new TreeMap<String,Pessoa>(); // passamos 2 valores sempre <Chave, Objeto>
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria","000-000-000-00",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Joao","000-000-000-11",sdf.parse("15/09/2000"));
		mapaPessoas.put(p1.getCpf(),p1); // faz o msm que "add" porem adiciona 2 valores (a chave e o objeto)
		mapaPessoas.put(p2.getCpf(),p2); 

		System.out.println(mapaPessoas);
		System.out.println(mapaPessoas.get(p1.getCpf()));
		System.out.println(mapaPessoas.get(p2.getCpf()));
		mapaPessoas.remove(p2.getCpf());
		System.out.println(mapaPessoas);

		//obs: podemos ter objetos iguais, porem nunca chaves iguais que nesse exeplo seria o "cpf"

	}

}
