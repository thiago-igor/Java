package rascunhos;

public class Sabrina {

    public String namorado;
    public String porcentagemDeAmor;

    
    public Sabrina(String namorado, String porcentagemDeAmor) {
        this.namorado = namorado;
        this.porcentagemDeAmor = porcentagemDeAmor;
    }

    public void imprimirAmor(){
        System.out.println("Nome do Amor da minha VIDA: "+namorado);
        System.out.println("Porcentagem da paixao: "+porcentagemDeAmor);
    }


    public static void main(String[]args){
        Sabrina namo = new Sabrina("SABRINA", "10000000%");

        namo.imprimirAmor();

    }
    
}
