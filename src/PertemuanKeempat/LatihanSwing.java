/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKeempat;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.border.*;

/**
 *
 * @author Renaldi Irawan
 */
public class LatihanSwing {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame swingFrame = new JFrame("SWING");
        swingFrame.setLayout(new GridLayout(2,2));
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        Border lineBorder1 = BorderFactory.createLineBorder(Color.ORANGE, 5);
        Border lineBorder2 = BorderFactory.createEtchedBorder(Color.YELLOW, Color.red);
        Border lineBorder3 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        Border lineBorder4 = BorderFactory.createDashedBorder(Color.BLUE);
        //button1.setSize(50, 50);
        button1.setBackground(Color.MAGENTA);
        button2.setBackground(Color.BLUE);
        button3.setBackground(Color.GREEN);
        button4.setBackground(Color.PINK);
        button1.setBorder(lineBorder1);
        button2.setBorder(lineBorder2);
        button3.setBorder(lineBorder3);
        button4.setBorder(lineBorder4);
        
        
        swingFrame.add(button1);
        swingFrame.add(button2);
        swingFrame.add(button3);
        swingFrame.add(button4);
        swingFrame.setSize(200, 200);
        swingFrame.setVisible(true);
    }

    private static void setLayout(GridLayout gridLayout) {
        
    }
    
}
