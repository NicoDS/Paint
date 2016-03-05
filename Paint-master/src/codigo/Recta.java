/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;


/**
 *
 * @author:Nicolás Domínguez Smeed 1º DAM
 */

public class Recta extends Polygon{
    public Color color = null;
    public int posX = 0;
    public int posY = 0;
    public Recta(int x, int y,int tamaño, int ancho, int alto, Color color){
        //linea continua
        this.npoints = 2;
        
        this.xpoints[0] = x;
        this.ypoints[0] = y;
        this.ypoints[1] = y + alto;
        this.xpoints[1] = x + ancho;
        this.color = color;  


 
    }

    Recta(int x, int y, int i, int i0, Color colorElegido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
 
    
        public void pintaYColorea(Graphics2D g2){
        g2.setColor(this.color);           
        g2.draw(this);
            
    }
            
    }

