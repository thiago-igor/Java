package rascunhos.atividades.atv1;

public class pessoa {

    String nome;
    int nascimento;
    String endereço;
    String sexo;

    void status(){ // Estado
        System.out.println("nome: "+this.nome);
        System.out.println("nascimento: "+this.nascimento);
        System.out.println("endereço: "+this.endereço);
        System.out.println("sexo: "+this.sexo);

    }
}
