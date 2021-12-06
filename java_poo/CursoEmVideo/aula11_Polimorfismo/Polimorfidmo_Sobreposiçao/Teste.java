package java_poo.CursoEmVideo.aula11_Polimorfismo.Polimorfidmo_Sobreposiçao;

public class Teste {       
    public static void main (String [] args){
        Mamifero m1 = new Mamifero();
        Peixe p1 = new Peixe();
        Reptil r1 = new Reptil();
        Canguru c1 = new Canguru();

        System.out.println("\t Status Animais:");

        m1.status("macaco",50, 15, 4);
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();

        System.out.println("------------------------");

        p1.status("Tilapia",34, 15, 0);
        p1.alimentar();
        p1.locomover();
        p1.emitirSom();

        System.out.println("------------------------");

        r1.status("Lagarta",70, 55, 4);
        r1.alimentar();
        r1.locomover();
        r1.emitirSom();

        System.out.println("------------------------");

        c1.status("Canguru",66, 12, 2);
        c1.alimentar();
        c1.locomover();
        c1.emitirSom();
        
        
        



    }
}
