package java_poo.CursoEmVideo.aula7_Relacionamento;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodo especial

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Metodos:

    public void apresentar(){
        System.out.println("------------------");
        System.out.println("Lutador: "+getNome());
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println(getIdade()+"anos");
        System.out.println(getAltura()+"M de altura");
        System.out.println("Pesando: "+getPeso()+" Kg");
        System.out.println("Ganhou: "+getVitorias());
        System.out.println("Perdeu: "+getDerrotas());
        System.out.println("Empate: "+getEmpates());          
    }


    public void status(){
        System.out.println(getNome()+" E Peso "+getCategoria() );
        System.out.println(getPeso()+"Kg");
        System.out.println("V:"+getVitorias());
        System.out.println("D:"+getDerrotas());
        System.out.println("E:"+getEmpates());         

    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() +1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso<52.2){
            this.categoria = "invalida";
        }
        else if(peso <= 70.3){
            this.categoria = "leve";
        }
        else if(peso <= 83.9){
            this.categoria = "Medio";
        }
        else if(peso<=120.2){
            this.categoria = "pesado";
        }
        else{
            this.categoria = "acima do peso";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    

    
}
