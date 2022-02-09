package java_poo.Faculdade.Aula10_interface_Grafica.JTextField;

import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java_poo.Codigos_Uteis.Gerar_NumeroAleatorio.main;

public class Calculadora_MDC extends JFrame {
   
    public void Calculadora_MDC() {
        setTitle("Calculadora MDC"); // titulo
        setSize(500, 400); // dimensao
        setDefaultCloseOperation(EXIT_ON_CLOSE); // fechar janela
        initComponents(); // chamando funçao
        setVisible(true); // visualizar janela 
    }

    private void initComponents(){
        //criação dos componentes:
        JLabel lbNumeroUm = new JLabel("Numero 1:");
        JLabel lbNumeroDois = new JLabel("Numero 2:");
        JLabel lbResultado = new JLabel("Resultado:"); 

        // Configurar posições dos componentes
		lbNumeroUm.setBounds(10, 10, 70, 10);
		lbNumeroDois.setBounds(10, 35, 70, 10);
		lbResultado.setBounds(10, 60, 70, 10);
    }

    public static void main(String[] args) {
        new Calculadora_MDC(); // executando Calculadora_MDC
    }


}
