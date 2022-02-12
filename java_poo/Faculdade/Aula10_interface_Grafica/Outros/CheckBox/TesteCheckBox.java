package java_poo.Faculdade.Aula10_interface_Grafica.Outros.CheckBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
        // Configurar layout
		setLayout(new FlowLayout()); // agrupa os componentes a direita a medida que acaba linha e vai pulando
		setLocationRelativeTo(null); //centraliza a janela

        //Criando componentes:
        JLabel lbPergunta = new JLabel("Quais suas linguagens de programacao preferidas?");
        JCheckBox cbAssembly = new JCheckBox("Assembly");
        JCheckBox cbPlusPlus = new JCheckBox("Plus Plus");
        JCheckBox cbC = new JCheckBox("C");
        JCheckBox cbJava = new JCheckBox("Java");
        JCheckBox cbPHP = new JCheckBox("PHP");
		JButton btMostrar = new JButton("Mostre-me quais opcoes escolhi!");

		// Configurar eventos
        btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = "Opcoes selecionadas:\n";
				if (cbAssembly.isSelected())
					resultado += "Assembly\n";
				if (cbC.isSelected())
					resultado += "C\n";
				if (cbPlusPlus.isSelected())
					resultado += "C++\n";
				if (cbJava.isSelected())
					resultado += "Java\n";
				if (cbPHP.isSelected())
					resultado += "PHP";
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});

        // Adicionar componenentes
		add(lbPergunta);
		add(cbAssembly); add(cbC); add(cbPlusPlus); add (cbJava); add(cbPHP);
		add(btMostrar);
    }


    public static void main(String[] args) {
       new TesteCheckBox();
    }

}
