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
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class VentanaDibujo extends javax.swing.JFrame {
    
    private static int DIMENSION_ARRAY = 8;
    
    BufferedImage buffer = null;
    int forma = 0;
    Color colorElegido = Color.BLACK;
    boolean seleccionar = false;
    boolean a = false;
    int posx = 0;
    int posy = 0;
    
//    Circulo[] listaCirculos = new Circulo[DIMENSION_ARRAY];
    
//    ArrayList<Circulo> listaNuevaCirculos = new ArrayList();
    ArrayList listaFormas = new ArrayList();
    /**
     * Creates new form VentanaDibujo
     */
    public VentanaDibujo() {
        initComponents();
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer.createGraphics();
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        
    }
    
    private boolean chequeaPunto(int x, int y){
        boolean contiene = false;
        int j = 0;
        while(j < listaFormas.size()){
            if(((Shape) listaFormas.get(j)).contains(x,y)){
               contiene = true; 
            }
            
            j++;
        }
        return contiene;
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        int j = 0;
        while(j < listaFormas.size()){
            if(listaFormas.get(j) instanceof Circulo){
                 ((Circulo) listaFormas.get(j)).pintar(g2);
            }
            if(listaFormas.get(j) instanceof Triangulo){
                 ((Triangulo) listaFormas.get(j)).pintar(g2);
            }
            if(listaFormas.get(j) instanceof Cuadrado){
                 ((Cuadrado) listaFormas.get(j)).pintar(g2);
            }
            if(listaFormas.get(j) instanceof Rombo){
                 ((Rombo) listaFormas.get(j)).pintar(g2);
            }
            if(listaFormas.get(j) instanceof Cruz){
                 ((Cruz) listaFormas.get(j)).pintar(g2);
            }
            if(listaFormas.get(j) instanceof Estrella){
                 ((Estrella) listaFormas.get(j)).pintar(g2);
            }
            j++;
        }
        g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, jPanel1.getWidth(), jPanel1.getHeight(), null);
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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BotonColor = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jButton1.setText("Deshacer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
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

        jButton3.setText("T");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jButton4.setText("C");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        BotonColor.setText("Color");
        BotonColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonColorMousePressed(evt);
            }
        });

        jButton5.setText("Sq");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        jButton6.setText("R");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        jButton7.setText("Cr");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });

        jButton8.setText("Es");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });

        jToggleButton1.setText("Seleccionar");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(jButton7))
                .addComponent(BotonColor)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(94, 94, 94)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jLabel1)
                                .addComponent(BotonColor)
                                .addComponent(jToggleButton1))
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6)
                            .addComponent(jButton8))))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        posx= evt.getX();
        posy= evt.getY();
        switch (forma){
            case 0 : listaFormas.add(new Circulo(evt.getX(),evt.getY(), 1, colorElegido, true)); break;
            case 1 : listaFormas.add(new Triangulo(evt.getX(),evt.getY(), 1, 1, colorElegido, true)); break;
            case 2 : listaFormas.add(new Cuadrado(evt.getX(),evt.getY(), 1, 1, colorElegido, true)); break;
            case 3 : listaFormas.add(new Rombo(evt.getX(),evt.getY(), 1, 1, colorElegido, true)); break;
            case 4 : listaFormas.add(new Cruz(evt.getX(),evt.getY(), 1, 1, colorElegido, true)); break;
            case 5 : listaFormas.add(new Estrella(evt.getX(),evt.getY(), 1, 1, colorElegido, true)); break;
        }



//        if(chequeaPunto(evt.getX(),evt.getY())){
//            System.out.println("Hay algo");
//        }
//        else{
//        int radio = jSlider1.getValue();
//        switch (forma){
//            case 0 : listaFormas.add(new Circulo(evt.getX(),evt.getY(), radio, colorElegido, true)); break;
//            case 1 : listaFormas.add(new Triangulo(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 2 : listaFormas.add(new Cuadrado(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 3 : listaFormas.add(new Rombo(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 4 : listaFormas.add(new Cruz(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 5 : listaFormas.add(new Estrella(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//        }
//                }
        repaint();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
//        listaLineas.add(new Circulo(evt.getX(),evt.getY(), radio, Color.ORANGE, true));
//        listaNuevaCirculos.add(listaLineas);
        
        switch(forma){
            case 0:{
                Circulo aux = (Circulo) listaFormas.get(listaFormas.size() -1);
                int radio = 1;
                if(evt.getX() > (int) posx){
                    radio = (int) (evt.getX() - aux.x);
                    aux.width = radio;
                    aux.height = radio;
                }
                else{
                    radio = (int) (posx - aux.x);                                                      
                    aux.x = evt.getX();
                    aux.y = evt.getY();
                    aux.width = Math.abs(radio);
                    aux.height = Math.abs(radio);
                }
                
            }break;
                case 2:{
                Cuadrado aux = (Cuadrado) listaFormas.get(listaFormas.size() -1);
                int radio = 1;
                if(evt.getX() > (int) posx){
                    radio = (int) (evt.getX() - aux.xpoints[0]);
                    aux.ancho = radio;
                    aux.alto = radio;
                }
                else{
                    radio = (int) (posx - aux.xpoints[0]);                                                      
                    aux.xpoints[0] = evt.getX();
                    aux.ypoints[0] = evt.getY();
                    aux.ancho = Math.abs(radio);
                    aux.alto = Math.abs(radio);
                }
                
            }break;
        }
        
//        int radio = jSlider1.getValue();
//        switch (forma){
//            case 0 : listaFormas.add(new Circulo(evt.getX(),evt.getY(), radio, colorElegido, true)); break;
//            case 1 : listaFormas.add(new Triangulo(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 2 : listaFormas.add(new Cuadrado(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 3 : listaFormas.add(new Rombo(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 4 : listaFormas.add(new Cruz(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//            case 5 : listaFormas.add(new Estrella(evt.getX(),evt.getY(), radio, radio, colorElegido, true)); break;
//        }
//        
//        
        repaint();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        if(listaFormas.size() > 0){
            listaFormas.remove(listaFormas.size()-1);
            repaint();
        }
        
        
        
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
       listaFormas.clear();
       repaint();
    }//GEN-LAST:event_jButton2MousePressed

    private void jSlider1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MousePressed
        jLabel1.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1MousePressed

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
        jLabel1.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1MouseDragged

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        forma = 1;
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        forma = 0;
    }//GEN-LAST:event_jButton4MousePressed

    private void BotonColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonColorMousePressed
        jDialog1.setSize(800, 600);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_BotonColorMousePressed

    private void BotonAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAceptarMousePressed
        colorElegido = jColorChooser1.getColor();
        jDialog1.setVisible(false);
    }//GEN-LAST:event_BotonAceptarMousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        forma = 2;
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        forma = 3;
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        forma = 4;
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        forma = 5;
    }//GEN-LAST:event_jButton8MousePressed

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MousePressed
        if(seleccionar){
            seleccionar = false;
        }
        else{
            seleccionar = true;
        }
    }//GEN-LAST:event_jToggleButton1MousePressed

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
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
