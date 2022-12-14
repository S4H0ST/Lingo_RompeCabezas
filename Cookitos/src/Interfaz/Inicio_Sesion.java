
package Interfaz;

import java.awt.Color;

/**
 *
 * @author sohaib
 */
public class Inicio_Sesion extends javax.swing.JPanel {

    private String administrador;
    private String contrasena;
    
    //CONSTRUCTOR
    public Inicio_Sesion() {
        initComponents();
        this.administrador="Admin"; //PONGO UN ADMINISTRADOR DE PRUEBA
        this.contrasena="12345";   //PONGO UNA CONTRASEÑA DE PRUEBA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        EntrarSesion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INICIAR SESIÓN");

        IniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        IniciarSesion.setText("Inserte nombre de usuario");
        IniciarSesion.setBorder(null);
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IniciarSesionMousePressed(evt);
            }
        });
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTRASEÑA");

        Contrasena.setBackground(new java.awt.Color(255, 255, 255));
        Contrasena.setForeground(new java.awt.Color(102, 102, 102));
        Contrasena.setText("pon una contraseña");
        Contrasena.setToolTipText("");
        Contrasena.setBorder(null);
        Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContrasenaMousePressed(evt);
            }
        });
        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });

        EntrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        EntrarSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EntrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        EntrarSesion.setText("ENTRAR");
        EntrarSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        EntrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EntrarSesionMousePressed(evt);
            }
        });
        EntrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(EntrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(EntrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void IniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMousePressed
        if(IniciarSesion.getText().equals("Inserte nombre de usuario")){
        IniciarSesion.setText("");                  //cuando se pulsa se borra el texto que estuviera
        IniciarSesion.setForeground(Color.BLACK); //cuando se escriba las letras cambian a negro
        }
        
        if(String.valueOf(Contrasena.getPassword()).isEmpty()){//si no tiene nada escrito restaura con el texto original
        Contrasena.setText("pon una contraseña");
        Contrasena.setForeground(Color.GRAY);
        }
        
        
    }//GEN-LAST:event_IniciarSesionMousePressed

    private void ContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaMousePressed
        if(Contrasena.getText().equals("pon una contraseña")){ //solo deja entrar a esta condicion cuando el texto anterior sea el mismo
        Contrasena.setText(" ");                 //cuando se pulsa se borra el texto que estuviera
        Contrasena.setForeground(Color.BLACK);//cuando se escriba las letras cambian a negro
        }
        
         if(String.valueOf(IniciarSesion.getText()).isEmpty()){ //si no tiene nada escrito restaura con el texto original
          IniciarSesion.setText("Inserte nombre de usuario");
          IniciarSesion.setForeground(Color.GRAY);
         }
    }//GEN-LAST:event_ContrasenaMousePressed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void EntrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarSesionMousePressed
      //COMPARA SI ADMINISTRADOR CONCIDIE CON EL QUE EXISTE
        if(IniciarSesion.getText().equals(this.administrador)&&(Contrasena.getText().equals(this.contrasena))){
       javax.swing.JOptionPane.showMessageDialog(this,"Se inicio sesion con:"+ "\n"+ "Administrador : "+IniciarSesion.getText()+ "\n"+"Contraseña : "+ String.valueOf(Contrasena.getPassword()));
       }else{
           javax.swing.JOptionPane.showMessageDialog(this,"ERROR");
       
       }
    }//GEN-LAST:event_EntrarSesionMousePressed

    private void EntrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarSesionActionPerformed
        
        
        
    }//GEN-LAST:event_EntrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JButton EntrarSesion;
    private javax.swing.JTextField IniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
