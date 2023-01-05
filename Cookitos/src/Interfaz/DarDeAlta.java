/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Pack_Jugador.Almacen_de_jugadores;
import Pack_Jugador.Jugador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sohaib, Jose, Laura
 */
public class DarDeAlta extends javax.swing.JPanel {

    private String nombre;
    private String clave;
    private Jugador j2;
    private Almacen_de_jugadores j1 = new Almacen_de_jugadores();
    
    
    public DarDeAlta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DarAltaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonAlta = new javax.swing.JButton();
        CampoNombre = new javax.swing.JTextField();
        CampoClave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        DarAltaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Admin: Para dar de alta al usuario debes rellenar los siguientes campos:");

        BotonAlta.setText("Dar de alta");
        BotonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaActionPerformed(evt);
            }
        });

        CampoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreActionPerformed(evt);
            }
        });

        CampoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoClaveActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CONTRASEÑA");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NOMBRE DE USUARIO");

        javax.swing.GroupLayout DarAltaPanelLayout = new javax.swing.GroupLayout(DarAltaPanel);
        DarAltaPanel.setLayout(DarAltaPanelLayout);
        DarAltaPanelLayout.setHorizontalGroup(
            DarAltaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DarAltaPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(DarAltaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DarAltaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAlta)
                .addGap(204, 204, 204))
        );
        DarAltaPanelLayout.setVerticalGroup(
            DarAltaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DarAltaPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BotonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DarAltaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DarAltaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void CampoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoClaveActionPerformed

    private void BotonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaActionPerformed
        
        if (CampoNombre.getText()!= null && CampoClave.getText() != null){
           
            this.nombre=String.valueOf(CampoNombre.getText());
             this.clave=String.valueOf(CampoClave.getText());
             this.j2=new Jugador(this.nombre,this.clave);
             j1.alta(j2);
             
            try {
                j1.serializar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DarDeAlta.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                j1.deserializar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DarDeAlta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
        
    }//GEN-LAST:event_BotonAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAlta;
    private javax.swing.JTextField CampoClave;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JPanel DarAltaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
