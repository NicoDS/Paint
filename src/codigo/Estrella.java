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
    
    public Estrella(int x, int y, int alto, int ancho, Color colori, boolean rellenoi){
        
        addPoint(x - ancho/2, y - ancho/2);
        addPoint(x - ancho/2, y - alto - ancho/2);
        addPoint(x + ancho - ancho/2, y - alto - ancho/2);
        addPoint(x + ancho - ancho/2, y - ancho/2);
        addPoint(x + (ancho*2) - ancho/2, y - ancho/2);
        addPoint(x + (ancho*2) - ancho/2, y + alto - ancho/2);
        addPoint(x + ancho - ancho/2, y + alto - ancho/2);
        addPoint(x + ancho - ancho/2, y + (alto*2)- ancho/2);
        addPoint(x - ancho/2, y + (alto*2)- ancho/2);
        addPoint(x - ancho/2, y + alto - ancho/2);
        addPoint(x - ancho - ancho/2, y + alto - ancho/2);
        addPoint(x - ancho - ancho/2, y - ancho/2);
    }
}
