package java_poo.Faculdade.aula3.sobrecarga.qst_sobrecarga;

public class sobrecargaRascunho {
    public static void tirarFerias(String ferias){  // metodos, ou seja, funçoes 
        System.out.println("Voce ira tirar ferias!!");
    }

    public static void tirarFerias(int dias){
        String ferias = "null";
        tirarFerias(ferias); // funçao chamando outra funçao
        System.out.printf("Tempo determinado de: %d Dias \n",dias);
    }
    // nesse exemplo temos a sobrecarga,ou seja, 2 metodos com o mesmo nome, mas com funcionalidades diferentes
    // o compilador decide o melhor para usar 


    public static void main(String[]args){
        String ferias = null;
        int dias = 30;

        tirarFerias(ferias); // uso dos metodos,ou seja, funçoes escritas no começo do codigo para assim execultar a funçao
        tirarFerias(dias); // funçoes com o mesmo nome sao "sobrecargas" porem sempre com funçoes diferentes, e o compilador ver qual a melhor para ser usada
    }
}
