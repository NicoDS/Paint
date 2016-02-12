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
public class Estrella extends Polygon{
    public Color color = null;
    public boolean relleno = false;
    public int puntoInicioX = 0;
    public int puntoInicioY = 0;
    public Estrella(int x, int y, int alto, int ancho, Color colori, boolean rellenoi){
        puntoInicioX = x;
        puntoInicioY = y;
//        for(int i=0; i< 6; i++){
//            addPoint((int) (x + ancho*Math.cos(i * 2 * Math.PI/5)),
//                    (int) (y + ancho*Math.sin(i *2 * Math.PI/5)));
//        }
        addPoint((int) (x + ancho*Math.cos(0 * 2 * Math.PI/5)),
                    (int) (y + ancho*Math.sin(0 *2 * Math.PI/5)));
        addPoint((int) (x + ancho*Math.cos(2 * 2 * Math.PI/5)),
                    (int) (y + ancho*Math.sin(2 *2 * Math.PI/5)));
        addPoint((int) (x + ancho*Math.cos(4 * 2 * Math.PI/5)),
                    (int) (y + ancho*Math.sin(4 *2 * Math.PI/5)));
        addPoint((int) (x + ancho*Math.cos(1 * 2 * Math.PI/5)),
                    (int) (y + ancho*Math.sin(1 *2 * Math.PI/5)));
        addPoint((int) (x + ancho*Math.cos(3 * 2 * Math.PI/5)),
                    (int) (y + ancho*Math.sin(3 *2 * Math.PI/5)));

        
        color = colori;
        relleno = rellenoi;
        
//        addPoint(x, y);
//        addPoint(x, y);
//        addPoint(x + (ancho/2), y);
//        addPoint(x, y );
//        addPoint(x + (ancho), y);
//        addPoint(x + (ancho*2) - ancho/2, y + alto - ancho/2);
//        addPoint(x + ancho - ancho/2, y + alto - ancho/2);
//        addPoint(x + ancho - ancho/2, y + (alto*2)- ancho/2);
//        addPoint(x - ancho/2, y + (alto*2)- ancho/2);
//        addPoint(x - ancho/2, y + alto - ancho/2);
//        addPoint(x - ancho - ancho/2, y + alto - ancho/2);
//        addPoint(x - ancho - ancho/2, y - ancho/2);
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
