/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Renaldi Irawan
 */
public class TestButton {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Frame f = new Frame("Testing");
        Button a = new Button("1");
        Button b = new Button("2");
        
        a.addActionListener(new ButtonKiri());
        b.addActionListener(new ButtonKanan());
        f.add(a, BorderLayout.WEST);
        f.add(b, BorderLayout.EAST);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    private static class ButtonKiri implements ActionListener {

        public ButtonKiri() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ini adalah button barisan kiri");
            System.out.println("Label Button : " +e.getActionCommand());
        }
    }

    private static class ButtonKanan implements ActionListener {

        public ButtonKanan() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
             System.out.println("Ini adalah button barisan kanan");
            System.out.println("Label Button : " +e.getActionCommand());
        }
    }
    
}
