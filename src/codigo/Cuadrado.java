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
public class Cuadrado extends Polygon{
    public Color color = null;
    public boolean relleno = false;
    public int ancho = 0;
    public int alto = 0;
    
    public Cuadrado(int x, int y, int alto, int ancho, Color color, boolean relleno){
        
        this.npoints = 4;
        ancho = ancho;
        alto = alto;
        this.xpoints[0] = x;
        this.ypoints[0] = y;
        
        this.xpoints[1] = x + ancho;
        this.ypoints[1] = y;
        
        this.xpoints[2] = x + ancho;
        this.ypoints[2] = y + alto;
        
        this.xpoints[3] = x;
        this.ypoints[3] = y + alto;
        
        this.color = color;
        this.relleno = relleno;
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
