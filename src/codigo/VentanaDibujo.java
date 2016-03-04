/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.geom.Line2D;
import javax.swing.ImageIcon;
/**
 *
 * @author:Nicolás Domínguez Smeed 1º DAM
 */
public class VentanaDibujo extends javax.swing.JFrame {
  
    private static int DIMENSION_ARRAY = 8;
    //imagen en la que pintaré los círculos
    //es una variable parecida a un Image pero acelerado    
    BufferedImage buffer = null;
    int forma = 0;
    //color por defecto 
    Color colorElegido = Color.BLACK;
    
   
   

    boolean rellenar = false;
    
    
    
    boolean linea1 = false;
    int lineax1 = 0;
    int lineay1 = 0;
    int posx = 0;
    int posy = 0;
    
    




 Color colorFondo = Color.WHITE;

//variables para almacenar la posición en la que empieza a dibujar la figura
    int puntoX = 0;
    int puntoY = 0;
    
    
    int k = 0;
    

    ArrayList listaFormas = new ArrayList();
    /**
     * Creates new form VentanaDibujo
     */
    public VentanaDibujo() {
        initComponents();
        buffer = (BufferedImage) pizarra.createImage(pizarra.getWidth(), pizarra.getHeight());
        buffer.createGraphics();
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        g2.setColor(colorFondo);
        g2.fillRect(0, 0, pizarra.getWidth(), pizarra.getHeight());
       
        //Añade el título Paint
        setTitle("Paint");
        //No te permite agrandar el paint
        setResizable(false);
         //cambia el icono de java por uno que añado
        setIconImage(new ImageIcon(getClass().getResource("/paint.JPG")).getImage());
        
    }
    
    private boolean chequeaPunto(int x, int y){
        boolean contiene = false;
        int i = 0;
        while(i < listaFormas.size()){
            if(((Shape) listaFormas.get(i)).contains(x,y)){
               contiene = true; 
            }
            
            i++;
        }
        return contiene;
        
    }
    
        
    
    
    @Override
    public void paint(Graphics g){
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        g2.setColor(colorFondo);
        g2.fillRect(0, 0, pizarra.getWidth(), pizarra.getHeight());
        int j = 0;
        while(j < listaFormas.size()){
            if(listaFormas.get(j) instanceof Circulo){
                 ((Circulo) listaFormas.get(j)).pintaYColorea(g2);
            }
            if(listaFormas.get(j) instanceof Triangulo){
                 ((Triangulo) listaFormas.get(j)).pintaYColorea(g2);
            }
            if(listaFormas.get(j) instanceof Cuadrado){
                 ((Cuadrado) listaFormas.get(j)).pintaYColorea(g2);
            }
            if(listaFormas.get(j) instanceof Rombo){
                 ((Rombo) listaFormas.get(j)).pintaYColorea(g2);
            }
            if(listaFormas.get(j) instanceof Cruz){
                 ((Cruz) listaFormas.get(j)).pintaYColorea(g2);
            }
            if(listaFormas.get(j) instanceof Estrella){
                 ((Estrella) listaFormas.get(j)).pintaYColorea(g2);
            }
            if(listaFormas.get(j) instanceof Recta){
                 ((Recta) listaFormas.get(j)).pintaYColorea(g2);
            }
            j++;
        }
        g2 = (Graphics2D) pizarra.getGraphics();
        g2.drawImage(buffer, 0, 0, pizarra.getWidth(), pizarra.getHeight(), null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        BotonAceptar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        pizarra = new javax.swing.JPanel();
        deshacer = new javax.swing.JButton();
        borrar_todo = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        triangulo = new javax.swing.JButton();
        circulo = new javax.swing.JButton();
        color = new javax.swing.JButton();
        cuadrado = new javax.swing.JButton();
        rombo = new javax.swing.JButton();
        cruz = new javax.swing.JButton();
        estrella = new javax.swing.JButton();
        Recta = new javax.swing.JButton();
        relleno = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        guardar = new javax.swing.JMenuItem();

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonAceptarMousePressed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(BotonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCancelar)
                .addGap(144, 144, 144))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptar)
                    .addComponent(BotonCancelar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pizarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pizarraMouseDragged(evt);
            }
        });
        pizarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pizarraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pizarraLayout = new javax.swing.GroupLayout(pizarra);
        pizarra.setLayout(pizarraLayout);
        pizarraLayout.setHorizontalGroup(
            pizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pizarraLayout.setVerticalGroup(
            pizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        deshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deshacer.JPG"))); // NOI18N
        deshacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deshacerMousePressed(evt);
            }
        });

        borrar_todo.setText("Borrar todo");
        borrar_todo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borrar_todoMousePressed(evt);
            }
        });

        jSlider1.setMaximum(300);
        jSlider1.setMinimum(2);
        jSlider1.setValue(20);
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider1MousePressed(evt);
            }
        });

        jLabel1.setText("20");

        triangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triangulo.gif"))); // NOI18N
        triangulo.setMaximumSize(new java.awt.Dimension(293, 159));
        triangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                trianguloMousePressed(evt);
            }
        });

        circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CIRCULO.png"))); // NOI18N
        circulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                circuloMousePressed(evt);
            }
        });

        color.setText("Color");
        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorMousePressed(evt);
            }
        });

        cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuadrado.jpg"))); // NOI18N
        cuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuadradoMousePressed(evt);
            }
        });

        rombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rombo.png"))); // NOI18N
        rombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                romboMousePressed(evt);
            }
        });

        cruz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cruz.jpg"))); // NOI18N
        cruz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cruzMousePressed(evt);
            }
        });

        estrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Estrella.png"))); // NOI18N
        estrella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                estrellaMousePressed(evt);
            }
        });

        Recta.setText("Recta");
        Recta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RectaMousePressed(evt);
            }
        });

        relleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rellenar.JPG"))); // NOI18N
        relleno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rellenoMousePressed(evt);
            }
        });

        archivo.setText("Archivo");

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        guardar.setText("Guardar");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarMousePressed(evt);
            }
        });
        archivo.add(guardar);

        jMenuBar1.add(archivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deshacer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cruz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Recta)
                        .addGap(18, 18, 18)
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(relleno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(borrar_todo)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pizarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cruz, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(borrar_todo)
                        .addComponent(jLabel1)
                        .addComponent(color)
                        .addComponent(Recta)
                        .addComponent(relleno))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deshacer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addComponent(pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pizarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pizarraMousePressed
        posx= evt.getX();
        posy= evt.getY();
        k = 0;
        if(rellenar){
            if(chequeaPunto(evt.getX(),evt.getY())){
            int j = 0;
        while(j < listaFormas.size()){
            if(((Shape) listaFormas.get(j)).contains(evt.getX(),evt.getY())){
               if(listaFormas.get(j) instanceof Circulo){
                 ((Circulo) listaFormas.get(j)).relleno = true;
                 ((Circulo) listaFormas.get(j)).color = colorElegido;
            }
            if(listaFormas.get(j) instanceof Triangulo){
                 ((Triangulo) listaFormas.get(j)).relleno = true;
                 ((Triangulo) listaFormas.get(j)).color = colorElegido;
            }
            if(listaFormas.get(j) instanceof Cuadrado){
                 ((Cuadrado) listaFormas.get(j)).relleno = true;
                 ((Cuadrado) listaFormas.get(j)).color = colorElegido;
            }
            if(listaFormas.get(j) instanceof Rombo){
                 ((Rombo) listaFormas.get(j)).relleno = true;
                 ((Rombo) listaFormas.get(j)).color = colorElegido;
            }
            if(listaFormas.get(j) instanceof Cruz){
                 ((Cruz) listaFormas.get(j)).relleno = true;
                 ((Cruz) listaFormas.get(j)).color = colorElegido;
            }
            if(listaFormas.get(j) instanceof Estrella){
                 ((Estrella) listaFormas.get(j)).relleno = true;
                 ((Estrella) listaFormas.get(j)).color = colorElegido;
            }
            }
            
            j++;
        }
        }
            else{
                colorFondo = colorElegido;
            }
        }
         //Figuras sin relleno por defecto 
        else{
            switch (forma){
            case 0 : listaFormas.add(new Circulo(evt.getX(),evt.getY(), 1, colorElegido, false)); break;
            case 1 : listaFormas.add(new Triangulo(evt.getX(),evt.getY(), 1, 1, colorElegido, false)); break;
            case 2 : listaFormas.add(new Cuadrado(evt.getX(),evt.getY(), 1, 1, colorElegido, false)); break;
            case 3 : listaFormas.add(new Rombo(evt.getX(),evt.getY(), 1, 1, colorElegido, false)); break;
            case 4 : listaFormas.add(new Cruz(evt.getX(),evt.getY(), 1, 1, colorElegido, false)); break;
            case 5 : listaFormas.add(new Estrella(evt.getX(),evt.getY(), 1, 1, colorElegido, false)); break;
            case 6 : listaFormas.add(new Recta(evt.getX(),evt.getY(),1,1,jSlider1.getValue(), colorElegido)); break;
                
            }
        }


        repaint();
    }//GEN-LAST:event_pizarraMousePressed

    private void pizarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pizarraMouseDragged

        if(!rellenar){
        switch(forma){
            
            case 0:{
                Circulo aux = (Circulo) listaFormas.get(listaFormas.size() -1);
                
                int ancho = 1;
                int alto = 1;
                if(evt.getX() > (int) posx){
                    ancho = (int) (evt.getX() - aux.x);
                    alto = (int) (evt.getY() - aux.y);
                    aux.width = ancho;
                    aux.height = alto;
                }else{
                    ancho = (int) (posx - aux.x);
                    alto = (int) (posy - aux.y);    
                    aux.x = evt.getX();
                    aux.y = evt.getY();
                    aux.width = Math.abs(ancho);
                    aux.height = Math.abs(alto);
                }
                
            }break;
            
                case 1:{
                Triangulo aux = (Triangulo) listaFormas.get(listaFormas.size() -1);
                int ancho = 1;
                int alto = 1;
                int puntoX = aux.xpoints[0];
                int puntoY = aux.ypoints[0];
                ancho = (int) (evt.getX() - puntoX);
                alto = (int) (evt.getY() - puntoY);
                aux.xpoints[1] = puntoX + ancho;
                  //aux.ypoints[1] = puntoY + alto;  //Para tener un triángulo inclinado
                aux.xpoints[2] = puntoX + ancho/2;
                aux.ypoints[2] = puntoY + alto;
                
                
                
            }break;
            
                case 2:{
                Cuadrado aux = (Cuadrado) listaFormas.get(listaFormas.size() -1);
                int ancho = 1;
                int alto = 1;
                int puntoX = aux.xpoints[0];
                int puntoY = aux.ypoints[0];
                
                
                ancho = (int) (evt.getX() - puntoX);
                alto = (int) (evt.getY() - puntoY);
                aux.xpoints[1] = puntoX + ancho;
                    
                aux.xpoints[2] = puntoX + ancho;
                aux.ypoints[2] = puntoY + alto;
                    
                aux.ypoints[3] = puntoY + alto;
                    
                
            }break;
            
                case 3:{
                
                
                Rombo aux = (Rombo) listaFormas.get(listaFormas.size() -1);
                int ancho = 1;
                int alto = 1;
                if(k == 0){
                    puntoX = aux.xpoints[0];
                    puntoY = aux.ypoints[0];
                    k++;
                }
                ancho = (int) (evt.getX() - puntoX);
                alto = (int) (evt.getY() - puntoY);
                aux.xpoints[0] = puntoX + (ancho/2);
                
                aux.ypoints[1] = puntoY + (alto/2);
                
                aux.xpoints[2] = puntoX + (ancho/2);
                aux.ypoints[2] = puntoY + alto;
                    
                aux.xpoints[3] = puntoX + ancho;
                aux.ypoints[3] = puntoY + (alto/2);
                    
                
            }break;
            
                case 4:{
                
                
                Cruz aux = (Cruz) listaFormas.get(listaFormas.size() -1);
                int ancho = 1;
                int alto = 1;
                if(k == 0){
                    puntoX = aux.puntoInicioX;
                    puntoY = aux.puntoInicioY;
                    k++;
                }


                ancho = (int) (evt.getX() - puntoX);
                alto = (int) (evt.getY() - puntoY);
                aux.reset(); 
                aux.addPoint(puntoX, puntoY);
                aux.addPoint(puntoX, puntoY - alto);
                aux.addPoint(puntoX + ancho, puntoY - alto);
                aux.addPoint(puntoX + ancho, puntoY);
                aux.addPoint(puntoX + (ancho*2), puntoY);
                aux.addPoint(puntoX + (ancho*2), puntoY + alto);
                aux.addPoint(puntoX + ancho, puntoY + alto);
                aux.addPoint(puntoX + ancho, puntoY + (alto*2));
                aux.addPoint(puntoX, puntoY + (alto*2));
                aux.addPoint(puntoX, puntoY + alto);
                aux.addPoint(puntoX - ancho, puntoY + alto);
                aux.addPoint(puntoX - ancho, puntoY);
            }break;
            
                case 5:{
                Estrella aux = (Estrella) listaFormas.get(listaFormas.size() -1);
                int ancho = 1;
                int alto = 1;
                if(k == 0){
                    puntoX = aux.puntoInicioX;
                    puntoY = aux.puntoInicioY;
                    k++;
                }
                ancho = (int) (evt.getX() - puntoX);
                alto = (int) (evt.getY() - puntoY);
                aux.reset();
                aux.addPoint((int) (puntoX + ancho*Math.cos(0 * 2 * Math.PI/5)),
                    (int) (puntoY + alto*Math.sin(0 *2 * Math.PI/5)));
                aux.addPoint((int) (puntoX + ancho*Math.cos(2 * 2 * Math.PI/5)),
                    (int) (puntoY + alto*Math.sin(2 *2 * Math.PI/5)));
                aux.addPoint((int) (puntoX + ancho*Math.cos(4 * 2 * Math.PI/5)),
                    (int) (puntoY + alto*Math.sin(4 *2 * Math.PI/5)));
                aux.addPoint((int) (puntoX + ancho*Math.cos(1 * 2 * Math.PI/5)),
                    (int) (puntoY + alto*Math.sin(1 *2 * Math.PI/5)));
                aux.addPoint((int) (puntoX + ancho*Math.cos(3 * 2 * Math.PI/5)),
                    (int) (puntoY + alto*Math.sin(3 *2 * Math.PI/5)));
                
            }break;
            
                case 6:{
                Recta aux = (Recta) listaFormas.get(listaFormas.size() -1);
                int ancho = 1;
                int alto = 1;
                int puntoX = aux.xpoints[0];
                int puntoY = aux.ypoints[0];
                
                
                ancho = (int) (evt.getX() - puntoX);
                alto = (int) (evt.getY() - puntoY);
                aux.xpoints[1] = puntoX + ancho;
                aux.ypoints[1] = puntoY + alto; 
                
                    
                
            }break;
            
        }
        
      
        repaint();
        }
    }//GEN-LAST:event_pizarraMouseDragged

    private void deshacerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshacerMousePressed
        if(listaFormas.size() > 0){
            listaFormas.remove(listaFormas.size()-1);
            repaint();
        }
 
    }//GEN-LAST:event_deshacerMousePressed

    private void borrar_todoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar_todoMousePressed
       listaFormas.clear();
       colorFondo = Color.WHITE;
       repaint();
    }//GEN-LAST:event_borrar_todoMousePressed

    private void jSlider1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MousePressed
        jLabel1.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1MousePressed

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
        jLabel1.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1MouseDragged

    private void trianguloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trianguloMousePressed
        forma = 1;
    }//GEN-LAST:event_trianguloMousePressed

    private void circuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circuloMousePressed
        forma = 0;
    }//GEN-LAST:event_circuloMousePressed

    private void colorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorMousePressed
        jDialog1.setSize(800, 600);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_colorMousePressed

    private void BotonAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAceptarMousePressed
        colorElegido = jColorChooser1.getColor();
        jDialog1.setVisible(false);
    }//GEN-LAST:event_BotonAceptarMousePressed

    private void cuadradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadradoMousePressed
        forma = 2;
    }//GEN-LAST:event_cuadradoMousePressed

    private void romboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_romboMousePressed
        forma = 3;
    }//GEN-LAST:event_romboMousePressed

    private void cruzMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cruzMousePressed
        forma = 4;
    }//GEN-LAST:event_cruzMousePressed

    private void estrellaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrellaMousePressed
        forma = 5;
    }//GEN-LAST:event_estrellaMousePressed

    private void guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMousePressed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("archivos de imagenes jpg","jpg"));
        jFileChooser1.setFileFilter( new FileNameExtensionFilter("archivos de imagenes png","png"));
        int seleccion = jFileChooser1.showSaveDialog(this);
        switch (seleccion){
            case JFileChooser.APPROVE_OPTION : {
                File fichero = jFileChooser1.getSelectedFile();
                String nombre = fichero.getName();
                String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());
                if(extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")){
                    try {
                ImageIO.write(buffer, "jpg", fichero);
            } catch (IOException ex) {
                Logger.getLogger(VentanaDibujo.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            
            }break;
        }
        
    }//GEN-LAST:event_guardarMousePressed

    private void RectaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectaMousePressed
          forma = 6;
    }//GEN-LAST:event_RectaMousePressed

    private void rellenoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rellenoMousePressed
                if(rellenar){
            rellenar = false;
        }
        else{
            rellenar = true;
        }
    }//GEN-LAST:event_rellenoMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDibujo().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton Recta;
    private javax.swing.JMenu archivo;
    private javax.swing.JButton borrar_todo;
    private javax.swing.JButton circulo;
    private javax.swing.JButton color;
    private javax.swing.JButton cruz;
    private javax.swing.JButton cuadrado;
    private javax.swing.JButton deshacer;
    private javax.swing.JButton estrella;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JPanel pizarra;
    private javax.swing.JButton relleno;
    private javax.swing.JButton rombo;
    private javax.swing.JButton triangulo;
    // End of variables declaration//GEN-END:variables
}
