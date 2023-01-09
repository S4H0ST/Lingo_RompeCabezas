/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;



import Pack_Config.Almacen_Configuracion;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author sohaib
 */
public class Config_Jugador extends javax.swing.JPanel implements Serializable  {

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
        VolverOpPar = new javax.swing.JButton();
        VerFichero = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pizarra = new javax.swing.JTextArea();

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
        BDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDarDeBajaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Opciones de Jugador");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        VolverOpPar.setText("Volver");
        VolverOpPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverOpParActionPerformed(evt);
            }
        });

        VerFichero.setText("Ver Fichero");
        VerFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerFicheroActionPerformed(evt);
            }
        });

        pizarra.setColumns(20);
        pizarra.setRows(5);
        jScrollPane1.setViewportView(pizarra);

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
                            .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(PanelJugadorLayout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BDarDeBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BDarDeAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(VerFichero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VolverOpPar)))
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
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                        .addComponent(BDarDeAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BDarDeBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VerFichero))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(VolverOpPar)
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
       DarDeAlta Alta=new DarDeAlta();
        this.MuestraPanel(Alta);            
        
        
        
        
    }//GEN-LAST:event_BDarDeAltaActionPerformed

    private void VolverOpParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverOpParActionPerformed
        Config_ partida=new Config_();
        this.MuestraPanel(partida);
    }//GEN-LAST:event_VolverOpParActionPerformed

    private void VerFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerFicheroActionPerformed
        
        //CON ESTO PODEMOS VER LO QUE HAY EN EL FICHERO DE CONFIGURACION Y PODEMOS VER COSAS ESPECIFICAS----------------------------
        try {       
            ObjectInputStream cargaFichero = new ObjectInputStream(new FileInputStream("Fichero_Configuracion.txt"));
            Almacen_Configuracion infoConfig;
            
            infoConfig = (Almacen_Configuracion)cargaFichero.readObject(); //COMO EL FICHERO TIENE CONTANIDO DE TIPO ALMACEN DE CONFIGURACION HACEMOS UN CASTING PARA METERLO EN OTRO OBJETO Y SACARLO
            pizarra.setText(infoConfig.toString()); //USAMOS EL METODO TO STRING DE LA CLASE ALMACEN PARA SACAR LO QUE QUEREMOS VER
            System.out.println("\n"+infoConfig.toString());
            cargaFichero.close();
        } catch (IOException ex) {
            Logger.getLogger(Config_Jugador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Config_Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VerFicheroActionPerformed

    private void BDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDarDeBajaActionPerformed
        DarDeBaja baja=new DarDeBaja();
        this.MuestraPanel(baja);     
    }//GEN-LAST:event_BDarDeBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDarDeAlta;
    private javax.swing.JButton BDarDeBaja;
    private javax.swing.JPanel PanelJugador;
    private javax.swing.JButton VerFichero;
    private javax.swing.JButton VolverOpPar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea pizarra;
    // End of variables declaration//GEN-END:variables
}
