package java_poo.Faculdade.aula3.visibilidade_e_encapsulamento.visibilidade;

public class outraClasse {

    public static void main(String[]args){
        Visibilidade v = new Visibilidade();
        // obs: para o protegidp e padrao funcionar, precisam estar no mesmo package
        v.publico = 1;
        v.protegido = 2; 
        v.padrao = 3;
        //v.privado = 4; // erro, atributo privado

        v.imprimiPublico();
        v.imprimeProtegido();
        v.imprimePadrao();
        //v.imprimePrivado();  // erro, metodo privado
    }
    
}
