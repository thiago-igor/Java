package java_poo.Codigos_Uteis.Gerar_NumeroAleatorio;

public class main {

    public static void main(String[] args){
        int sorteio = 0;
        
        for (int i=0; i<4; i++) {
            sorteio = (int)(Math.random()*4); // gerando mumero aleatorio de 0 a 3 
        }

        System.out.println("numero aleatorio: "+sorteio);

    }
}
