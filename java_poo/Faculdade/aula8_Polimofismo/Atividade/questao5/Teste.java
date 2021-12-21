package java_poo.Faculdade.aula8_Polimofismo.Atividade.questao5;
import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] p = new Produto[2];

        p[0] = new Produto("nome", "descricao", 0);
        p[1] = new Livro("nome", "descricao", 0, "autores", "iSBN", "editora");

        Livro L1 = (Livro)p[1]; // convertendo p[1] para (livro L1), para assim tirar a "capa" que esta nos atributos que tem no livro mas nao tem no Produto.


        int numero;
       do{
            System.out.println("[1] => Cadastrar produto");
            System.out.println("[2] => Listar produtos");
            System.out.println("[3] => Cadastrar livro");
            System.out.println("[4] => Listar livros");
            System.out.println("[5] => Imprimir tudo");
            System.out.println("[6] => Sair");

            System.out.println("Digite o numero da operacao que deseja de [1] ate [6]: ");
            numero = sc.nextInt();
        
    

        if(numero == 1){
            System.out.println("\t---CADASTRANDO PRODUTO---");
            
            System.out.print("Nome => ");
            p[0].setNome(sc.nextLine());
            p[0].setNome(sc.nextLine());

            System.out.print("Descricao => ");
            p[0].setDescricao(sc.nextLine());

            System.out.print("RS => ");
            p[0].setPreco(sc.nextFloat());

            System.out.println("CADASTRO FEITO COM SUCESSO\n");
            
        }

        if(numero == 2){
            System.out.print("----CADASTRO----");
            System.out.println(p[0]);
        }

        if(numero == 3){
            System.out.print("Nome =>");
            L1.setNome(sc.nextLine());
            L1.setNome(sc.nextLine());
            
            System.out.print("Descricao => ");
            L1.setDescricao(sc.nextLine());

            System.out.print("RS => ");
            L1.setPreco(sc.nextFloat());

            System.out.print("Autor => ");
            L1.setAutores(sc.nextLine());
            L1.setAutores(sc.nextLine());

            System.out.print("iSBN => ");
            L1.setISBN(sc.nextLine());

            System.out.print("Editora => ");
            L1.setEditora(sc.nextLine());

            System.out.println("CADASTRO FEITO COM SUCESSO\n");
        }

        if(numero == 4){
            System.out.print("----CADASTRO----\n");
            System.out.println(L1);
        }


        if(numero == 5){
            System.out.println("---CADASTRO DOS PRODUTOS---\n");
            System.out.println(p[0]);

            System.out.println("---CADASTRO DOS LIVROS---\n");
            System.out.println(L1);
        }
        
        } while( numero != 6);

        System.out.println("- Programa encerrado!\n(exit...)");

    }
}
