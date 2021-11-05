package java_poo.Faculdade.aula5.sobreescrita.questoes;

public class Teste {
    public static void main(String[] args){

        Hospital h1 = new Hospital("Sao Matheus", "Santus Dumont");

        Medico m1 = new Medico("Rubens", "Aldeota", 56, "0000", "M", true, "33245", 200000, "Cirurgiao geral", true);

        Paciente p1 = new Paciente("thiago", "papic", 20, "33344455500", "M", true, "nao possue", "nao sera necessario", true);

        h1.imprimirValores();
        m1.imprimirValores();
        p1.imprimirValores();
    }

}
