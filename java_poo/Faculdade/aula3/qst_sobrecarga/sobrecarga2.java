package java_poo.Faculdade.aula3.qst_sobrecarga;

public class sobrecarga2 {

    public static void inicializar(int hora, int minuto, int segundo){
        System.out.printf("%d:",hora);
        System.out.printf("%d:",minuto);
        System.out.printf("%d\n",segundo);
    }

    public static void inicializar(int hora, int minuto){
        System.out.printf("%d:",hora);
        System.out.printf("%d:",minuto);
        System.out.printf("01\n");
    }

    public static void inicializar(int hora){
        System.out.printf("%d:",hora);
        System.out.printf("01:");
        System.out.printf("01\n");
    }



    public static void main(String[]args){
        int h = 12;
        int min = 36;
        int seg = 55;

        inicializar(h,min,seg);

        inicializar(h,min);

        inicializar(h);
    }
    
}
