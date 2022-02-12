package java_poo.Faculdade.Aula10_interface_Grafica.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora_MDC extends JFrame {
	
	// Rotulos
	private JLabel lbNumeroUm;
	private JLabel lbNumeroDois;
	private JLabel lbResultado;
	// Campos de texto
	private JTextField tfNumeroUm;
	private JTextField tfNumeroDois;
	private JTextField tfResultado;
	// Botoes
	private JButton btCalcular;
	private JButton btSair;
	
	public Calculadora_MDC() {
		setTitle("Calculadora MDC"); // titulo
        setSize(300, 150); // dimensao
        setDefaultCloseOperation(EXIT_ON_CLOSE); // fechar janela
        initComponents(); // chamando funçao
        setVisible(true); // visualizar janela 
	}
	
	private void initComponents() {
		setLayout(null);// layout nulo
        setResizable(false); // com esse falso nao podemos maximizar a tela
        setLocationRelativeTo(null); // janela abre no centro da tela 

		//criação dos componentes:
		lbNumeroUm = new JLabel("Numero 1:");
		lbNumeroDois = new JLabel("Numero 2:");
		lbResultado = new JLabel("Resultado:");

		// Campos de texto
		tfNumeroUm = new JTextField(); // caixa de texto
		tfNumeroDois = new JTextField(); // caixa de texto
		tfResultado = new JTextField(); // caixa de texto
		tfResultado.setEditable(false); // nao permite escrever em "Resultado"

		// Botoes
		btCalcular = new JButton("Calcular");
		btSair = new JButton("Sair");

		// Adicionar componentes
		add(lbNumeroUm); add(lbNumeroDois); add(lbResultado);
		add(tfNumeroUm); add(tfNumeroDois); add(tfResultado);
		add(btCalcular); add(btSair);

		// Configurar posioes dos componentes
		lbNumeroUm.setBounds(10, 10, 70, 10);
		lbNumeroDois.setBounds(10, 35, 70, 10);
		lbResultado.setBounds(10, 60, 70, 10);
		tfNumeroUm.setBounds(80, 9, 195, 17);
		tfNumeroDois.setBounds(80, 34, 195, 17);
		tfResultado.setBounds(80, 59, 195, 17);
		btCalcular.setBounds(10, 85, 125, 20);
		btSair.setBounds(150, 85, 125, 20);

		// Configurar eventos
		ManipuladoraDeEventos me = new ManipuladoraDeEventos();
		btCalcular.addActionListener(me); // faz o calculo do mdc toda vez que apertamos o botao "Calcular"
		tfNumeroUm.addActionListener(new ActionListener() { // classe anonima
			public void actionPerformed(ActionEvent e) {
				tfNumeroDois.requestFocus(); // muda o foco para o "Numero 2" apertando o "enter"
			}
		});

		tfNumeroDois.addActionListener(me);// retorna o calculo do mdc quando clicamos "enter"
		//maneira mais facil que a debaixo:

		/*
		tfNumeroDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btCalcular.doClick(); // simula o botao calcular quando aperta enter no"Numero 2"
			}
		});*/

		btSair.addActionListener(new ActionListener(){ //classe anonima 
			public void actionPerformed(ActionEvent e){
				dispose(); // fechar o programa 
			}
		});

	}
	
	// ouvinte 
	private class ManipuladoraDeEventos implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String numero1Str = tfNumeroUm.getText();
			String numero2Str = tfNumeroDois.getText();
			int numero1 = Integer.parseInt(numero1Str);
			int numero2 = Integer.parseInt(numero2Str);
			Calculadora calc = new Calculadora();
			int resultado = calc.mdc(numero1, numero2);
			tfResultado.setText(""+resultado);
			}
			
		}
		
	
	public static void main(String[] args) {
		new Calculadora_MDC();	
	}

}
