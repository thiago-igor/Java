package java_poo.CursoEmVideo.aula7_Relacionamento.aula8_agregacao;

import java_poo.CursoEmVideo.aula7_Relacionamento.Lutador; // importando para usar "Lutador"

public class Luta {
    //ATRIBUTOS:

    private Lutador desafiado; 
    private Lutador desafiante; 
    private int rounds;
    private boolean aprovada;
    
    //METODOS:
    public void marcarLuta(){

    }

    public void lutar(){

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
