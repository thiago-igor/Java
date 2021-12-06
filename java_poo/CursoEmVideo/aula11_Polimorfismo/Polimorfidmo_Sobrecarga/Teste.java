package java_poo.CursoEmVideo.aula11_Polimorfismo.Polimorfidmo_Sobrecarga;

public class Teste {
    public static void main (String[] args[]){
        // vamos observar a sobrecarga:

        D_Cachorro c1 = new D_Cachorro();

        c1.reagir("vamos passear");
        c1.reagir(11, 30);
        c1.reagir(true); 

        // aqui temos um exemplo de sobrecarga. onde temos o mesmo metodo com funcionalidades e atributos diferentes.

    }
}
