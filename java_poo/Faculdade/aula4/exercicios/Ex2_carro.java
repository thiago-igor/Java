package java_poo.Faculdade.aula4.exercicios;

public class Ex2_carro extends Ex2_produto{
    private int potMotor;
    private String modelo;
    private String rua;
    private int numero;

    public static void Endereco(String rua, int numero){
        System.out.println("Rua:"+rua);
        System.out.println("Numero:"+numero);
    }

    public static void Endereco(String rua){
        System.out.println("Rua:"+rua);
    }

    public Ex2_carro(String nome, int preco, int potMotor, String modelo){
        super(nome,preco);
        this.potMotor = potMotor;
        this.modelo = modelo;
    }

    public int getPotMotor() {
        return potMotor;
    }

    public void setPotMotor(int potMotor) {
        this.potMotor = potMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
}
