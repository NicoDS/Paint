/*
 * La clase permite almacenar un circulo.
   Además de su posicion en la pantalla, si está relleno o no,
   su color, etc.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author:Nicolás Domínguez Smeed 1º DAM
 */
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    
     public Circulo (int x, int y, int radio,  Color color, boolean relleno){
        this.x = x - radio/2;
        this.y = y - radio/2;
        this.width = radio;
        this.height = radio;
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
