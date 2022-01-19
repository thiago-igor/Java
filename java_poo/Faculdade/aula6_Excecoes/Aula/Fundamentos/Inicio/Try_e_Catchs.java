package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.Inicio;

public class Try_e_Catchs {
    
    public static void main(String[] args){
        int numeros [] = {4,8,16,32,64,128};
        int denom [] = {2,0,4,8,0};

        for(int i = 0; i< numeros.length;i++){
            try{ // identifica se o codigo a baixo tem erro
                System.out.println(numeros[i] + "/" + denom[i] + "=" + numeros[i]/denom[i]);
            
            }catch(ArithmeticException e){
                System.out.println("Erro a dividir por zero");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("posicao invalida do array");
            }
            // se tivermos erro, o codigo busca de cima para baixo o catch onde se encaixa esse erro
            // obs: podemos ter quantos catch for necessario!
        }
    }
}
