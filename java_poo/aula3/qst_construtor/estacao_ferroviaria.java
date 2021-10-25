package java_poo.aula3.qst_construtor;

public class estacao_ferroviaria {

    private String sigla;
    private String descricao;
    private int numero;
    private int extensaoEmMetros;


    public estacao_ferroviaria(String sigla,String descricao, int numero, int extensaoEmMetros){
        this.sigla = sigla;
        this.descricao = descricao;
        this.numero = numero;
        this.extensaoEmMetros = extensaoEmMetros;
    }

    public static void main(String[]args){

        estacao_ferroviaria f1 = new estacao_ferroviaria("AVG", "otima estacao", 2022, 45);
        System.out.println("Sigla: "+f1.sigla);
        System.out.println("Descricao: "+f1.descricao);
        System.out.println("Numero: "+f1.numero);
        System.out.println("extensao em metros:"+f1.extensaoEmMetros);


    }
    
}
