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
public class LayoutGrid {
    
    private Frame f;
    private Button b1, b2, b3, b4, b5, b6;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        LayoutGrid contohGrid = new LayoutGrid();
        contohGrid.tampil();
    }

    private void tampil() {
        f = new Frame("Grid Layout");
        f.setLayout(new GridLayout(3,2));
        
        b1 = new Button("1");
        b1.setBackground(Color.CYAN);
        b2 = new Button("2");
        b2.setBackground(Color.MAGENTA);
        b3 = new Button("3");
        b3.setBackground(Color.MAGENTA);
        b4 = new Button("4");
        b4.setBackground(Color.CYAN);
        b5 = new Button("5");
        b5.setBackground(Color.CYAN);
        b6 = new Button("6");
        b6.setBackground(Color.MAGENTA);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.setSize(400, 400);
        f.setVisible(true);
        
    }
    
}
