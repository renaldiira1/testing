/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKeempat;

import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Renaldi Irawan
 */
public class ContohTabbedPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat frame        
        JFrame f = new JFrame("Menggunakan Tabbed Pane");
        
        //Membuat tabbed pane
        JPanel panel1 = new JPanel();
        JTabbedPane tabPane = new JTabbedPane();
        
        /*
        * Parameter 1 = Tittle
        * Parameter 2 = icon
        * Parameter 3 = component
        * Parameter 4 = tips
        */
        tabPane.addTab("First",null, panel1, "Official Info");
        
        //Menambahkan button ke tab pada tabbed pane
        JButton button1 = new JButton("Panel Pertama");
        panel1.add(button1);
        
        JPanel panel2 = new JPanel();
        tabPane.addTab("Second",null, panel2, "Secondary Info");
        
        //Menambahkan button2 ke tab pada tabbed pane
        JButton button2 = new JButton("Panel Kedua");
        panel2.add(button2);
        
        f.getContentPane().add(tabPane);
        f.show();
        f.setSize(200, 200);
    }
    
}
