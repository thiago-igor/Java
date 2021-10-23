package rascunhos.atividades.atv1;

public class Contrato {
    String titular;
    String dependente;
    String empresa;


    void status(){ // Estado
        System.out.println("titular: "+this.titular);
        System.out.println("dependent: "+this.dependente);
        System.out.println("empresa: "+this.empresa);

    }
}

