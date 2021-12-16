package java_poo.Faculdade.aula8_Polimofismo.Atividade;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto("celular", "Iphone: otimo celular, com uma excelente camera", 1000);
        Livro p2 = new Livro("Livro: Em busca do sucesso", "otimo livro", 200, "jose", "abc", "lua cheia");

        System.out.println("[1] => Cadastrar produto");
        System.out.println("[2] => Listar produtos");
        System.out.println("[3] => Cadastrar livro");
        System.out.println("[4] => Listar livros");
        System.out.println("[5] => Imprimir tudo");
        System.out.println("[6] => Sair");

        int numero;
       do{
            System.out.println("Digite o numero da operacao que deseja de [1] ate [6]: ");
            numero = sc.nextInt();
        } while( numero<1 || numero >6);


        
        if(numero == 1){
            System.out.print("Digite o nome do produto:");
            p1.setNome(sc.nextLine());
            p1.setNome(sc.nextLine());
            
            System.out.print("\nDigite a descricao do produto:");
            p1.setDescricao(sc.nextLine());

            System.out.print("\n Digite o valor do produto:");
            p1.setPreco(sc.nextFloat());

            System.out.println("\t---CADASTRO FEITO COM SUCESSO---");

            ler(p1);
        }
        else if(numero == 2){
            System.out.println("\t---DESCRICAO DO PRODUTO---");
            ler(p1);
        }

        else if(numero == 3){
            System.out.print("\nDigite o nome do produto:");
            p2.setNome(sc.nextLine());
            p2.setNome(sc.nextLine());
            
            System.out.print("\nDigite a descricao do produto:");
            p2.setDescricao(sc.nextLine());

            System.out.print("\n Digite o valor do produto:");
            p2.setPreco(sc.nextFloat());

            System.out.print("\nAutores:");
            p2.setAutores(sc.next());

            System.out.print("\nISBN:");
            p2.setISBN(sc.next());

            System.out.print("\nEditora:");
            p2.setEditora(sc.next());

            System.out.println("\n\t---CADASTRO FEITO COM SUCESSO---");

            ler(p2);
        }
        
        else if (numero == 4){
            ler(p2);
        }

        else if(numero == 5){
            ler(p1);
            ler(p2);
        }

        else if(numero == 6){
            System.out.println("Exit");
        }

        sc.close();
    }

    public static void ler(Produto p){
        System.out.println(p);
    }
}
