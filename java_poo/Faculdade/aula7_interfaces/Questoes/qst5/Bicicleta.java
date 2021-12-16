package java_poo.Faculdade.aula7_interfaces.Questoes.qst5;

public class Bicicleta implements Conduzivel {

    @Override
    public void curva(float angulo) {
        if(angulo == 0){
            System.out.println("Bicicleta Andando em linha reta");
        }
        else{
            System.out.println("Bicicleta fazendo curva com angulo de "+angulo + "graus");
        }
    }
    
}
