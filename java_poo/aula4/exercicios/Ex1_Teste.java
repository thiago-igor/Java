package java_poo.aula4.exercicios;

public class Ex1_Teste {

    public static void main(String[]args){
        // criando objeto
        Ex1_Locadora l = new Ex1_Locadora("55564830001", 1000);
        Ex1_Carro c = new Ex1_Carro("up", 2020, l);
        System.out.println("carro:"+c.getNome());
        System.out.println("ano:"+c.getAno());
        System.out.println("preco / mes:"+c.getEx1_Locadora().getPreco());
    }
    
}
