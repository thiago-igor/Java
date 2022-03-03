package java_poo.Codigos_Uteis.Vetor_De_Objeto;

public class main {
    //Atributos:
    public String titulo;
    public int avaliacao;
    public int curtidas;

    //Construtor:
    public main(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.curtidas = 1;
    }
   

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nAvaliacao: " + avaliacao + "\nCurtidas: "+ curtidas;
    }


    public static void main(String[]args){ // execultavel:

        main novo[] = new main[3]; // criando vetor dos objetos

        novo[0]= new main("o grandioso");
        novo[1]= new main("o Pequenino");
        novo[2]= new main("o Predador");

         // lendo cada objeto do vetor com o for simplificado
        for(main filme : novo){
			System.out.println(filme); 
		}

        /*
        // lendo cada objeto do vetor sem o uso do for
        System.out.println(novo[0].toString()); 
        System.out.println(novo[1].toString());
        System.out.println(novo[2].toString());
        */
    }
}
