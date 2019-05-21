/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;
import java.awt.*;
/**
 *
 * @author Renaldi Irawan
 */
public class LayoutKompleks {
    private Frame f;
    private Panel p;
    private Button bw, bc;
    private Button bFile, bHelp;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LayoutKompleks lk = new LayoutKompleks();
        lk.tampil();
    }

    private void tampil() {
        
        //Buat Objek dari frame dan button
        f = new Frame("Aneka Layout");
        bw = new Button("Kiri");
        bc = new Button("Area Kerja");
        
        //Masukkan button kedalam frame
        f.add(bw, BorderLayout.WEST);
        f.add(bc, BorderLayout.CENTER);
        
        //buat objek dari panel
        p = new Panel();
        p.setBackground(Color.BLACK);
        
        //buat objek dari button
        bFile = new Button("File");
        bHelp = new Button("Help");
        
        //masukkan button kedalam panel
        p.add(bFile);
        p.add(bHelp);
        
        //masukkan panel kedalam frame
        f.add(p, BorderLayout.NORTH);
        f.setSize(500, 500);
        f.setVisible(true);
        
        
    }
    
}
