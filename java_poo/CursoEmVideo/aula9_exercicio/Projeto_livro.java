package java_poo.CursoEmVideo.aula9_exercicio;

public class Projeto_livro {
    public static void main(String[]args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("ThiThi", 20, "M");
        p[1] = new Pessoa("SaSa", 19, "F");

        l[0] = new Livro("Java", "jose silva", 549, p[0]);
        l[1] = new Livro("php", "joao algusto", 977, p[1]);
        l[2] = new Livro("python", "joao fernandes", 750, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancaPag();
        System.out.println(l[0].detalhes());
    }
    
}
