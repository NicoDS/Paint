/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Administrator
 */
public class VentanaDibujo extends javax.swing.JFrame {
    
    private static int DIMENSION_ARRAY = 8;
    
    BufferedImage buffer = null;
    BufferedImage[] undo = new BufferedImage[DIMENSION_ARRAY];
    int indice = 0;
    
    
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
        int i = 0;
        while(i < undo.length){
            undo[i] = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
            undo[i].createGraphics();
            g2 = (Graphics2D) undo[i].getGraphics();
            g2.setColor(Color.white);
            g2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
            i++;
        }
    }
    
    private int calculaBuffer(int n){
        if(n % DIMENSION_ARRAY < DIMENSION_ARRAY){
            return n % DIMENSION_ARRAY;
        }
        else{
            return 0;
        }
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        
        
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(undo[calculaBuffer(indice)], 0, 0, jPanel1.getWidth(), jPanel1.getHeight(), null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(675, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        Ellipse2D.Double circulo = new Ellipse2D.Double(evt.getX() - 20, evt.getY() - 20, 40, 40);
        Graphics2D g2 = (Graphics2D) undo[calculaBuffer(indice +1)].getGraphics();
        g2.drawImage(undo[calculaBuffer(indice)], 0, 0, jPanel1.getWidth(), jPanel1.getHeight(), null);
        g2.fill(circulo);
        indice++;
        repaint();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
//        Ellipse2D.Double circulo = new Ellipse2D.Double(evt.getX() - 20, evt.getY() - 20, 40, 40);
//        Graphics2D g2 = (Graphics2D) undo[indice].getGraphics();
//        g2.fill(circulo);
//        repaint();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        if(calculaBuffer(indice) == 0){
            
        }
        else{
            indice--;
        }
        repaint();
        
        
    }//GEN-LAST:event_jButton1MousePressed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
