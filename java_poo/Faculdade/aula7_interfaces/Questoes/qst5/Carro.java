package java_poo.Faculdade.aula7_interfaces.Questoes.qst5;

public class Carro implements Motorizador, Conduzivel {

    @Override
    public void ligarMotor() {
        System.out.println("Motor do Carro ligado!");
    }

    @Override
    public void abastecer(int numLitros) {
        System.out.println("Carro abastecido com "+numLitros + " litros");
    }

    @Override
    public void curva(float angulo) {
        if(angulo == 0){
            System.out.println("Carro andando em linha reta");
        }
        else{
            System.out.println("Carro fazendo curva com angulo de "+angulo + "graus");
        }
    }
    
}
