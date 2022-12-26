
package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * @author sohaib
 */

//PRINCIPAL ES NUESTRA JFRAME MAIN, ES DECIR LA PESTAÑA PRINCIPAL-----------------------------------
public class Principal extends javax.swing.JFrame {
   
    
    public Principal() {
        initComponents();
        TituloPartida.setVisible(false); //
        Inicio_Sesion nombre=new Inicio_Sesion(); // CREO UN OBJETO DE TIPO PANEL
        this.MostrarPanel(nombre); //USO EL METODO PARA QUE NADAMAS INCIAR SALTE LA PESTAÑA de inicio sesion
        this.setLocationRelativeTo(null);  //COLOCAR PESTAÑA EN EL CENTRO DE LA PANTALLA
        
        
        
    }
    
      //METODO PARA MOSTRAR LOS PANELES (LOS INTERFACES QUE HAY)
   public void MostrarPanel(JPanel p){ 
       p.setSize(500, 380);
       p.setLocation(0,0);
       PanelDeCambio.removeAll();
       PanelDeCambio.add(p,BorderLayout.CENTER);
       PanelDeCambio.revalidate();
       PanelDeCambio.repaint();
       p.setFocusable(true); 
       p.grabFocus();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        BarraDeConfig = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelBotonPartida = new javax.swing.JPanel();
        DemoBoton = new javax.swing.JLabel();
        VolverPanel = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TituloPartida = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelDeCambio = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraDeConfig.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OPCIONES ");

        PanelBotonPartida.setBackground(new java.awt.Color(0, 0, 0));
        PanelBotonPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBotonPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBotonPartidaMouseExited(evt);
            }
        });

        DemoBoton.setBackground(new java.awt.Color(0, 0, 0));
        DemoBoton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DemoBoton.setForeground(new java.awt.Color(255, 255, 255));
        DemoBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DemoBoton.setText("Demo");
        DemoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DemoBotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonPartidaLayout = new javax.swing.GroupLayout(PanelBotonPartida);
        PanelBotonPartida.setLayout(PanelBotonPartidaLayout);
        PanelBotonPartidaLayout.setHorizontalGroup(
            PanelBotonPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonPartidaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(DemoBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonPartidaLayout.setVerticalGroup(
            PanelBotonPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonPartidaLayout.createSequentialGroup()
                .addComponent(DemoBoton)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        VolverPanel.setBackground(new java.awt.Color(0, 0, 0));
        VolverPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VolverPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VolverPanelMouseExited(evt);
            }
        });

        BotonVolver.setBackground(new java.awt.Color(0, 0, 0));
        BotonVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(255, 255, 255));
        BotonVolver.setText("Volver");
        BotonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VolverPanelLayout = new javax.swing.GroupLayout(VolverPanel);
        VolverPanel.setLayout(VolverPanelLayout);
        VolverPanelLayout.setHorizontalGroup(
            VolverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolverPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(BotonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VolverPanelLayout.setVerticalGroup(
            VolverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BarraDeConfigLayout = new javax.swing.GroupLayout(BarraDeConfig);
        BarraDeConfig.setLayout(BarraDeConfigLayout);
        BarraDeConfigLayout.setHorizontalGroup(
            BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotonPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraDeConfigLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraDeConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BarraDeConfigLayout.setVerticalGroup(
            BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraDeConfigLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(PanelBotonPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(VolverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Background.add(BarraDeConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 440));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        TituloPartida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloPartida.setForeground(new java.awt.Color(255, 255, 255));
        TituloPartida.setText("PARTIDA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(TituloPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloPartida)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 500, 60));

        jPanel5.setBackground(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LINGO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(600, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        Background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 30));

        PanelDeCambio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDeCambioLayout = new javax.swing.GroupLayout(PanelDeCambio);
        PanelDeCambio.setLayout(PanelDeCambioLayout);
        PanelDeCambioLayout.setHorizontalGroup(
            PanelDeCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PanelDeCambioLayout.setVerticalGroup(
            PanelDeCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        Background.add(PanelDeCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 500, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DemoBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DemoBotonMouseClicked
        TituloPartida.setVisible(true);
        Partida_cinco p5=new Partida_cinco(); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
      this.MostrarPanel(p5); //MUESTRO POR PANTALLA AL PULSAR EL BOTON LA PARTIDA_CINCO 
      
      
    }//GEN-LAST:event_DemoBotonMouseClicked

    private void BotonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseClicked
        Inicio_Sesion inicio=new Inicio_Sesion(); // CREO UN OBEJTO PANEL DE INICIO_SESION
       this.MostrarPanel(inicio); //MUESTRO POR PANTALLA AL PULSAR EL BOTON DEL INICIO SESION
       TituloPartida.setVisible(false);
       
    }//GEN-LAST:event_BotonVolverMouseClicked
   
    private void PanelBotonPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonPartidaMouseEntered
        PanelBotonPartida.setBackground(Color.GRAY);
    }//GEN-LAST:event_PanelBotonPartidaMouseEntered

    private void PanelBotonPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonPartidaMouseExited
        PanelBotonPartida.setBackground(Color.BLACK);
    }//GEN-LAST:event_PanelBotonPartidaMouseExited

    private void VolverPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverPanelMouseEntered
        VolverPanel.setBackground(Color.GRAY);
    }//GEN-LAST:event_VolverPanelMouseEntered

    private void VolverPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverPanelMouseExited
        VolverPanel.setBackground(Color.BLACK);
    }//GEN-LAST:event_VolverPanelMouseExited

    
    
    //MAIN DE LA INTERFAZ
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BarraDeConfig;
    private javax.swing.JLabel BotonVolver;
    private javax.swing.JLabel DemoBoton;
    private javax.swing.JPanel PanelBotonPartida;
    private javax.swing.JPanel PanelDeCambio;
    private javax.swing.JLabel TituloPartida;
    private javax.swing.JPanel VolverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
