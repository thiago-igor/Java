package java_basico.exercicio9_Funcao;

public class Funcao {

    public static void main(String[] args){
        System.out.println("Testando Funcoes:");
        soma(5,4);

        System.out.println("Testando/2:");
        int sm = soma_retur(33, 45);
        System.out.println("soma 2: "+sm);

    }


    static void soma(int a, int b){ //sem retorno
        int s = a + b;
        System.out.println("Soma = "+s);
    }

    static int soma_retur(int f, int g){ // com retorno int
        int s = f + g;
        return s;
    }

}
