package java_poo.Faculdade.aula8_Polimofismo.Atividade.questao5;

public class Produto {
    private String nome;
    private String descricao;
    private float preco;

    public Produto(String nome, String descricao, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
  
    
    @Override
    public String toString() {
        return "\nProduto: " + nome + "\nDescricao: " + descricao + "\nRS: " + preco + "\n--------";
    }


    @Override
    public boolean equals(Object obj) { // usado para comparar objetos com o comando ".equals"
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
            return false;
        return true;
    }
}
