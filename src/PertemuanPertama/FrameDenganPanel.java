/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPertama;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author Renaldi Irawan
 */
public class FrameDenganPanel extends Frame{

    /**
     * @param args the command line arguments
     */
    
    private FrameDenganPanel(String Frame_Dengan_Panel){
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        FrameDenganPanel fp = new FrameDenganPanel("Frame Dengan Panel");
        Panel pan = new Panel();
        
        fp.setSize(1600, 1024);
        fp.setBackground(Color.red);
        fp.setLayout(null);
        pan.setSize(500, 500);
        pan.setBackground(Color.white);
        pan.setLocation(150, 150);
        
        fp.add(pan);
        fp.setVisible(true);
        
    }

   
    
}
