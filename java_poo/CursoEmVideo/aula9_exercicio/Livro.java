package java_poo.CursoEmVideo.aula9_exercicio;

public class Livro implements Publicacao_Interfacie {
    //ATRIBUTOS:
    private String titulo;
    private String autor;
    private int totpPginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    

    public Livro(String titulo, String autor, int totpPginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpPginas = totpPginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    

    

    public String detalhes() {
        return "Livro [aberto=" + aberto + "\n, autor=" + autor + "\n, leitor=" + leitor.getNome() + ",idade =" +leitor.getIdade() + ",sexo = " +leitor.getSexo() + "\n,pagAtual=" + pagAtual+ "\n, titulo=" + titulo + "\n, totpPginas=" + totpPginas + "]";
    }







    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotpPginas() {
        return totpPginas;
    }
    public void setTotpPginas(int totpPginas) {
        this.totpPginas = totpPginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAnual) {
        this.pagAtual = pagAnual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }



    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int p) {
        if(p>this.getTotpPginas()){
            this.setPagAtual(0);
        }
        else{
            this.setPagAtual(p);
        }
    }
    @Override
    public void avancaPag() {
       this.setPagAtual(getPagAtual() +1);
    }
    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() -1);
    }


    
}
