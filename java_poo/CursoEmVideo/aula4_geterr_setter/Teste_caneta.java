package java_poo.CursoEmVideo.aula4_geterr_setter;

public class Teste_caneta {
    public static void main(String[]args){

        Caneta c1 = new Caneta(); // nesse caso ele busca o contrutor vazio 

        c1.setModelo("bic");
        c1.setPonta(0.5f);
        c1.setCor("azul");
        c1.status();
        //ou
        System.out.println("Tenho uma caneta "+c1.getModelo()+"\nde ponta "+c1.getPonta());
    }
    
}
