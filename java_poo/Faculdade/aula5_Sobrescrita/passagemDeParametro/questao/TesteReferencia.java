package java_poo.Faculdade.aula5_Sobrescrita.passagemDeParametro.questao;

public class TesteReferencia {
    
    public static void main(String[] args){
        Pessoa p = new Pessoa("Thiago", 20); // passando as variaveis por parametro
        System.out.println("Nome: "+p.getNome()+ "\nIdade: "+p.getIdade()); // imprimindo o que foi passado
        System.out.println("-----------------");
        alterar(p); // alterando o que foi passado por parametro por meio de referencia 
        System.out.println("Nome: "+p.getNome()+ "\nIdade: "+p.getIdade()); // imprime a nova variavel que foi alterada pela funçao
    }

    public static void alterar(Pessoa p1){ // passa a copia da referencia de Pessoa, dessa forma alterando o resultado de forma global
        p1.setNome("leo");
        p1.setIdade(21);
    }

}
