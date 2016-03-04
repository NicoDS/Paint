/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author:Nicolás Domínguez Smeed 1º DAM
 */
public class Estrella extends Polygon{
    public Color color = null;
    public boolean relleno = false;
    public int puntoInicioX = 0;
    public int puntoInicioY = 0;
    public Estrella(int x, int y, int alto, int ancho, Color color, boolean relleno){
        
      
        puntoInicioX = x;
        puntoInicioY = y;
 
        
        color = color;
        relleno = relleno;
        

    }
    public void pintaYColorea (Graphics2D g2){
        g2.setColor(this.color);
            if(this.relleno){
                g2.fill(this);
            }
            else{
                g2.draw(this);
            }
    }
}
