package java_poo.CursoEmVideo.aula4_geterr_setter;

public class Teste_construtor {
    public static void main(String[]args){
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        c1.status();

        Caneta c2 = new Caneta("FB", "Preta", 0.8f);
        c2.status();
    }
}
