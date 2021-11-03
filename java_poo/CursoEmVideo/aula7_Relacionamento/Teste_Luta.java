package java_poo.CursoEmVideo.aula7_Relacionamento;

public class Teste_Luta {
    public static void main(String[]args){
        Lutador l[] = new Lutador[4]; // vetor (conjunto de lutadores)

        l[0] = new Lutador("Thiago", "franca", 21, 1.78f, 75f, 22, 4, 2);

        l[1] = new Lutador("Anderson Silva","Brasil",39,1.72f, 74.3f, 31, 5, 1);

        l[2] = new Lutador("Sabrina","italy",19,1.70f,60f,23,1,6);

        l[3] = new Lutador("jonh & jonh","EUA", 24, 1.75f, 88f, 42, 4, 3);

        //for(int i=0 ;i<4 ; i++){ // apresentando o vetor
          //  l[i].apresentar();
        //}

        // obs a luta so ocorre com lutadores diferentes e da mesma categoria 
        Luta ufc = new Luta();
        ufc.marcarLuta(l[0], l[1]);
        ufc.lutar();

        l[0].status();
        l[1].status();

    }

    
}
