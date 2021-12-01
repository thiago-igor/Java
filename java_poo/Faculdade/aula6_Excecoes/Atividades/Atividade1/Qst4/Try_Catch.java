package java_poo.Faculdade.aula6_Excecoes.Atividades.Atividade1.Qst4;

public class Try_Catch {
    public static void main(String[] args) {
        try{
            int[] vetor = new int[3];
            vetor[5] = 65; // Estamos tentando acessar uma posição que nao existe
        }catch(Exception e){
            System.out.println("Erro, Indice do Vetor inexistente ");
        }
    }
}
