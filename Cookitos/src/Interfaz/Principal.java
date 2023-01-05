package Interfaz;

import Pack_Palabra.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * @author sohaib, Jose, Laura
 */
//PRINCIPAL ES NUESTRA JFRAME MAIN, ES DECIR LA PESTAÑA PRINCIPAL-----------------------------------
public class Principal extends javax.swing.JFrame {
private Palabra clase_palabra;

    public Principal() {
        initComponents();
        TituloPartida.setVisible(false); //
        Inicio_Sesion nombre = new Inicio_Sesion(); // CREO UN OBJETO DE TIPO PANEL
        this.MostrarPanel(nombre); //USO EL METODO PARA QUE NADAMAS INCIAR SALTE LA PESTAÑA de inicio sesion
        this.setLocationRelativeTo(null);  //COLOCAR PESTAÑA EN EL CENTRO DE LA PANTALLA
         //seleccionar una palabra aleatoria
        this.clase_palabra=new Palabra(); // en el propio constructor se añade una palabra aleatoria

    }

    //METODO PARA MOSTRAR LOS PANELES (LOS INTERFACES QUE HAY)
    public void MostrarPanel(JPanel p) {
        p.setSize(500, 380);
        p.setLocation(0, 0);
        PanelDeCambio.removeAll();
        PanelDeCambio.add(p, BorderLayout.CENTER);
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
        PanelSeisLetras = new javax.swing.JPanel();
        SeisLetras = new javax.swing.JLabel();
        VolverPanel = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JLabel();
        PanelBotonEntrenamiento1 = new javax.swing.JPanel();
        Laboratorio = new javax.swing.JLabel();
        PanelCincoLetras = new javax.swing.JPanel();
        CincoLetras = new javax.swing.JLabel();
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
        BarraDeConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BarraDeConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BarraDeConfigMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OPCIONES ");

        PanelSeisLetras.setBackground(new java.awt.Color(0, 0, 0));
        PanelSeisLetras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelSeisLetrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelSeisLetrasMouseExited(evt);
            }
        });

        SeisLetras.setBackground(new java.awt.Color(0, 0, 0));
        SeisLetras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SeisLetras.setForeground(new java.awt.Color(255, 255, 255));
        SeisLetras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeisLetras.setText("Partida 6");
        SeisLetras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeisLetrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelSeisLetrasLayout = new javax.swing.GroupLayout(PanelSeisLetras);
        PanelSeisLetras.setLayout(PanelSeisLetrasLayout);
        PanelSeisLetrasLayout.setHorizontalGroup(
            PanelSeisLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSeisLetrasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SeisLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSeisLetrasLayout.setVerticalGroup(
            PanelSeisLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSeisLetrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SeisLetras))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VolverPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        VolverPanelLayout.setVerticalGroup(
            VolverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonEntrenamiento1.setBackground(new java.awt.Color(0, 0, 0));
        PanelBotonEntrenamiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBotonEntrenamiento1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBotonEntrenamiento1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBotonEntrenamiento1MouseExited(evt);
            }
        });

        Laboratorio.setBackground(new java.awt.Color(0, 0, 0));
        Laboratorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Laboratorio.setForeground(new java.awt.Color(255, 255, 255));
        Laboratorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Laboratorio.setText("Laboratorio");
        Laboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaboratorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonEntrenamiento1Layout = new javax.swing.GroupLayout(PanelBotonEntrenamiento1);
        PanelBotonEntrenamiento1.setLayout(PanelBotonEntrenamiento1Layout);
        PanelBotonEntrenamiento1Layout.setHorizontalGroup(
            PanelBotonEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonEntrenamiento1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Laboratorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonEntrenamiento1Layout.setVerticalGroup(
            PanelBotonEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Laboratorio)
        );

        PanelCincoLetras.setBackground(new java.awt.Color(0, 0, 0));
        PanelCincoLetras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCincoLetrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCincoLetrasMouseExited(evt);
            }
        });

        CincoLetras.setBackground(new java.awt.Color(0, 0, 0));
        CincoLetras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CincoLetras.setForeground(new java.awt.Color(255, 255, 255));
        CincoLetras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CincoLetras.setText("Partida 5");
        CincoLetras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CincoLetrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCincoLetrasLayout = new javax.swing.GroupLayout(PanelCincoLetras);
        PanelCincoLetras.setLayout(PanelCincoLetrasLayout);
        PanelCincoLetrasLayout.setHorizontalGroup(
            PanelCincoLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCincoLetrasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(CincoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCincoLetrasLayout.setVerticalGroup(
            PanelCincoLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CincoLetras, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout BarraDeConfigLayout = new javax.swing.GroupLayout(BarraDeConfig);
        BarraDeConfig.setLayout(BarraDeConfigLayout);
        BarraDeConfigLayout.setHorizontalGroup(
            BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraDeConfigLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43))
            .addComponent(PanelCincoLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBotonEntrenamiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BarraDeConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VolverPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelSeisLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BarraDeConfigLayout.setVerticalGroup(
            BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraDeConfigLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(PanelBotonEntrenamiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(PanelCincoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(PanelSeisLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(TituloPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TituloPartida)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void BotonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseClicked
        Inicio_Sesion inicio = new Inicio_Sesion(); // CREO UN OBEJTO PANEL DE INICIO_SESION
        this.MostrarPanel(inicio); //MUESTRO POR PANTALLA AL PULSAR EL BOTON DEL INICIO SESION
        TituloPartida.setVisible(false);

    }//GEN-LAST:event_BotonVolverMouseClicked

    private void VolverPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverPanelMouseEntered
        VolverPanel.setBackground(Color.GRAY);
    }//GEN-LAST:event_VolverPanelMouseEntered

    private void VolverPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverPanelMouseExited
        VolverPanel.setBackground(Color.BLACK);
    }//GEN-LAST:event_VolverPanelMouseExited

    private void CincoLetrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CincoLetrasMouseClicked
        // TituloPartida.setVisible(true);
        //Partida_cinco p5 = new Partida_cinco(); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
        //this.MostrarPanel(p5); //MUESTRO POR PANTALLA AL PULSAR EL BOTON LA PARTIDA_CINCO 
    }//GEN-LAST:event_CincoLetrasMouseClicked

    private void PanelCincoLetrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCincoLetrasMouseEntered
        PanelCincoLetras.setBackground(Color.GRAY);
    }//GEN-LAST:event_PanelCincoLetrasMouseEntered

    private void PanelCincoLetrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCincoLetrasMouseExited
       PanelCincoLetras.setBackground(Color.BLACK);
    }//GEN-LAST:event_PanelCincoLetrasMouseExited

    private void SeisLetrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeisLetrasMouseClicked
//         TituloPartida.setVisible(true);
//        Partida_seis p6 = new Partida_seis(); // CREO UN OBEJTO PANEL DE PARTIDA_seis
//        this.MostrarPanel(p6); //MUESTRO POR PANTALLA AL PULSAR EL BOTON LA PARTIDA_seis
    }//GEN-LAST:event_SeisLetrasMouseClicked

    private void PanelSeisLetrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSeisLetrasMouseEntered
        PanelSeisLetras.setBackground(Color.GRAY);
    }//GEN-LAST:event_PanelSeisLetrasMouseEntered

    private void PanelSeisLetrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSeisLetrasMouseExited
PanelSeisLetras.setBackground(Color.BLACK);    }//GEN-LAST:event_PanelSeisLetrasMouseExited

    private void BarraDeConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraDeConfigMouseEntered
    
    }//GEN-LAST:event_BarraDeConfigMouseEntered

    private void BarraDeConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraDeConfigMouseExited
     
    }//GEN-LAST:event_BarraDeConfigMouseExited

    private void LaboratorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaboratorioMouseClicked
         //seleccionar una palabra aleatoria
       this.clase_palabra.setPalabraRandom(); // en el propio constructor se añade una palabra aleatoria
        System.out.println(this.clase_palabra.getPalabraRandom());
       if(this.clase_palabra.getPalabraRandom().length()==5){
        TituloPartida.setVisible(true);
        Partida_cinco p5 = new Partida_cinco(clase_palabra); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
        this.MostrarPanel(p5); //MUESTRO POR PANTALLA AL PULSAR EL BOTON LA PARTIDA_CINCO 
       }else if(this.clase_palabra.getPalabraRandom().length()==6){
        TituloPartida.setVisible(true);
        Partida_seis p6 = new Partida_seis(clase_palabra); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
        this.MostrarPanel(p6); //MUESTRO POR PANTALLA AL PULSAR EL BOTON LA PARTIDA_CINCO */
       } 
    }//GEN-LAST:event_LaboratorioMouseClicked
    public Palabra get_palabra_aleatoria(){
        return this.clase_palabra;
    }
    private void PanelBotonEntrenamiento1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonEntrenamiento1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBotonEntrenamiento1MouseEntered

    private void PanelBotonEntrenamiento1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonEntrenamiento1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBotonEntrenamiento1MouseExited

    private void PanelBotonEntrenamiento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonEntrenamiento1MouseClicked
         
    }//GEN-LAST:event_PanelBotonEntrenamiento1MouseClicked

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
    private javax.swing.JLabel CincoLetras;
    private javax.swing.JLabel Laboratorio;
    private javax.swing.JPanel PanelBotonEntrenamiento1;
    private javax.swing.JPanel PanelCincoLetras;
    private javax.swing.JPanel PanelDeCambio;
    private javax.swing.JPanel PanelSeisLetras;
    private javax.swing.JLabel SeisLetras;
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
