package java_poo.Faculdade.aula5_Sobrescrita_E_PassagemParametro.passagemDeParametro.questoes;

public class Qst4 {

    public static void main(String[] args){
        imprimir(1,2,3); // PASSAGEM COM 3 PARAMETROS 
        imprimir(1,2); // PASSAGEM COM DOIS PARAMETROS 
        imprimir(); // PASSAGEM SEM PARAMETROS
    }

    public static void imprimir(int...inteiros){ // metodo com passagem de parametros variavel.
        for(int num: inteiros){
            System.out.println(num);
        }
    }
    
}
