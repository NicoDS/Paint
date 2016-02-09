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
public class Cruz extends Polygon{
    public Color color = null;
    public boolean relleno = false;
    
    public Cruz(int x, int y, int alto, int ancho, Color colori, boolean rellenoi){
        this.npoints = 12;
        
        this.xpoints[0] = x - ancho/2;
        this.ypoints[0] = y - ancho/2;
        
        this.xpoints[1] = x - ancho/2;
        this.ypoints[1] = y + alto - ancho/2;
        
        this.xpoints[2] = x + ancho - ancho/2;
        this.ypoints[2] = y + alto - ancho/2;
        
        this.xpoints[3] = x + ancho - ancho/2;
        this.ypoints[3] = y - ancho/2;
        
        this.xpoints[4] = x + ancho - ancho/2 +1;
        this.ypoints[4] = y - ancho/2;
        
        this.xpoints[5] = x + ancho - ancho/2 +2;
        this.ypoints[5] = y - ancho/2;
        
        this.xpoints[6] = x + ancho - ancho/2 +3;
        this.ypoints[6] = y - ancho/2;
        
        this.xpoints[7] = x + ancho - ancho/2 +4;
        this.ypoints[7] = y - ancho/2;
        
        this.xpoints[9] = x + ancho - ancho/2 +5;
        this.ypoints[9] = y - ancho/2;
        
        this.xpoints[10] = x + ancho - ancho/2 +6;
        this.ypoints[10] = y - ancho/2;
        
        this.xpoints[11] = x + ancho - ancho/2 +7;
        this.ypoints[11] = y - ancho/2;
        
        this.xpoints[12] = x + ancho - ancho/2 +8;
        this.ypoints[12] = y - ancho/2;
        
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
