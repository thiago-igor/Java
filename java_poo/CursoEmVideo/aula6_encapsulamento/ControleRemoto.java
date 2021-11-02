package java_poo.CursoEmVideo.aula6_encapsulamento;

public class ControleRemoto implements Controlador {
    //ATRIBUTOS:
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //METODOS ESPECIAIS:

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //METODOS ABSTRATOS:

    @Override
    public void ligar() {
        this.setLigado(true);          
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenur() {
        System.out.println("--- ABRINDO MENU ---");
        System.out.println("Esta ligado? "+this.getLigado());
        System.out.println("Esta tocando? "+this.getTocando());
        System.out.println("volume: "+this.getVolume());
        for(int i = 0; i <= this.getVolume();i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");       
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() +5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }    
    }

    @Override
    public void deligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
       if(this.getLigado() && !(this.getTocando() )){
           this.setTocando(true);
       }         
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando() ){
            this.setTocando(false);
        }
    }
    
    

    

}
