package java_basico.exercicio3;

public class TestesTipos {

    public static void main(String[]agrs){

        int idade = 30;
        String valor = Integer.toString(idade); // transforma inteiro em string
        System.out.println(valor);


        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2); // transforma string em inteiro
        System.out.println(idade2);
    }
    
}
