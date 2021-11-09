package java_basico.exercicio8_Vetores;

public class Vetor {

    public static void main(String[] args){
        int v [] = new  int[5]; // vetor criado com 5 posiçoes
        int n[] = {1,2,3,4}; // vetor criado e preenchido com 4 posiçoes 

        System.out.println( "Tamanho do vetor = "+n.length); // fornece o tamanho do vetor

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+"  ");
        }
    }
    
}
