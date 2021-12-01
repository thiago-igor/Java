package java_poo.Faculdade.aula6_Excecoes.Exercicos.Qst5;

public class Pessoa {
    
    private String nome;
    private String ddd;
    private String numero;

    public Pessoa(String nome, String ddd, String numero) throws Exception {
        if ( nome.length() >= 1 && ddd.length() == 2 && numero.length() == 8 || numero.length() == 9){
            this.nome = nome;
            this.ddd = ddd;
            this.numero = numero;
        }
        
        else 
            throw new Exception(" ERRO:\n O nome nao pode esta vazio!\n O DDD Precisa ter 2 digitos!\n O numero precisa ter 8 ou 9 numeros!");
                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    


}
