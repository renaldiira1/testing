/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPertama;

import java.awt.*;


/**
 *
 * @author Renaldi Irawan
 */
public class LayoutBorder {
    
    private Frame f;
    private Button bn, bs, bw, be, bc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     LayoutBorder contohBorder = new LayoutBorder();
     contohBorder.tampil();
    }

    private void tampil() {
        f = new Frame("Border Layout");
        bn = new Button("B1");
        bn.setBackground(Color.CYAN);
        bs = new Button("B2");
        bs.setBackground(Color.CYAN);
        bw = new Button("B3");
        bw.setBackground(Color.CYAN);
        be = new Button("B4");
        be.setBackground(Color.CYAN);
        bc = new Button("B5");
        bc.setBackground(Color.GREEN);
        
        f.add(bn, BorderLayout.NORTH);
        f.add(bs, BorderLayout.SOUTH);
        f.add(bw, BorderLayout.WEST);
        f.add(be, BorderLayout.EAST);
        f.add(bc, BorderLayout.CENTER);
        f.setSize(900,500);
        f.setVisible(true);
                
    }
    
}
