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
 * @author Administrator
 */
public class Cuadrado extends Polygon{
    public Color color = null;
    public boolean relleno = false;
    public int ancho = 0;
    public int alto = 0;
    
    public Cuadrado(int x, int y, int altoi, int anchoi, Color colori, boolean rellenoi){
        this.npoints = 4;
        ancho = anchoi;
        alto = altoi;
        this.xpoints[0] = x;
        this.ypoints[0] = y;
        
        this.xpoints[1] = xpoints[0] + ancho;
        this.ypoints[1] = ypoints[0];
        
        this.xpoints[2] = xpoints[0] + ancho;
        this.ypoints[2] = ypoints[0] + alto;
        
        this.xpoints[3] = xpoints[0];
        this.ypoints[3] = ypoints[0] + alto;
        
        this.color = colori;
        this.relleno = rellenoi;
    }
    public void pintar(Graphics2D g2){
        g2.setColor(this.color);
            if(this.relleno){
                g2.fill(this);
            }
            else{
                g2.draw(this);
            }
    }
}
