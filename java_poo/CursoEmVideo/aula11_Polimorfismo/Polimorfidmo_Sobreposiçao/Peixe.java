package java_poo.CursoEmVideo.aula11_Polimorfismo.Polimorfidmo_Sobreposiçao;

public class Peixe extends Animal { // sou obrigado a escrever os metos da Super classe, nesse caso "Animal"

    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe Nao Faz Som");
        
    }

    public void soltarBolha(){  // adicionando metodo especifico dos peixes 
        System.out.println("Soltando bolhas!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }


    
}
