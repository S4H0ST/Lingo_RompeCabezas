package Pack_Interfaz;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;


/**
 *
 * @author sohaib,Laura,Jose
 */
public class PruebaDeBloques extends javax.swing.JFrame {
    //atributos
    private String fraseCookitos;
    private ArrayList <JTextField> bloque;
    private int numIntentos; //para ver si son 5 o 6 intentos
    
    
   //CONSTRUCTOR
    public PruebaDeBloques() {
        initComponents();
        bloque = new ArrayList <>(); //CREAMOS UNA LISTA DE BLOQUES DONDE SE PONDRAN LOS CARACTERES
         setLocationRelativeTo(null);  // con esto se centra la ventana en el centro
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Yoshi.png")).getImage()); // Imagen en la esquina de la ventana
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        FraseTexto = new javax.swing.JTextField();
        ConfirmarTxt = new javax.swing.JButton();
        AtrasBoton = new javax.swing.JButton();
        NumIntentos = new javax.swing.JTextField();
        ConfirmarIntentos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        Titulo.setText("Cookitos");

        FraseTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FraseTextoActionPerformed(evt);
            }
        });
        FraseTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FraseTextoKeyTyped(evt);
            }
        });

        ConfirmarTxt.setText("Confirmar");
        ConfirmarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarTxtActionPerformed(evt);
            }
        });

        AtrasBoton.setText("Atras");
        AtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBotonActionPerformed(evt);
            }
        });

        NumIntentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumIntentosActionPerformed(evt);
            }
        });
        NumIntentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumIntentosKeyTyped(evt);
            }
        });

        ConfirmarIntentos.setText("Guardar");
        ConfirmarIntentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarIntentosActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingres numero de intentos");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FraseTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(ConfirmarTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(AtrasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(NumIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ConfirmarIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Titulo)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmarIntentos)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(AtrasBoton)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FraseTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmarTxt))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBotonActionPerformed
        Menu menuCookito = new Menu();
        menuCookito.setVisible(true);
    }//GEN-LAST:event_AtrasBotonActionPerformed


//BOTON CONFIRMAR PARA PROBAR TEXTO
    private void ConfirmarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarTxtActionPerformed
        this.fraseCookitos=FraseTexto.getText();
        int tamPalabra= fraseCookitos.length();
        jPanel.setPreferredSize(new Dimension(numIntentos, tamPalabra)); //tamaño del panel para que el flowLayout al acabar baje de linea
        
        //VAMOS A IR CREANDO Bloques Y AGREGANDOLOS A LA LISTA
        for(int indice =0; indice<tamPalabra;indice++){
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // vemos cuantos espacios reservamos
        String c = String.valueOf(fraseCookitos.charAt(indice));
        JTextField casillas=new JTextField(c);       // creamos bloques
        casillas.setBounds(100,100,30,30);
        jPanel.add(casillas);                      //añadimos el bloque a la lista
        bloque.add(casillas);                         //añadimos el bloque al panel
        jPanel.updateUI();
         
         
         }
        
        
        
    }//GEN-LAST:event_ConfirmarTxtActionPerformed

    private void FraseTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FraseTextoActionPerformed
        
    }//GEN-LAST:event_FraseTextoActionPerformed

    private void FraseTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FraseTextoKeyTyped
        //PONEMOS LIMITES A LAS FRASES QUE SE PUEDEN COLOCAR
       int key = evt.getKeyChar(); //para detectar los caracteres usados por el teclado
       boolean mayusculas = key >= 65 && key <= 90;
       boolean minusculas = key >= 97 && key <= 122;
       boolean espacio = key == 32;
       
     //para que solo deje usar caracteres validos y no numeros
     if (!(minusculas || mayusculas || espacio)) 
    {
        evt.consume();
    }
    }//GEN-LAST:event_FraseTextoKeyTyped

    private void NumIntentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumIntentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumIntentosActionPerformed

    private void ConfirmarIntentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarIntentosActionPerformed
        numIntentos=Integer.parseInt(NumIntentos.getText());
    }//GEN-LAST:event_ConfirmarIntentosActionPerformed

    private void NumIntentosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumIntentosKeyTyped
        int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57; 
   //para solo permitir ingresar numeros
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_NumIntentosKeyTyped

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
            java.util.logging.Logger.getLogger(PruebaDeBloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaDeBloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaDeBloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaDeBloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaDeBloques().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JButton ConfirmarIntentos;
    private javax.swing.JButton ConfirmarTxt;
    private javax.swing.JTextField FraseTexto;
    private javax.swing.JTextField NumIntentos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
