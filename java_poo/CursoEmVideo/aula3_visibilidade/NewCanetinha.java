package java_poo.CursoEmVideo.aula3_visibilidade;

public class NewCanetinha {
    public static void main(String[]args){
        Canetinha c1 = new Canetinha();

        c1.modelo = "BIC";
        c1.cor = "AZUL";
        //c1.ponta = 0,5;   /Da erro pois o atributo e privado
        c1.carga = 80; // Ele permite esse atributo protegido pois, o mwtodo esta dentro de uma classe que utiliza Canetinha
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
    
    }
}
