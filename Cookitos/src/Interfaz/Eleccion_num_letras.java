package Interfaz;

import Pack_Jugador.Jugador;
import Pack_Palabra.Palabra;
import Pack_Partida.Marcador;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jose Manuel
 */
public class Eleccion_num_letras extends javax.swing.JPanel {

    private Palabra clase_palabra;
    private final Marcador marcador_jugadores = new Marcador();
//    private Jugador jugador_1;
//    private Jugador jugador_2;
    public Eleccion_num_letras() {
        initComponents();
        
        
//        this.jugador_1 = jugador1;
//        this.jugador_2 = jugador2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_letras = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cinco = new javax.swing.JRadioButton();
        seis = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        cinco.setText("Jugar con cinco letras.");

        seis.setText("Jugar con seis letras.");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seis))
                        .addGap(239, 239, 239))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(cinco)
                .addGap(26, 26, 26)
                .addComponent(seis)
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.clase_palabra = new Palabra(); // en el propio constructor se añade una palabra aleatoria

        grupo_letras.add(cinco);
        grupo_letras.add(seis);

        if (cinco.isSelected()) {
            this.clase_palabra.setPalabra(1,0);
            PartidaCinco p5 = new PartidaCinco(clase_palabra,marcador_jugadores); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
            this.MostrarPanel(p5);
        } else if (seis.isSelected()) {
            this.clase_palabra.setPalabra(2,0);
            Partida_seis p6 = new Partida_seis(clase_palabra,marcador_jugadores); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
            this.MostrarPanel(p6);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "NO SE HA SELECCIONADO NÚMERO DE LETRAS"); //si los datos incorrectos salta pestaña de error
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void MostrarPanel(JPanel p) {
        p.setSize(650, 380);
        p.setLocation(0, 0);
        jPanel1.removeAll();
        jPanel1.add(p, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        p.setFocusable(true);
        p.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cinco;
    private javax.swing.ButtonGroup grupo_letras;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton seis;
    // End of variables declaration//GEN-END:variables
}
