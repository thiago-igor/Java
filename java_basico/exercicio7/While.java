package java_basico.exercicio7;

public class While {

    public static void main(String[]args){

        int c = 0;

        while(c<10){
            
            c++;
            if(c == 5 || c == 7){
                continue; // continue faz ele voltar pro while lem ler oq tem embaixo
            }
            System.out.println("Cambalhota "+c);
        }
    }
    
}
