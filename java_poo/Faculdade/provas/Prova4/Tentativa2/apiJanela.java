package java_poo.Faculdade.provas.Prova4.Tentativa2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apiJanela extends JFrame {
    
    //Componentes:
    private JLabel lbMenssagem;
    private JLabel lbNome;
    private JLabel lbNascimento;
    private JLabel lbRg;
    private JLabel lbPergunta;

    //Campo de texto:
    private JTextField tfNome1;
    private JTextField tfNome2;
    private JTextField tfNome3;
    private JTextField tfNome4;
    private JTextField tfNome5;

    private JTextField tfNascimento1;
    private JTextField tfNascimento2;
    private JTextField tfNascimento3;
    private JTextField tfNascimento4;
    private JTextField tfNascimento5;

    private JTextField tfRg1;
    private JTextField tfRg2;
    private JTextField tfRg3;
    private JTextField tfRg4;
    private JTextField tfRg5;

    //botoes:
    private JButton btOrdenar;
    private JRadioButton JRNome;
    private JRadioButton JRNascimento;
    private JRadioButton JRRg;
    private ButtonGroup bg;

    public apiJanela(){
        setTitle("Teste de ordenacao com API Collections"); // titulo
        setSize(500, 315); // tamanho janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);// fechar janela
        initComponents(); // chamando funçao
        setVisible(true); // visualizar janela 
    }

    public void initComponents(){
        //layout:
        setLayout(null);// layout nulo
        setLocationRelativeTo(null); // com o "null" nossa janela abre no centro da tela

        //Componentes de texto:
        lbMenssagem = new JLabel("Preencha os campos com os dados de 5 pessoas:"); //escrevendo
        lbNome = new JLabel("Nome:"); //escrevendo
        lbNascimento = new JLabel("Data De Nascimento:");
        lbRg = new JLabel("RG:");
        lbPergunta = new JLabel("Escolha como os dados das pessoas devem ser ordenados:");


        //Campo de texto:
        tfNome1 = new JTextField();
        tfNome2 = new JTextField();
        tfNome3 = new JTextField();
        tfNome4 = new JTextField();
        tfNome5 = new JTextField();

        tfNascimento1 = new JTextField();
        tfNascimento2 = new JTextField();
        tfNascimento3 = new JTextField();
        tfNascimento4 = new JTextField();
        tfNascimento5 = new JTextField();

        tfRg1 = new JTextField();
        tfRg2 = new JTextField();
        tfRg3 = new JTextField();
        tfRg4 = new JTextField();
        tfRg5 = new JTextField();

        //botoes:
        btOrdenar = new JButton("Ordenar Agora");
        JRNome = new JRadioButton("Nome");
        JRNascimento = new JRadioButton("Data De Nascimento");
        JRRg = new JRadioButton("RG");
        bg = new ButtonGroup(); //grupo de botoes
        bg.add(JRNome); bg.add(JRNascimento); bg.add(JRRg); 
        bg.add(btOrdenar);


        //adicionar Componentes
        add(lbMenssagem); add(lbNome); add(lbNascimento); add(lbRg); add(lbPergunta);
        add(tfNome1);add(tfNome2);add(tfNome3);add(tfNome4);add(tfNome5);
        add(tfNascimento1);add(tfNascimento2);add(tfNascimento3);add(tfNascimento4);add(tfNascimento5);
        add(tfRg1);add(tfRg2);add(tfRg3);add(tfRg4);add(tfRg5);
        add(JRNome); add(JRNascimento); add(JRRg); 
        add(btOrdenar);

        // Configurar posioes dos componentes
        lbMenssagem.setBounds(20, 10, 300, 10);
        lbNome.setBounds(20, 35, 70, 10);
        lbNascimento.setBounds(200,35,120,10);
        lbRg.setBounds(360,35,50,10);
        lbPergunta.setBounds(5,180,345,10);

        tfNome1.setBounds(20, 50, 150, 17);
        tfNome2.setBounds(20,75,150,17);
        tfNome3.setBounds(20,100,150,17);
        tfNome4.setBounds(20,125,150,17);
        tfNome5.setBounds(20,150,150,17);

        tfNascimento1.setBounds(200,50,120,17);
        tfNascimento2.setBounds(200,75,120,17);
        tfNascimento3.setBounds(200,100,120,17);
        tfNascimento4.setBounds(200,125,120,17);
        tfNascimento5.setBounds(200,150,120,17);

        tfRg1.setBounds(360, 50, 100, 17);
        tfRg2.setBounds(360, 75, 100, 17);
        tfRg3.setBounds(360, 100, 100, 17);
        tfRg4.setBounds(360, 125, 100, 17);
        tfRg5.setBounds(360, 150, 100, 17);

        JRNome.setBounds(35,190,70,50);
        JRNascimento.setBounds(190,190,200,50);
        JRRg.setBounds(390,190,200,50);

        btOrdenar.setBounds(190,240,120,17);

        
        //Configurar eventos:
        tfNome1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNascimento1.requestFocus();
            }
        });
        tfNascimento1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfRg1.requestFocus();
            }
        });

        tfRg1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNome2.requestFocus();
            }
        });

        tfNome2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNascimento2.requestFocus();
            }
        });
        tfNascimento2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfRg2.requestFocus();
            }
        });

        tfRg2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNome3.requestFocus();
            }
        });

        tfNome3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNascimento3.requestFocus();
            }
        });
        tfNascimento3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfRg3.requestFocus();
            }
        });

        tfRg3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNome4.requestFocus();
            }
        });

        tfNome4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNascimento4.requestFocus();
            }
        });
        tfNascimento4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfRg4.requestFocus();
            }
        });

        tfRg4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNome5.requestFocus();
            }
        });

        tfNome5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfNascimento5.requestFocus();
            }
        });
        tfNascimento5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfRg5.requestFocus();
            }
        });

        tfRg5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btOrdenar.doClick();
            }
        });

        // evento no botao de ordenar
        btOrdenar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ordenado com Sucesso!!!");
            }
        });

    }

    public static void main(String[] args) {
        new apiJanela();
    } 


}
