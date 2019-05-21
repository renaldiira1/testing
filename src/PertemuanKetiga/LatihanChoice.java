/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Choice;
import java.awt.Frame;

/**
 *
 * @author Renaldi Irawan
 */
public class LatihanChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Latihan Choice");
        Choice c = new Choice();
        
        c.add("Satu");
        c.add("Dua");
        c.add("Tiga");
        c.setEnabled(true);
        
        f.add(c);
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
}
