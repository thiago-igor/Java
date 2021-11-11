package java_poo.CursoEmVideo.aula10_herenca;

public class Teste {
    
    public static void main(String[] args){

        Aluno a1 = new Aluno("Thiago", 20, "M", 200345, "Ciencia Da Computacao"); // Preenchendo o construtor
        Professor p1 = new Professor("Sebastiao", 56, "M", "java script", 19900); // Preenchendo o construtor

        a1.fazerAniversario(); // Funçao soma +1 na idade do aluno (OBS: como esse metodo esta na classe MAE, tanto o prof, quanto o aluno podem fazer aniversario)

        p1.receberAumento(100); // Funçao aumenta o salario do prof em 100 reais (OBS: como esse metodo esta na classe professor, so o Professor pode acessa-lo) 

        a1.imprimirStatus(); // funçao imprime o status do construtor 
        p1.imprimirStatus(); // funçao imprime o status do construtor



    }

}
