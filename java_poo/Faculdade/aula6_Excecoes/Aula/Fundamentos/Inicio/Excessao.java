package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.Inicio;

public class Excessao {
    public static void main(String[] args){
        int numeros [] = {4,8,16,32,64,128};
        int denom [] = {2,0,4,8,0};

        for(int i = 0; i< numeros.length;i++){
            try{ // identifica se o codigo a baixo tem erro
                System.out.println(numeros[i] + "/" + denom[i] + "=" + numeros[i]/denom[i]);
            
            }catch(Exception e){ // Exception = excessao mais geral, vai abranger todas as excessoes
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            
            // e.getMessage() = manda uma menssagem o que esta dando erro
            //e.printStackTrace() = mostra em qual linha esta acontecendo o erro

            // OBS: nesse exemplo vamos ter messagem dizendo que um numero esta sendo dividido por zero, e esse erro esta ocorrendo na linha 10 
        }
    }

}