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
 * @author Administrator
 */
public class Linea extends Polygon{
    public Color color = null;
    public int posx = 0;
    public int posy = 0;
    public Linea(int x, int y, int ancho, int alto, int tamaño, Color colori){
        this.npoints = 2;
        
        this.xpoints[0] = x;
        this.ypoints[0] = y;
        this.xpoints[1] = x + ancho;
        this.ypoints[1] = y + alto;
        this.color = colori;
//        this.x = x;
//        this.y = y;
//        this.posx = xdos;
//        this.posy = ydos;
//        i = x;
//        while(i < xdos){
//            componentes.add(new Circulo(i,y, tamaño, colori, true));
//            i++;
//        }
//    }
//    public void pintar(Graphics2D g2){
//        g2.setColor(this.color);
//        i = 0;
//        while(i < componentes.size()){
//            ((Circulo) componentes.get(i)).pintar(g2);
//            i++;
//        
    }
        public void pintar(Graphics2D g2){
        g2.setColor(this.color);           
        g2.draw(this);
            
    }
            
    }

