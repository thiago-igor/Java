package java_poo.Faculdade.Aula10_interface_Grafica.janela_JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaPrimeiraJanela {
    
    public static void main (String[]args){

        JFrame frame = new JFrame(); // estamos utilizando o construtor "JFrame" fornecido pelo java

        frame.setTitle("Minha Primeira Janela:"); // titulo da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a janela
        frame.setSize(400, 300); // dimensão da janela

        JLabel label = new JLabel("hello world"); // usado para escrever na janela
        frame.add(label); // adicionando na janela

        frame.setVisible(true); // permite a visibilidade da janela 
    }
}
