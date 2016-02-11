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
 * @author Carlos Hernández
 */
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Circulo(int x, int y, int radius, Color colori, boolean rellenoi){
        this.x = x;
        this.y = y;
        this.width = radius;
        this.height = radius;
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
