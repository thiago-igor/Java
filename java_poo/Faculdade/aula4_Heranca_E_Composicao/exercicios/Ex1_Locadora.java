package java_poo.Faculdade.aula4_Heranca_E_Composicao.exercicios;

public class Ex1_Locadora {
    private String cnpj;
    private int preco;

    public Ex1_Locadora(String cnpj, int preco){
        
        this.cnpj = cnpj;
        this.preco = preco;
    }


    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public int getPreco(){
        return preco;
    }

    public void setpreco(int preco){
        this.preco = preco;
    }

}
