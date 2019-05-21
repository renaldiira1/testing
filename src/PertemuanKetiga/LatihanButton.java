/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Renaldi Irawan
 */
public class LatihanButton {
    private static Frame f;
    private static Button b;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        f = new Frame("Coba Komponen Button");
        b = new Button("Klik Me");
        b.setActionCommand("Pencet Tombol");
        b.addActionListener(new ButtonHandler());
        
        f.add(b);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    private static class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(""+e.getActionCommand());
            System.out.println("Tombol telah di tekan");
        }
    }

    }
