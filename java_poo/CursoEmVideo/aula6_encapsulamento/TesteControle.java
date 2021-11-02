package java_poo.CursoEmVideo.aula6_encapsulamento;

public class TesteControle {

    public static void main (String[]args){
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenur();
    }
    
}
