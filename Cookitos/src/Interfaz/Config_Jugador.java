/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;



import javax.swing.JPanel;

/**
 *
 * @author sohaib
 */
public class Config_Jugador extends javax.swing.JPanel  {

    public Config_Jugador() {
        initComponents();
       
    }

    //METODO PARA MOSTRAR PANEL
    public void MuestraPanel(JPanel p){ 
       p.setLocation(0,0);
       p.setSize(500,380);
       PanelJugador.removeAll();
       PanelJugador.add(p);
       PanelJugador.revalidate();
       PanelJugador.repaint();
       p.setFocusable(true); //mirar
       p.grabFocus();
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelJugador = new javax.swing.JPanel();
        BDarDeAlta = new javax.swing.JButton();
        BDarDeBaja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        PanelJugador.setBackground(new java.awt.Color(255, 255, 255));

        BDarDeAlta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BDarDeAlta.setForeground(new java.awt.Color(0, 0, 0));
        BDarDeAlta.setText("Dar de Alta");
        BDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDarDeAltaActionPerformed(evt);
            }
        });

        BDarDeBaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BDarDeBaja.setForeground(new java.awt.Color(0, 0, 0));
        BDarDeBaja.setText("Dar de baja");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Opciones de Jugador");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver Fichero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelJugadorLayout = new javax.swing.GroupLayout(PanelJugador);
        PanelJugador.setLayout(PanelJugadorLayout);
        PanelJugadorLayout.setHorizontalGroup(
            PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadorLayout.createSequentialGroup()
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelJugadorLayout.createSequentialGroup()
                                    .addGap(304, 304, 304)
                                    .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BDarDeBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BDarDeAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        PanelJugadorLayout.setVerticalGroup(
            PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BDarDeAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BDarDeBaja)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDarDeAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDarDeAltaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Config_ partida=new Config_();
        this.MuestraPanel(partida);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    
        
       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDarDeAlta;
    private javax.swing.JButton BDarDeBaja;
    private javax.swing.JPanel PanelJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
