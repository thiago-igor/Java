package rascunhos.atividades.atv1;

public class FaturaMensal {

    int valor;
    int nascimento;
    float multa;
    float jurosdia;
    

    void status(){ // Estado
        System.out.println("multa: "+this.multa);
        System.out.println("jurosdia: "+this.jurosdia);
        System.out.println("valor: "+this.valor);

    }
}
