/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author Renaldi Irawan
 */
public class LatihanKanvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Latihan Kanvas");
        Canvas cv = new Canvas();
        Color warna = new Color(200, 100, 0);
        cv.setBackground(warna);
        f.add(cv, BorderLayout.CENTER);
        f.setSize(200, 200);
        f.setVisible(true);
        }
    
}
