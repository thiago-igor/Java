package java_poo.Faculdade.Aula10_interface_Grafica.janela_JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaSegundaJanela extends JFrame { // maneira mais recomendada de usar a JFrame!!!
    
    public MinhaSegundaJanela(){
        // obs: "set" Esta sendo usado para acessar os termos da Jframe que esta sendo herdada 
        setTitle("Minha Segunda Janela"); // escreve o titulo
        setSize(400, 300); // Dimensão da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // fecha a janela
        initComponents(); // chama o metodo construido a baixo
        setVisible(true); // da a vizibilidade da janela
    }


    private void initComponents(){ // metodo onde organizamos o que queremos pô na janela
        JLabel label = new JLabel("Hello world"); // escrevendo
        add(label); // adicionando
    }

    public static void main (String[] args){
        new MinhaSegundaJanela(); // executando o codigo 
    }

}
