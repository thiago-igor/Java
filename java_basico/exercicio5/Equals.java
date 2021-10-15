package java_basico.exercicio5;

public class Equals {

    public static void main(String[]args){
        String nome1 = "Gustavo";
        String nome2 = new String("Gustavo");
        String res;

        res = (nome1.equals(nome2))? "igual":"diferente"; // .equals() tem a msm funçao de == , porem e usado para objeto  
        System.out.println(res);

    }
}
