package java_poo.CursoEmVideo.aula7_Relacionamento;

import java.util.Random; // importaçao para usar o metodo Random

public class Luta {
    //ATRIBUTOS:

    private Lutador desafiado; 
    private Lutador desafiante; 
    private int rounds;
    private boolean aprovada;
    
    //METODOS:
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){ // nessa ocasiao podemos usar o "==" ou ".equals"
            System.out.println("luta aprovada");
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante =l2;
        }
        else{
            System.out.println("luta nao aprovada");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("----DESAFIADO----");
            this.desafiado.apresentar();
            System.out.println("----DESAFIANTE----");
            this.desafiante.apresentar();

            Random aleatorio = new Random();  // metodo que gera numero aleatorio
                int vencedor = aleatorio.nextInt(3); // gera um numero aleatorio de 0 a 2
                System.out.println("====resultado da luta====");
                switch(vencedor){
                    case 0: //EMPATE
                        System.out.println("Empatou!!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    
                    case 1:
                        System.out.println("Vitoria do "+this.getDesafiado());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    
                    case 2:
                        System.out.println("Vitoria do "+this.getDesafiante());
                        this.desafiante.ganharLuta();
                        this.desafiado.perderLuta();
                        break;
                }
                System.out.println("=====================");


        }
        else{
            System.out.println("Luta nao pode acontecer!!!");
        }

    }

    //Metodos especiais:

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
