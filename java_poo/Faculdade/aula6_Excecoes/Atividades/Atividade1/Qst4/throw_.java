package java_poo.Faculdade.aula6_Excecoes.Atividades.Atividade1.Qst4;

public class throw_ {
    public static void main(String[] args) {
        
        try{
            throw new Exception("Essa mensagem nao sera impressa"); // uma exceção do tipo exepition 
        }catch(Exception e){
            System.out.println("Erro");
        }
        
    }
}
