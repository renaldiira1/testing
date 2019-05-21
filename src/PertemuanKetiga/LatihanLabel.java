/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Renaldi Irawan
 */
public class LatihanLabel {
    static Label l;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Latihan Membuat Label");
        f.setLayout(new GridLayout(4,2));
        Checkbox satu = new Checkbox("Satu", true);
        Checkbox dua  = new Checkbox("Dua", true);
        Checkbox tiga = new Checkbox("Tiga", true);
        
         satu.addItemListener(new LatihanCheckBox.Handler());
        dua.addItemListener(new LatihanCheckBox.Handler());
        tiga.addItemListener(new LatihanCheckBox.Handler());
        
        l = new Label();
        f.add(satu);
        f.add(dua);
        f.add(tiga);
        f.add(l);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
    static class Handler implements ItemListener{
           
        @Override
        public void itemStateChanged(ItemEvent e) {
            String pilih = "Tidak";
            if(e.getStateChange() == ItemEvent.SELECTED){
                pilih = "Ya";
                
            }
            l.setText(pilih);
            System.out.println("  " + pilih);
        }
    }
}
