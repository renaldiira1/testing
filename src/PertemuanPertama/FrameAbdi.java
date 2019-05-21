/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPertama;

import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author Renaldi Irawan
 */
public class FrameAbdi extends Frame{

    /**
     * @param args the command line arguments
     */
    
    private FrameAbdi(String Ini_Frame_baru){
        
    }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        FrameAbdi fm = new FrameAbdi("Ini Frame baru");
        
        fm.setSize(1600, 1020);
        fm.setBackground(Color.cyan);
        fm.setVisible(true);
    }
    
}
