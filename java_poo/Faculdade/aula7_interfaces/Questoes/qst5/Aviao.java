package java_poo.Faculdade.aula7_interfaces.Questoes.qst5;

public class Aviao implements Motorizador, Conduzivel {

    @Override
    public void ligarMotor() {
        System.out.println("Motor do Aviao ligado!");
    }

    @Override
    public void abastecer(int numLitros) {
        System.out.println("Aviao abastecido com "+numLitros + " litros");
    }

    @Override
    public void curva(float angulo) {
        if(angulo == 0){
            System.out.println("Aviao voando em linha reta");
        }
        else{
            System.out.println("Aviao fazendo curva com angulo de "+angulo + "graus");
        }
    }

    
    
}
