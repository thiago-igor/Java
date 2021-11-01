package java_poo.CursoEmVideo.aula3_visibilidade;

public class Canetinha {
    public String modelo; // atributos
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    
    public void status(){ // Estado
        System.out.println("modelo: "+this.modelo);
        System.out.println("uma caneta "+this.cor);
        System.out.println("ponta:"+this.ponta); 
        System.out.println("carga: "+this.carga);
        System.out.println("esta tampada? "+ this.tampada);
    }
    
    public void rabiscar(){ // Metodo
        if(this.tampada == true){
            System.out.println("ERRO! Nao posso rabiscar");
        }
        else{
            System.out.println("Estou Rabiscando!");
        }
    }
    
    protected void tampar(){ // metodo
        this.tampada = true;
    }
    
    protected void destampar(){ // metodo
    this.tampada = false;
    }
}
