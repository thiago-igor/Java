package java_poo.CursoEmVideo.aula5_Ex_Pratico;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("------------------");
        System.out.println("Conta: "+getNumConta());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Dono: "+getDono());
        System.out.println("saldo: "+getSaldo());
        System.out.println("Status: "+getStatus());
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
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float real){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + real);
            System.out.println("deposito realizado com sucesso na conta de "+getDono());
        }
        else{
            System.out.println("impossivel depositar pois a conta esta fechada");
        }
    }

    public void sacar(float real){
        if(this.getStatus()){
            if(this.getSaldo() >= real){
                this.setSaldo(this.getSaldo() - real); // ou saldo = saldo - real
                System.out.println("saque realizado na conta de "+getDono());
            }
            else{
                System.out.println("saldo indisponivel");
            }
        }
        else{
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }
    public void pageMensal(){
        int v = 0;
        if(this.getTipo() == "cc"){
            v = 12;
        }
        else if(this.getTipo() == "cp"){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
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


    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
