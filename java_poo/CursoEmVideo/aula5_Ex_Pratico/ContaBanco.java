package java_poo.CursoEmVideo.aula5_Ex_Pratico;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private float real;
    private boolean status;

    public ContaBanco(int saldo, boolean status){
        this.setSaldo(0);
        this.setStatus(false);
    }

    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "cc"){
            //saldo = 50;
            //ou
            this.setSaldo(50);
        }

        else if(tipo == "cp"){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta Com Dinheiro.(fechamento indisponivel)");
        }

        else if(this.getSaldo() < 0){
            System.out.println("Saldo devedor. (fechamento indisponivel)");
        }

        else{
            setStatus(false);
        }
    }

    public void depositar(float real){
        if(status = true){
            setSaldo(getSaldo() + real);
        }
        else{
            System.out.println("invalido");
        }
    }

    public void sacar(float real){
        if(status == true){
            if(saldo >= real){
                setSaldo(getSaldo() - real); // ou saldo = saldo - real
            }
            else{
                System.out.println("saldo indisponivel");
            }
        }
        else{
            System.out.println("impossivel sacar");
        }
    }
    float v;
    public void pageMensal(){
        if(tipo == "cc"){
            v =12;
        }
        else if(tipo == "cp"){
            v =20;
        }
        if(status == true){
            if(saldo > v){
                saldo = saldo - v;
            }
            else{
                System.out.println("saldo insuficiente");
            }
        }
        else{
            System.out.println("impossivel pagar");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public float getReal() {
        return real;
    }


    public void setReal(float real) {
        this.real = real;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
