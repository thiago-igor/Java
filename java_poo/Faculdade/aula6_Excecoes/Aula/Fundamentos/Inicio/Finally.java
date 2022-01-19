package java_poo.Faculdade.aula6_Excecoes.Aula.Fundamentos.Inicio;

public class Finally {
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
            
            finally{
                System.out.println("Essa linha e impressa SEMPRE apos o try ou catch");
            }
            // finally sempre sera impresso apos um try ou catch!!!
        }
    }
}
    

