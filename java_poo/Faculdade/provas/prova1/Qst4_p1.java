package java_poo.Faculdade.provas.prova1;

public class Qst4_p1 {
    //ATRIBUTOS:
    public static int hora;
    public static int min;
    public static int seg;

    

    //CONSTRUTORES:
    public Qst4_p1(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Qst4_p1(int hora, int min) {
        this.hora = hora;
        this.min = min;
    }

    public Qst4_p1(int hora) {
        this.hora = hora;
    }


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
       
        Qst4_p1 horas = new Qst4_p1(12,30,25);


        Qst4_p1.inicializar(hora, min, seg);

        Qst4_p1.inicializar(hora,min);

        Qst4_p1.inicializar(hora);
    }
    
}


