package java_poo.Faculdade.provas.prova1;

public class Qst3_p1 {
    
    // QUANTIDADE
    public static void inicializar(int x, int y){
        System.out.printf("x = %d:",x);
        System.out.printf("y = %d:",y);
    }

    public static void inicializar(int x, int y, int z){
        System.out.printf("x = %d:",x);
        System.out.printf("y = %d:",y);
        System.out.printf("y = %d:",z);
    }

    //ORDEM
    public static void inicializar(int x, String nome){
        System.out.println("x = "+x);
        System.out.println("nome = "+nome);
    }

    public static void inicializar(String nome, int x){
        System.out.println("x = "+x);
        System.out.println("nome ="+nome);
    }

    //TIPO
    public static void inicializar(String nome){
        System.out.println("nome = "+nome);
    }

    public static void inicializar(int x){
        System.out.println("x = "+x);
    }


}
