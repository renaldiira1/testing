/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Renaldi Irawan
 */
public class ContohEvent implements MouseMotionListener, MouseListener{
    private Frame f;
    private  TextField tf;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContohEvent eve = new ContohEvent();
        eve.tampil();
    }

    private void tampil() {
        //Buaat Objek Frame
        f = new Frame("Contoh penggunaan Event");
        
        //Tambahkan label "Click and Drag Mouse" dibagian atas
        f.add(new Label("Click and Drag Mouse"), BorderLayout.NORTH);
        
        //Buat objek textField
        tf = new TextField(30);
        
        //masukka TextField kedalam bagian bawah
        f.add(tf, BorderLayout.SOUTH);
                
        //ta,bahkan MouseMotionListener
        f.addMouseMotionListener(this);
        
        //tambahkan MouseListener
        f.addMouseListener(this);
        
        f.setSize(300, 200);
        f.setVisible(true);
        f.setBackground(Color.GREEN);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       String s = "Mouse digerakkan ke posisi X : "+e.getX()+" dan Y : "+e.getY();
       tf.setText(s);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String s = "Mouse telah masuk kedalam ruangan";
        tf.setText(s);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String s = "Mouse telah meninggalkan ruangan ini";
        tf.setText(s);
    }

    
}
