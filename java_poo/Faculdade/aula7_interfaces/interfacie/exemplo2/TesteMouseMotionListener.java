package java_poo.Faculdade.aula7_interfaces.interfacie.exemplo2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;

import java_poo.Faculdade.aula7_Classes_Abstratas.Exemplos_aula.override.main;

public class TesteMouseMotionListener extends JFrame implements MouseMotionListener {
    
    public TesteMouseMotionListener(){
        setTitle("TesteMouseMotionListener"); // titulo
        setSize(400,300); // dimençao
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para fechar o programa
        JLabel label1 = new JLabel("teste");
        add(label1); // escrevendo na janela
        addMouseMotionListener(this);
        setVisible(true); // para janela aparecer
    }

    public static void main(String[] args) {
        new TesteMouseMotionListener(); // chamando o metodo da janela
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Arrastado: "+e.getX()+", "+e.getY());
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moved: "+e.getX()+", "+e.getY());
        
    }

}
