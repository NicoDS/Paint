/*
 * La clase permite almacenar un circulo.
   Además de su posicion en la pantalla, si está relleno o no,
   su color, etc.
 */
package codigo;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Carlos Hernández
 */
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Circulo(int x, int y, int radius, Color colori, boolean rellenoi){
        this.x = x - radius/2;
        this.y = y - radius/2;
        this.width = radius;
        this.height = radius;
        this.color = colori;
        this.relleno = rellenoi;
    }
}
