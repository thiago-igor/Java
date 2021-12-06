package java_poo.CursoEmVideo.aula11_Polimorfismo.Polimorfidmo_Sobreposiçao;

public class Canguru extends Mamifero {
    
    @Override
    public void locomover(){
        System.out.println("Saltando"); // sobrepondo um metodo 
    }

    public void usarBolsa(){
        System.out.println("Usando Bolsa"); // criando umnovo metodo
    }


}
