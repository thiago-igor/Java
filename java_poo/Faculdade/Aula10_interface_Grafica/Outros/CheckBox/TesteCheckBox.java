package java_poo.Faculdade.Aula10_interface_Grafica.Outros.CheckBox;

import javax.swing.JFrame;

public class TesteCheckBox extends JFrame {
    
    public TesteCheckBox(){
        setTitle("Teste CheckBox");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
    }

    private void initComponents(){

    }

    
    public static void main(String[] args) {
       new TesteCheckBox();
    }

}
