package java_poo.CursoEmVideo.aula11_Polimorfismo.Polimorfidmo_Sobrecarga;

public abstract class Animal1 {
        // Atributos de Animal
        protected float peso;
        protected int idade;
        protected int membros;
        protected String nome;

        public abstract void emitirSom();




        public float getPeso() {
            return peso;
        }
        public void setPeso(float peso) {
            this.peso = peso;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public int getMembros() {
            return membros;
        }
        public void setMembros(int membros) {
            this.membros = membros;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        
}
