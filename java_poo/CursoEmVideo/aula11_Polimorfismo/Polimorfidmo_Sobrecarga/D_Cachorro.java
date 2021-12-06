package java_poo.CursoEmVideo.aula11_Polimorfismo.Polimorfidmo_Sobrecarga;

public class D_Cachorro extends Animal1{

    @Override // aqui temos a sobreposição 
    public void emitirSom() {
        System.out.println("au au au au!!!!");
    }

    // aqui temos a sobrecarga:

    public void reagir(String frase){
        if(frase == "cheguei" || frase == "vamos passear"){
            System.out.println("abanar o rabo de felicidadeeee");
        }
        else{
            System.out.println("latir");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("abanar rabo!");
        }
        else if (hora>= 18 ){
            System.out.println("ignorar!");
        }
        else{
            System.out.println("abanar e latir");
        }

    }


    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("feliz!");
        }
        else{
            System.out.println("latir");
        }
    }
    
}
