package java_basico.exercicio7;

public class DoWhile {
    public static void main(String[]args){

        int c = 0;

        do{
            c++;
            if(c == 5 || c == 7){
                continue; // continue faz ele voltar pro while lem ler oq tem embaixo
            }
            System.out.println("Cambalhota "+c);
        }while(c<10);
    }
    
}
