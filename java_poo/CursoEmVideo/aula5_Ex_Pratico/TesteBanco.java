package java_poo.CursoEmVideo.aula5_Ex_Pratico;

public class TesteBanco {

    public static void main(String[]args){
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1290);
        c1.setDono("Thiago");
        c1.abrirConta("cc");
        c1.depositar(100);
        c1.estadoAtual();


        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(1918);
        c2.setDono("Sabrina");
        c2.abrirConta("cp");
        c2.depositar(500);
        c2.sacar(100);
        c2.estadoAtual();
    }
    
}
