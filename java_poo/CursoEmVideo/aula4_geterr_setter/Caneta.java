package java_poo.CursoEmVideo.aula4_geterr_setter;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public  Caneta(String m,String c, float p){ // Esse e um construtor. pois tem o mesmo nome da classe principal
        this.tampar();
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }

    public Caneta(){ // construtor vazio 

    }



    public void status(){
        System.out.println("CANETA:");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }


    void rabiscar(){ // Metodo
    if(this.tampada == true){
        System.out.println("ERRO! Nao posso rabiscar");
    }
    else{
        System.out.println("Estou Rabiscando!");
    }
}

void tampar(){ // metodo
    this.tampada = true;
}

void destampar(){ // metodo
this.tampada = false;
}
    
    public String getModelo(){ // get para ler atributos privados 
        return this.modelo;
    }

    public void setModelo(String m){ // set para modificar atributos privados
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    


}
