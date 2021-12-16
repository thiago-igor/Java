package java_poo.Faculdade.aula7_interfaces.Questoes.qst5;

public class Teste1 {
    
    public static void main(String[] args) {
        Aviao A = new Aviao();
        Carro C = new Carro();
        Bicicleta B = new Bicicleta();

        A.ligarMotor();
        A.abastecer(1000);
        A.curva(80);

        System.out.println("----------------");

        C.ligarMotor();
        C.abastecer(20);
        C.curva(20);

        System.out.println("----------------");

        B.curva(0);

    }
}
