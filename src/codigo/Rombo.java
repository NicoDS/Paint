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
public class Rombo extends Polygon{
    public Color color = null;
    public boolean relleno = false;
    
    public Rombo(int x, int y, int alto, int ancho, Color colori, boolean rellenoi){
        this.npoints = 4;
        
        this.xpoints[0] = x;
        this.ypoints[0] = y - ancho/2;
        
        this.xpoints[1] = x - ancho/2;
        this.ypoints[1] = y;
        
        this.xpoints[2] = x;
        this.ypoints[2] = y + alto - ancho/2;
        
        this.xpoints[3] = x + ancho - ancho/2;
        this.ypoints[3] = y;
        
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
