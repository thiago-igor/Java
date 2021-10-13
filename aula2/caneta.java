package aula2;

public class caneta {
    String modelo; // atributos
    String cor;
    float ponta;
    int carga;
    boolean tampada;


void status(){ // Estado
    System.out.println("modelo: "+this.modelo);
    System.out.println("uma caneta "+this.cor);
    System.out.println("ponta:"+this.ponta); 
    System.out.println("carga: "+this.carga);
    System.out.println("esta tampada? "+ this.tampada);
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

}