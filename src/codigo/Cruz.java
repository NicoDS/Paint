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
    public int puntoInicioX = 0;
    public int puntoInicioY = 0;
    
    public Cruz(int x, int y, int alto, int ancho, Color colori, boolean rellenoi){
        puntoInicioX = x;
        puntoInicioY = y;
        addPoint(x, y );
        addPoint(x, y - alto );
        addPoint(x + ancho , y - alto );
        addPoint(x + ancho , y );
        addPoint(x + (ancho*2) , y );
        addPoint(x + (ancho*2) , y + alto);
        addPoint(x + ancho, y + alto );
        addPoint(x + ancho , y + (alto*2));
        addPoint(x , y + (alto*2));
        addPoint(x , y + alto );
        addPoint(x - ancho , y + alto );
        addPoint(x - ancho , y );
        
        
//        this.xpoints[0] = x - ancho/2;
//        this.ypoints[0] = y - ancho/2;
//        
//        this.xpoints[1] = x - ancho/2;
//        this.ypoints[1] = y - alto - ancho/2;
//        
//        this.xpoints[2] = x + ancho - ancho/2;
//        this.ypoints[2] = y - alto - ancho/2;
//        
//        this.xpoints[3] = x + ancho - ancho/2 ;
//        this.ypoints[3] = y - ancho/2;
//        
//        this.xpoints[4] = x + (ancho*2) - ancho/2 ;
//        this.ypoints[4] = y - ancho/2;
//        
//        this.xpoints[5] = x + (ancho*2) - ancho/2 ;
//        this.ypoints[5] = y + alto - ancho/2;
//        
//        this.xpoints[6] = x + ancho - ancho/2 ;
//        this.ypoints[6] = y + alto - ancho/2;
//        
//        this.xpoints[7] = x + ancho - ancho/2 ;
//        this.ypoints[7] = y + (alto*2)- ancho/2;
//        
//        this.xpoints[8] = x - ancho/2 ;
//        this.ypoints[8] = y + (alto*2)- ancho/2;
//        
//        this.xpoints[9] = x - ancho/2 ;
//        this.ypoints[9] = y + alto - ancho/2;
//        
//        this.xpoints[10] = x - ancho - ancho/2 ;
//        this.ypoints[10] = y + alto - ancho/2;
//        
//        this.xpoints[11] = x - ancho - ancho/2;
//        this.ypoints[11] = y - ancho/2;
//        
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
