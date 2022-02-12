package java_poo.Faculdade.Aula10_interface_Grafica.Outros.JList;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TesteJList extends JFrame {
	
	public TesteJList() {
		setTitle("TesteJList");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		// Configurar layout
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		// Criar componentes
		JLabel lbPergunta = new JLabel("Qual sua linguagem de programacao preferida?");
		String[] elementos = new String[] {
			"Assembly", "C", "C++", "Java", "PHP"	
		};
		JList<String> lOpcoes = new JList<String>(elementos);
		lOpcoes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // SINGLE_SELECTION: so conseguimos selecionar 1 opção
		JButton btMostrar = new JButton("Mostre-me qual opcao escolhi!");
		// Configurar eventos
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = "Opcao selecionada:\n";
				resultado += lOpcoes.getSelectedValue();
				JOptionPane.showMessageDialog(null, resultado);
			}
		});
		// Adicionar componenentes
		add(lbPergunta);
		add(lOpcoes);
		add(btMostrar);
	}

	public static void main(String[] args) {
		new TesteJList();
	}

}
