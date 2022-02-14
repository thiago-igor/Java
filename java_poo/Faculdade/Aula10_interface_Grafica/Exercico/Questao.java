package java_poo.Faculdade.Aula10_interface_Grafica.Exercico;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao extends JFrame {
    // Cadastros
    String[] usuariosCadastrados = new String[] {
        "fulano", "beltrano", "admin"
    };
    String[] senhasCadastradas = new String[] {
        "ful35", "tran40", "sal1000"
    };

    //Componentes
    private JLabel lbUsuario;
    private JLabel lbSenha;

    //Campo de texto:
    private JTextField tfUsuario;
    private JPasswordField tfSenha;

    //botoes:
    private JButton btLogin;
    private JButton btSair;


    public Questao(){
        setTitle("Autentificacao");// titulo
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);// fechar janela
        initComponents(); // chamando funçao
        setVisible(true); // visualizar janela 
    }

    private void initComponents(){
        // layout
        setLayout(null);// layout nulo
        setLocationRelativeTo(null); // com o "null" nossa janela abre no centro da tela
        setResizable(false); // com esse falso nao podemos maximizar a tela

        //Componentes:
        lbUsuario = new JLabel("Usuario:"); // escrevendo
        lbSenha = new JLabel("Senha:"); // escrevendo


        //Campo de texto
        tfUsuario = new JTextField(); // caixa de texto
        tfSenha = new JPasswordField();//caixa de texto com letras camufladas de senha 

        //Botões:
        btLogin = new JButton("Login");
        btSair = new JButton("Sair");

        //Adicionar Componentes:
        add(lbUsuario); add(lbSenha);
        add(tfUsuario); add(tfSenha);
        add(btLogin); add(btSair);

        // Configurar posioes dos componentes
		lbUsuario.setBounds(10, 10, 70, 10);
		lbSenha.setBounds(10, 35, 70, 10);
		tfUsuario.setBounds(80, 9, 195, 17);
		tfSenha.setBounds(80, 34, 195, 17);
        btLogin.setBounds(10, 85, 125, 20);
		btSair.setBounds(150, 85, 125, 20);

        //Configurar eventos:
        // evento login:
        tfUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tfSenha.requestFocus(); // passa para "senha" Quando apertamos "enter"      
            }
        });

        //evento senha:
        tfSenha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btLogin.doClick(); // simula o botao login com o "Enter"
            }
        });

        // evento no botao de login:
        btLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(estaCadastrado( tfUsuario.getText(), tfSenha.getPassword())){
                    JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto", "Falha na autenticacao", JOptionPane.ERROR_MESSAGE);
                }
			}
            private boolean estaCadastrado(String usuario, char[] senha){
                String strSenha = String.valueOf(senha); // valueOf: transforma char em string
                for(int c=0; c<usuariosCadastrados.length; c++){
                    if( usuariosCadastrados[c].equals(usuario) && senhasCadastradas[c].equals(strSenha) )                      
                        return true;  
                }
                return false;
            }

        });
        


    }


    public static void main(String[] args) {
        new Questao();
    }
}
